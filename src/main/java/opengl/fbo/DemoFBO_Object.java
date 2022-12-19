package opengl.fbo;

import jdk.incubator.foreign.*;
import opengl.GL;
import opengl.macos.GL_macOS_10_15_3;
import opengl.macos.v10_15_3.glut_h;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.ResourceScope.newImplicitScope;
import static opengl.macos.v10_15_3.glut_h.*;

/**
 * https://github.com/jzy3d/panama-gl/issues/5
 */
// VM ARGS : -XstartOnFirstThread --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign -Djava.library.path=.:/System/Library/Frameworks/OpenGL.framework/Versions/Current/Libraries/
public class DemoFBO_Object {

  public static void main(String[] args) {
    GL gl = new GL_macOS_10_15_3();

    // We need to open an invisible window for OpenGL to have a context
    gl.glutInit(0, 0);
    gl.glutInitDisplayMode(0);
    gl.glutInitWindowSize(1, 1);
    gl.glutInitWindowPosition(-1, -1);
    gl.glutCreateWindow("InvisiblePanamaGLWindowForGLContext");

    //https://openjdk.org/jeps/412

    //RGBA8 2D texture, 24 bit depth texture, 256x256

    int[] texIds = gl.glGenTextures(1);
    int colorTexId = texIds[0];
    System.out.println("Got texture ID : " + colorTexId);

    gl.glBindTexture(glut_h.GL_TEXTURE_2D(), colorTexId);

    gl.glTexParameteri(gl.GL_TEXTURE_2D(), gl.GL_TEXTURE_WRAP_S(), gl.GL_REPEAT());
    gl.glTexParameteri(gl.GL_TEXTURE_2D(), gl.GL_TEXTURE_WRAP_T(), gl.GL_REPEAT());
    gl.glTexParameteri(gl.GL_TEXTURE_2D(), gl.GL_TEXTURE_MIN_FILTER(), gl.GL_NEAREST());
    gl.glTexParameteri(gl.GL_TEXTURE_2D(), gl.GL_TEXTURE_MAG_FILTER(), gl.GL_NEAREST());

    //NULL means reserve texture memory, but texels are undefined
    int level = 0;
    int width = 256;
    int height = 256;
    int border = 0;
    int format = GL_BGRA();

    MemorySegment pixels = MemorySegment.allocateNative(width*height*4, newImplicitScope());

    gl.glTexImage2D(gl.GL_TEXTURE_2D(), 0, gl.GL_RGBA8(), width, height, border, gl.GL_BGRA(), gl.GL_UNSIGNED_BYTE(), pixels);

    //-------------------------
    MemorySegment fb = MemorySegment.allocateNative(4, newImplicitScope());
    gl.glGenFramebuffersEXT(1, fb);
    VarHandle intHandle = MemoryHandles.varHandle(int.class, ByteOrder.nativeOrder());

    int fbId = (int)intHandle.get(fb, /* offset */ 0);
    System.out.println("Got FB ID : " + fbId);
    gl.glBindFramebufferEXT(gl.GL_FRAMEBUFFER_EXT(), fbId);

    //Attach 2D texture to this FBO
    gl.glFramebufferTexture2DEXT(gl.GL_FRAMEBUFFER_EXT(), gl.GL_COLOR_ATTACHMENT0_EXT(), gl.GL_TEXTURE_2D(), colorTexId, 0);

    //-------------------------
    MemorySegment depthRb = MemorySegment.allocateNative(4, newImplicitScope());
    gl.glGenRenderbuffersEXT(1, depthRb);
    int depthRbId = (int)intHandle.get(depthRb, /* offset */ 0);
    System.out.println("Got RenderBuffer ID : " + depthRbId);

    gl.glBindRenderbufferEXT(gl.GL_RENDERBUFFER_EXT(), depthRbId);
    gl.glRenderbufferStorageEXT(gl.GL_RENDERBUFFER_EXT(), gl.GL_DEPTH_COMPONENT24(), width, height);

    //-------------------------
    //Attach depth buffer to FBO
    gl.glFramebufferRenderbufferEXT(gl.GL_FRAMEBUFFER_EXT(), gl.GL_DEPTH_ATTACHMENT_EXT(), gl.GL_RENDERBUFFER_EXT(), depthRbId);

    //-------------------------
    //Does the GPU support current FBO configuration?
    int status;
    status = gl.glCheckFramebufferStatusEXT(gl.GL_FRAMEBUFFER_EXT());

    int GL_FRAMEBUFFER_COMPLETE = 36053; // From GL3 spec
    //GL_FRAMEBUFFER_COMPLETE_EXT():

    if(status ==GL_FRAMEBUFFER_COMPLETE){
        System.out.println("good framebuffer status!!!");
    }
    else{
      System.err.println("error with framebuffer : " + status);
    }

    //-------------------------
    //and now you can render to GL_TEXTURE_2D
    gl.glBindFramebufferEXT(gl.GL_FRAMEBUFFER_EXT(), fbId);
    gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
    gl.glClearDepth(1.0f);
    gl.glClear(GL_COLOR_BUFFER_BIT() | GL_DEPTH_BUFFER_BIT());

    //-------------------------
    sceneDemo();

    //-------------------------

    BufferedImage out = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

    //int type = GL_UNSIGNED_BYTE();
    int type = gl.GL_BYTE(); // signed byte for reading pixels
    int channels = 4; // RGBA
    int nPixels = width * height;
    int nBytes = nPixels * channels;

    MemorySegment pixelsRead = MemorySegment.allocateNative(nBytes, newImplicitScope());

    gl.glReadPixels(0, 0, width, height, format, type, pixelsRead);
    //pixels 0, 1, 2 should be white
    //pixel 4 should be black

    fromBGRABufferToImage(width, height, channels, pixelsRead, out);

    //pixelsRead.
    try {
      ImageIO.write(out, "png", new File("target/out.png"));

    }catch(Exception e){e.printStackTrace();}

    //----------------
    //Bind 0, which means render to back buffer
    glBindFramebufferEXT(GL_FRAMEBUFFER_EXT(), 0);
  }

