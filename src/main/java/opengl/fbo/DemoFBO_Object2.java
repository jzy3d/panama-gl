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
public class DemoFBO_Object2 {

  public static void main(String[] args) {
    GL gl = new GL_macOS_10_15_3();

    // We need to open an invisible window for OpenGL to have a context
    /*gl.glutInit(0, 0);
    gl.glutInitDisplayMode(0);
    gl.glutInitWindowSize(1, 1);
    gl.glutInitWindowPosition(-1, -1);
    gl.glutCreateWindow("InvisiblePanamaGLWindowForGLContext");*/
    var scope = ResourceScope.newConfinedScope();
    var allocator = SegmentAllocator.ofScope(scope);
    var argc = allocator.allocate(C_INT, 0);

    // We need to open an invisible window for OpenGL to have a context
    glutInit(argc, argc);
    glutInitDisplayMode(GLUT_DOUBLE() | GLUT_RGB() | GLUT_DEPTH());
    glutInitWindowSize(1, 1);
    glutInitWindowPosition(-1, -1);
    glutCreateWindow(CLinker.toCString("Hello Panama!", scope));

    //-------------------------
    // Prepare VBO
    FBO fbo = new FBO();
    fbo.prepare(gl);

    //-------------------------
    // Render something
    sceneDemo();

    //-------------------------
    // Get image
    BufferedImage out = fbo.getImage(gl);

    //pixelsRead.
    try {
      ImageIO.write(out, "png", new File("target/outFBO.png"));

    } catch (Exception e) {
      e.printStackTrace();
    }




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
