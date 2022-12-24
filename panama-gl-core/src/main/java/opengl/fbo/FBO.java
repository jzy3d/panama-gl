package opengl.fbo;

import static jdk.incubator.foreign.ResourceScope.newImplicitScope;
import java.awt.image.BufferedImage;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemorySegment;
import opengl.ByteUtils;
import opengl.GL;

/**
 * A frame buffer object, or {@link FBO}, can render OpenGL into an offscreen buffer
 * that can later be converted to a {@link BufferedImage}.
 *
 * See :
 * https://www.khronos.org/opengl/wiki/Framebuffer_Object
 * https://www.khronos.org/opengl/wiki/Common_Mistakes
 * https://www.khronos.org/opengl/wiki/Framebuffer_Object_Extension_Examples#Quick_example,_render_to_texture_(2D)
 *
 * @author Martin Pernollet
 */
public class FBO {
    // default
    int level = 0;
    int width = 256;
    int height = 256;
    int border = 0;
    int channels = 4; // RGBA

    // indicates dimensions have changed
    // and FBO must reprepared
    boolean prepared = false;

    // undefined yes
    int format = -1;
    int internalFormat = -1;
    int textureType = -1;

    boolean debug = true;

    // supposed to copy to BufferedImage faster when true
    // using false allows to make copy by tweaking bytes
    // which is useful for debugging
    boolean arrayExport = true;

    int idTexture = -1;
    int idFrameBuffer = -1;
    int idRenderBuffer = -1;

    MemorySegment frameBufferIds;
    MemorySegment renderBufferIds;
    MemorySegment textureBufferIds;
    MemorySegment pixelBuffer;
    MemorySegment pixelsRead;

    VarHandle intHandle = MemoryHandles.varHandle(int.class, ByteOrder.nativeOrder());

    public FBO(){}