  private static void sceneDemo() {
    glViewport(0, 0, 256, 256);
    glMatrixMode(GL_PROJECTION());
    glLoadIdentity();
    glOrtho(0.0, 256.0, 0.0, 256.0, -1.0, 1.0);
    glMatrixMode(GL_MODELVIEW());
    glLoadIdentity();

    //-------------------------
    glDisable(GL_TEXTURE_2D());
    glDisable(GL_BLEND());
    glEnable(GL_DEPTH_TEST());

    //-------------------------
    //**************************
    //RenderATriangle, {0.0, 0.0}, {256.0, 0.0}, {256.0, 256.0}
    //Read http://www.opengl.org/wiki/VBO_-_just_examples
    //RenderATriangle();

    glut_h.glBegin(glut_h.GL_TRIANGLES());
    //glut_h.glBegin(glut_h.GL_POINT());
    glut_h.glVertex2f(0,0);
    glut_h.glColor3f(1,0,0);
    glut_h.glVertex2f(256,0);
    glut_h.glColor3f(0,1,0);
    glut_h.glVertex2f(256,256);
    glut_h.glColor3f(0,0,1);
    glut_h.glEnd();
  }

  private static void fromBGRABufferToImage(int width, int height, int channels, MemorySegment pixelsBuffer, BufferedImage out) {

    int nPixels = width * height;
    int k = 0;

    // TODO : Use pixelsRead.toByteArray / toIntArray instead
    VarHandle byteHandle = MemoryHandles.varHandle(byte.class, ByteOrder.nativeOrder());

    for(int i = 0; i< nPixels*channels; i+= channels){
        byte byB = (byte) byteHandle.get(pixelsBuffer, i);
        byte byG = (byte) byteHandle.get(pixelsBuffer, i+1);
        byte byR = (byte) byteHandle.get(pixelsBuffer, i+2);
        byte byA = (byte) byteHandle.get(pixelsBuffer, i+3);
        byte non = 0;
        byte one = (byte)0xff;
        int rgba = RGBAtoI(byR, byG, byB, one);
        //int rgba = RGBAtoI(non, non, byB, yes);

        // Pixel position
        int h = k % width;
        int w = k / width;

        out.setRGB(w, h, rgba);

        // Console out
        boolean console = false;

        if(console) {
          int intB = BtoI(byB);
          int intG = BtoI(byG);
          int intR = BtoI(byR);
          int intA = BtoI(byA);

          int red = ItoR(intR);
          int green = ItoG(intG);
          int blue = ItoB(intB);
          int alpha = ItoA(intA);

          org.jzy3d.colors.Color c = new org.jzy3d.colors.Color(red, green, blue, 255);
          System.out.println(w + "," + h + " : " + c);
        }
        k++;
      }
  }

  private static void toImageWrong(int width, int nPixels, MemorySegment pixelsRead, BufferedImage out) {
    VarHandle byteHandle = MemoryHandles.varHandle(byte.class, ByteOrder.nativeOrder());

    int k = 0;
    for(int i = 0; i< nPixels; i+=1){
        byte byB = (byte) byteHandle.get(pixelsRead, i);
        /*byte byG = (byte)byteHandle.get(pixelsRead, i+1);
        byte byR = (byte)byteHandle.get(pixelsRead, i+2);
        byte byA = (byte)byteHandle.get(pixelsRead, i+3);
        int intB = BtoI(byB);
        int intG = BtoI(byB);
        int intR = BtoI(byB);
        int intA = BtoI(byB);
        int red = ItoR(intR);
        int green = ItoG(intG);
        int blue = ItoB(intB);
        int alpha = ItoA(intA);*/
        int rgba = RGBAtoI(byB, byB, byB, byB);


        int h = k% width;
        int w = k/ width;

        out.setRGB(w, h, rgba);

      //org.jzy3d.colors.Color c = new org.jzy3d.colors.Color(red, green, blue, 255);
      System.out.println(w + "," + h + " : " );

        k++;
    }
  }

  public static int BtoI(byte x) {
    return (x & 0xff);
  }

  public static int StoI(short x) {
    return (x & 0xffff);
  }

  public static int FtoI(float x) {
    return (int) (x * 255.0f);
  }

  public static float BtoF(byte x) {
    return (float) (x & 0xff) / 255.0f;
  }

  public static float ItoF(int x) {
    return (float) x / 255.0f;
  }

  public static int ItoR(int x) {
    return ((x & 0x00ff0000) >> 16);
  }

  public static int ItoG(int x) {
    return ((x & 0x0000ff00) >> 8);
  }

  public static int ItoB(int x) {
    return (x & 0x000000ff);
  }

  public static int ItoA(int x) {
    return (((x & 0xff000000) >> 24) & 0x000000ff);
  }

  public static int RGBAtoI(byte r, byte g, byte b, byte a) {
    return (((a & 0xff) << 24) | ((r & 0xff) << 16) | ((g & 0xff) << 8) | b);
  }

  public static int RGBAtoI(int r, int g, int b, int a) {
    return ((a << 24) | (r << 16) | (g << 8) | b);
  }

  public static int RGBAtoI(float r, float g, float b, float a) {
    return RGBAtoI(FtoI(r), FtoI(g), FtoI(b), FtoI(a));
  }

}
