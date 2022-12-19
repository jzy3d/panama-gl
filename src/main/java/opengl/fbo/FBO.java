package opengl.fbo;

import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemorySegment;
import opengl.ByteUtils;
import opengl.GL;
import opengl.macos.v10_15_3.glut_h;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;

import static jdk.incubator.foreign.ResourceScope.newImplicitScope;

/**
 * A frame buffer object, or {@link FBO}, can render OpenGL into an offscreen buffer
 * that can later be converted to a {@link BufferedImage}.
 *
 * Example from :
 * https://www.khronos.org/opengl/wiki/Framebuffer_Object_Extension_Examples#Quick_example,_render_to_texture_(2D)
 */
public class FBO {
    // default
    int level = 0;
    int width = 256;
    int height = 256;
    int border = 0;
    int channels = 4; // RGBA

    // undefined yes
    int format = -1;
    int internalFormat = -1;
    int textureFormat = -1;

    boolean debug = true;

    public void prepare(GL gl){
        format = gl.GL_BGRA();
        internalFormat = gl.GL_RGBA8();
        textureFormat = gl.GL_UNSIGNED_BYTE();

        // ------------------------
        // Generate TEXTURE
        int colorTexId = gl.glGenTextures(1)[0];

        if(debug)
            System.out.println("Got texture ID : " + colorTexId);

        // Bind texture and set parameters
        gl.glBindTexture(glut_h.GL_TEXTURE_2D(), colorTexId);
        gl.glTexParameteri(gl.GL_TEXTURE_2D(), gl.GL_TEXTURE_WRAP_S(), gl.GL_REPEAT());
        gl.glTexParameteri(gl.GL_TEXTURE_2D(), gl.GL_TEXTURE_WRAP_T(), gl.GL_REPEAT());
        gl.glTexParameteri(gl.GL_TEXTURE_2D(), gl.GL_TEXTURE_MIN_FILTER(), gl.GL_NEAREST());
        gl.glTexParameteri(gl.GL_TEXTURE_2D(), gl.GL_TEXTURE_MAG_FILTER(), gl.GL_NEAREST());

        // Create a texture to write to
        int byteSize = width * height * channels;
        MemorySegment pixels = MemorySegment.allocateNative(byteSize, newImplicitScope());

        gl.glTexImage2D(gl.GL_TEXTURE_2D(), level, internalFormat, width, height, border, format, textureFormat, pixels);

        //-------------------------
        // Generate FRAME buffer

        MemorySegment fb = MemorySegment.allocateNative(4, newImplicitScope());
        gl.glGenFramebuffersEXT(1, fb);
        VarHandle intHandle = MemoryHandles.varHandle(int.class, ByteOrder.nativeOrder());
        int fbId = (int)intHandle.get(fb, /* offset */ 0);

        if(debug)
            System.out.println("Got FB ID : " + fbId);

        // Bind frame buffer
        gl.glBindFramebufferEXT(gl.GL_FRAMEBUFFER_EXT(), fbId);

        //Attach 2D texture to this FBO
        gl.glFramebufferTexture2DEXT(gl.GL_FRAMEBUFFER_EXT(), gl.GL_COLOR_ATTACHMENT0_EXT(), gl.GL_TEXTURE_2D(), colorTexId, 0);

        //-------------------------
        // Generate RENDER buffer

        MemorySegment depthRb = MemorySegment.allocateNative(4, newImplicitScope());
        gl.glGenRenderbuffersEXT(1, depthRb);
        int depthRbId = (int)intHandle.get(depthRb, /* offset */ 0);

        if(debug)
            System.out.println("Got RenderBuffer ID : " + depthRbId);

        // Bind render buffer
        gl.glBindRenderbufferEXT(gl.GL_RENDERBUFFER_EXT(), depthRbId);
        gl.glRenderbufferStorageEXT(gl.GL_RENDERBUFFER_EXT(), gl.GL_DEPTH_COMPONENT24(), width, height);

        //-------------------------
        //Attach depth buffer to FBO

        gl.glFramebufferRenderbufferEXT(gl.GL_FRAMEBUFFER_EXT(), gl.GL_DEPTH_ATTACHMENT_EXT(), gl.GL_RENDERBUFFER_EXT(), depthRbId);

        //-------------------------
        //Does the GPU support current FBO configuration?

        int status = gl.glCheckFramebufferStatusEXT(gl.GL_FRAMEBUFFER_EXT());

        if(status!=gl.GL_FRAMEBUFFER_COMPLETE()){
            throw new RuntimeException("Incomplete framebuffer, not supporting current FBO config : " + status);
        }

        //-------------------------
        //and now you can render to GL_TEXTURE_2D

        gl.glBindFramebufferEXT(gl.GL_FRAMEBUFFER_EXT(), fbId);
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glClearDepth(1.0f);
        gl.glClear(gl.GL_COLOR_BUFFER_BIT() | gl.GL_DEPTH_BUFFER_BIT());
    }

    public BufferedImage getImage(GL gl) {
        BufferedImage out = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        int type = gl.GL_BYTE(); // signed byte for reading pixels
        int nPixels = width * height;
        int nBytes = nPixels * channels;

        MemorySegment pixelsRead = MemorySegment.allocateNative(nBytes, newImplicitScope());

        gl.glReadPixels(0, 0, width, height, format, type, pixelsRead);
        //pixels 0, 1, 2 should be white
        //pixel 4 should be black

        fromBGRABufferToImage(width, height, channels, pixelsRead, out);

        //----------------
        //Bind 0, which means render to back buffer
        gl.glBindFramebufferEXT(gl.GL_FRAMEBUFFER_EXT(), 0);

        return out;
    }

    /**
     * Read a BGRA pixel buffer and export its content to a BufferedImage.
     *
     * @param width width of the pixel buffer
     * @param height
     * @param channels number of color components (4 with alpha, 3 with only RGB)
     * @param pixelsBuffer
     * @param out
     */
    protected void fromBGRABufferToImage(int width, int height, int channels, MemorySegment pixelsBuffer, BufferedImage out) {
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
            int rgba = ByteUtils.RGBAtoI(byR, byG, byB, one);
            //int rgba = RGBAtoI(non, non, byB, yes);

            // Pixel position
            int h = k % width;
            int w = k / width;

            out.setRGB(w, h, rgba);

            // Console out
            boolean console = false;

            if(console) {
                int intB = ByteUtils.BtoI(byB);
                int intG = ByteUtils.BtoI(byG);
                int intR = ByteUtils.BtoI(byR);
                int intA = ByteUtils.BtoI(byA);

                int red = ByteUtils.ItoR(intR);
                int green = ByteUtils.ItoG(intG);
                int blue = ByteUtils.ItoB(intB);
                int alpha = ByteUtils.ItoA(intA);

                org.jzy3d.colors.Color c = new org.jzy3d.colors.Color(red, green, blue, 255);
                System.out.println(w + "," + h + " : " + c);
            }
            k++;
        }
    }
}