    public FBO(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void prepare(GL gl){
        if(prepared)
            release(gl);
        // ---------------------------
        // Transfert pixel Format
        // ---------------------------
        // Most GPU support BGRA
        // If you supply GL_RGBA, then the driver may have to do the swapping for you which is slow.
        // If you do use GL_BGRA, the call to pixel transfer will be much faster.
        // Note that GL_BGRA pixel transfer format is only preferred when uploading to GL_RGBA8 images.
        // When dealing with other formats, like GL_RGBA16, GL_RGBA8UI or even GL_RGBA8_SNORM, then the regular GL_RGBA
        // ordering may be preferred.
        //
        // On which platforms is GL_BGRA preferred? Making a list would be too long but one example is Microsoft Windows.
        // Note that with GL 4.3 or ARB_internalformat_query2, you can simply ask the implementation what is the
        // preferred format with glGetInternalFormativ(GL_TEXTURE_2D, GL_RGBA8, GL_TEXTURE_IMAGE_FORMAT, 1, &preferred_format).
        format = gl.GL_BGRA();
        internalFormat = gl.GL_RGBA8();//gl.GL_BGRA();
        textureType = gl.GL_UNSIGNED_BYTE();

        if(debug){
            System.out.println("FBO: " + internalFormat);
            System.out.println("FBO: " + format);
            System.out.println("FBO: " + gl.GL_RGBA8());
        }

        // ------------------------
        // Generate TEXTURE buffer

        textureBufferIds = MemorySegment.allocateNative(1*4*3, newImplicitScope());
        gl.glGenTextures(1, textureBufferIds);
        idTexture = (int) intHandle.get(textureBufferIds, 0);

        if(debug)
            System.out.println("FBO: Got texture ID : " + idTexture);

        // Bind texture and set parameters
        gl.glBindTexture(gl.GL_TEXTURE_2D(), idTexture);
        gl.glTexParameteri(gl.GL_TEXTURE_2D(), gl.GL_TEXTURE_WRAP_S(), gl.GL_REPEAT());
        gl.glTexParameteri(gl.GL_TEXTURE_2D(), gl.GL_TEXTURE_WRAP_T(), gl.GL_REPEAT());
        gl.glTexParameteri(gl.GL_TEXTURE_2D(), gl.GL_TEXTURE_MIN_FILTER(), gl.GL_NEAREST());
        gl.glTexParameteri(gl.GL_TEXTURE_2D(), gl.GL_TEXTURE_MAG_FILTER(), gl.GL_NEAREST());

        // Create a texture to write to
        int byteSize = width * height * channels;
        pixelBuffer = MemorySegment.allocateNative(byteSize, newImplicitScope());
        gl.glTexImage2D(gl.GL_TEXTURE_2D(), level, internalFormat, width, height, border, format, textureType, pixelBuffer);

        //-------------------------
        // Generate FRAME buffer

        frameBufferIds = MemorySegment.allocateNative(4, newImplicitScope());
        gl.glGenFramebuffers(1, frameBufferIds);
        idFrameBuffer = (int) intHandle.get(frameBufferIds, 0);

        if(debug)
            System.out.println("FBO: Got FB ID : " + idFrameBuffer);

        // Bind frame buffer
        gl.glBindFramebuffer(gl.GL_FRAMEBUFFER(), idFrameBuffer);

        //Attach 2D texture to this FBO
        gl.glFramebufferTexture2D(gl.GL_FRAMEBUFFER(), gl.GL_COLOR_ATTACHMENT0(), gl.GL_TEXTURE_2D(), idTexture, 0);

        //-------------------------
        // Generate RENDER buffer

        renderBufferIds = MemorySegment.allocateNative(4, newImplicitScope());
        gl.glGenRenderbuffers(1, renderBufferIds);
        idRenderBuffer = (int) intHandle.get(renderBufferIds, 0);

        if(debug)
            System.out.println("FBO: Got RenderBuffer ID : " + idRenderBuffer);

        // Bind render buffer
        gl.glBindRenderbuffer(gl.GL_RENDERBUFFER(), idRenderBuffer);
        gl.glRenderbufferStorage(gl.GL_RENDERBUFFER(), gl.GL_DEPTH_COMPONENT24(), width, height);

        //-------------------------
        //Attach depth buffer to FBO

        gl.glFramebufferRenderbuffer(gl.GL_FRAMEBUFFER(), gl.GL_DEPTH_ATTACHMENT(), gl.GL_RENDERBUFFER(), idRenderBuffer);

        //-------------------------
        //Does the GPU support current FBO configuration?

        int status = gl.glCheckFramebufferStatus(gl.GL_FRAMEBUFFER());

        if(status!=gl.GL_FRAMEBUFFER_COMPLETE()){
            throw new RuntimeException("Incomplete framebuffer, not supporting current FBO config : " + status + " != GL_FRAMEBUFFER_COMPLETE (" + gl.GL_FRAMEBUFFER_COMPLETE() + ")");
        }

        //-------------------------
        //and now you can render to GL_TEXTURE_2D

        gl.glBindFramebuffer(gl.GL_FRAMEBUFFER(), idFrameBuffer);
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glClearDepth(1.0f);
        gl.glClear(gl.GL_COLOR_BUFFER_BIT() | gl.GL_DEPTH_BUFFER_BIT());

        // Mark as prepared
        prepared = true;
    }

    /**
     * Release resources held by this FBO utility.
     *
     * @param gl
     */
    public void release(GL gl){
        //Delete resources
        gl.glDeleteTextures(1, textureBufferIds);
        gl.glDeleteRenderbuffers(1, renderBufferIds);
        //Bind 0, which means render to back buffer, as a result, fb is unbound
        gl.glBindFramebuffer(gl.GL_FRAMEBUFFER(), 0);
        gl.glDeleteFramebuffers(1, frameBufferIds);

        // FIXME : Not mapped exception is not relevant
        // FIXME : See if later versions of Panama do not throw exception
        /*textureBufferIds.unload();
        renderBufferIds.unload();
        frameBufferIds.unload();
        pixelBuffer.unload();*/

        prepared = false;

        if(debug)
            System.out.println("FBO: Resources released !");

    }

    public BufferedImage getImage(GL gl) {

        // Initialize buffers if they are not ready or if their expected size changed
        if(!prepared)
            prepare(gl);

        // Init output image with the buffer size and color encoding
        BufferedImage out = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        // Reading pixels
        int nBytes = width * height * channels;
        pixelsRead = MemorySegment.allocateNative(nBytes, newImplicitScope());
        gl.glReadPixels(0, 0, width, height, format, textureType, pixelsRead);

        // Copy pixels to buffered image
        if(arrayExport)
            fromBGRABufferToImageArray(pixelsRead, out);
        else
            fromBGRABufferToImage(pixelsRead, out);

        if(debug)
            System.out.println("FBO: Image created !");


        // FIXME : Not mapped exception is not relevant
        // FIXME : See if later versions of Panama do not throw exception
        //pixelsRead.unload();

        //Bind 0, which means render to back buffer
        gl.glBindFramebuffer(gl.GL_FRAMEBUFFER(), 0);

        return out;
    }

    /**
     * Faster? to be evaluated
     * Read a BGRA (GL.GL_BGRA()) pixel buffer and export its content to a {@link BufferedImage}.
     *
     * Warning : flipped
     */
    protected void fromBGRABufferToImageArray(MemorySegment pixelsBuffer, BufferedImage out) {
        int[] px = pixelsBuffer.toIntArray();
        out.setRGB(0, 0, width, height, px, 0, width);
    }

    /**
     * Read a BGRA (GL.GL_BGRA()) pixel buffer and export its content to a {@link BufferedImage}.
     *
     * @param pixelsBuffer
     * @param out
     */
    protected void fromBGRABufferToImage(MemorySegment pixelsBuffer, BufferedImage out) {
        int nPixels = width * height;
        int k = 0;

        // TODO : Use pixelsRead.toByteArray / toIntArray instead
        // TODO : evaluate advantage of image.setRGB(pixel:int[])
        VarHandle byteHandle = MemoryHandles.varHandle(byte.class, ByteOrder.nativeOrder());

        for(int i = 0; i< nPixels * channels; i+= channels){
            // BGRA as specified by "format" field
            byte byB = (byte) byteHandle.get(pixelsBuffer, i);
            byte byG = (byte) byteHandle.get(pixelsBuffer, i+1);
            byte byR = (byte) byteHandle.get(pixelsBuffer, i+2);
            byte byA = (byte) byteHandle.get(pixelsBuffer, i+3);
            byte non = 0;
            byte one = (byte)0xff;
            int rgba = ByteUtils.RGBAtoIntARGB(byR, byG, byB, byA); // ARGB
            //rgba = ByteUtils.RGBAtoIntARGB(byR, non, non, one);
            //rgba = ByteUtils.RGBAtoIntARGB(non, byG, non, one);
            //rgba = ByteUtils.RGBAtoIntARGB(non, non, byB, one);

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

                System.out.println(w + "," + h + " : \t r=" + red + " g=" + green + " b="+blue + " a=" + alpha);
            }
            k++;
        }
    }

    public void resize(int width, int height) {
        this.width = width;
        this.height = height;

        this.prepared = false;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
