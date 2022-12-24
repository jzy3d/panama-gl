package opengl;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;

/**
 * A base GL interface for Panama based OpenGL binding.
 * 
 * @author Martin Pernollet
 */
public interface GL {
    ResourceScope getScope();
    SegmentAllocator getAllocator();
    MemorySegment alloc(double[] value);
    MemorySegment alloc(float[] value);
    MemorySegment alloc(int[] value);
    MemorySegment alloc(String value);


    // General GL -----------------------

    void glClearColor(float r, float g, float b, float a);
    void glClearDepth(float depth);
    void glClear(int mask);
    String glGetString(int stringID);

    // FBO ------------------------------

    void glGenTextures(int size, MemorySegment ids);
    void glBindTexture(int textureType, int textureId);
    void glTexParameteri(int target, int pname, int param);

    /**
     * https://registry.khronos.org/OpenGL-Refpages/gl4/html/glTexImage2D.xhtml
     * @param texture
     * @param level
     * @param internalFormat
     * @param width
     * @param height
     * @param border
     * @param format
     * @param type
     * @param pixels
     */
    void glTexImage2D(int texture, int level, int internalFormat, int width, int height, int border, int format, int type, MemorySegment pixels);
    void glGenFramebuffers(int id, MemorySegment frameBuffer);
    void glBindFramebuffer(int frameExt, int frameBufferId);
    void glFramebufferTexture2D(int frameBufferExt, int colorAttachement, int texture, int textureId, int level);
    void glGenRenderbuffers(int n, MemorySegment depthRb);
    void glBindRenderbuffer(int renderBufferExt, int depthRbId);
    void glRenderbufferStorage(int renderBufferExt, int depthComponent, int width, int height);
    void glFramebufferRenderbuffer(int frameBufferExt, int depthAttachmentExt, int renderBufferExt, int depthRbId);
    void glReadPixels(int x, int y, int width, int height, int format, int type, MemorySegment pixelsRead);
    int glCheckFramebufferStatus(int frameBufferExt);

    void glDeleteTextures(int size, Addressable textureBuffers);
    void glDeleteRenderbuffers(int size, Addressable renderBuffers);
    void glDeleteFramebuffers(int size, Addressable frameBuffers);

    // TODO : how to generate this convenient wrapper in interface AND implementations?
    // TODO : how to load them as constants instead of methods?
    int GL_TEXTURE_2D();
    int GL_TEXTURE_WRAP_S();
    int GL_REPEAT();
    int GL_TEXTURE_WRAP_T();
    int GL_TEXTURE_MIN_FILTER();
    int GL_TEXTURE_MAG_FILTER();
    int GL_NEAREST();
    int GL_RGBA8();
    int GL_BGRA();
    int GL_UNSIGNED_BYTE();
    int GL_FRAMEBUFFER();
    int GL_COLOR_ATTACHMENT0();
    int GL_RENDERBUFFER();
    int GL_DEPTH_COMPONENT24();
    int GL_DEPTH_ATTACHMENT();
    int GL_COLOR_BUFFER_BIT();
    int GL_DEPTH_BUFFER_BIT();
    int GL_BYTE();
    int GL_FRAMEBUFFER_COMPLETE();

}
