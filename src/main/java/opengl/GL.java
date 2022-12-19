package opengl;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
import opengl.macos.v10_15_3.glut_h;

public interface GL {
    ResourceScope getScope();
    SegmentAllocator getAllocator();
    MemorySegment alloc(double[] value);
    MemorySegment alloc(float[] value);
    MemorySegment alloc(int[] value);
    MemorySegment alloc(String value);
    String glGetString(int stringID);

    void glutInit(int i, int j);
    void glutInitDisplayMode(int mode);
    void glutInitWindowSize(int width, int height);
    void glutInitWindowPosition(int x, int y);
    void glutCreateWindow(String title);

    // General GL -----------------------

    void glClearColor(float r, float g, float b, float a);
    void glClearDepth(float depth);
    void glClear(int mask);


    // FBO ------------------------------

    void glGenTextures(int size, MemorySegment ids);
    // TODO : how to generate this convenient wrapper in interface AND implementations
    int[] glGenTextures(int size);

    void glBindTexture(int textureType, int textureId);
    void glTexParameteri(int target, int pname, int param);
    void glTexImage2D(int texture, int level, int internalFormat, int width, int height, int border, int format, int type, MemorySegment pixels);
    void glGenFramebuffersEXT(int id, MemorySegment frameBuffer);
    void glBindFramebufferEXT(int frameExt, int frameBufferId);
    void glFramebufferTexture2DEXT(int frameBufferExt, int colorAttachement, int texture, int textureId, int level);
    void glGenRenderbuffersEXT(int n, MemorySegment depthRb);
    void glBindRenderbufferEXT(int renderBufferExt, int depthRbId);
    void glRenderbufferStorageEXT(int renderBufferExt, int depthComponent, int width, int height);
    void glFramebufferRenderbufferEXT(int frameBufferExt, int depthAttachmentExt, int renderBufferExt, int depthRbId);
    int glCheckFramebufferStatusEXT(int frameBufferExt);
    void glReadPixels(int x, int y, int width, int height, int format, int type, MemorySegment pixelsRead);

    // TODO : how to generate this convenient wrapper in interface AND implementations
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
    int GL_FRAMEBUFFER_EXT();
    int GL_COLOR_ATTACHMENT0_EXT();
    int GL_RENDERBUFFER_EXT();
    int GL_DEPTH_COMPONENT24();
    int GL_DEPTH_ATTACHMENT_EXT();
    int GL_COLOR_BUFFER_BIT();
    int GL_DEPTH_BUFFER_BIT();
    int GL_BYTE();
}
