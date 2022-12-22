package opengl.windows;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemorySegment;
import opengl.AbstractGL;
import opengl.GL;
import opengl.windows.v10.freeglut_h;

import static jdk.incubator.foreign.CLinker.C_INT;
import static opengl.windows.v10.freeglut_h.*;

/**
 * Look above ^^ this is how you link to platform binding.
 */
public class GL_windows_10 extends AbstractGL implements GL  {
    public GL_windows_10() {
        this(false);
    }

    public GL_windows_10(boolean forceLoadGlut){
        super();
        init();
    }

    protected void init(){
        var argc = getAllocator().allocate(C_INT, 0);

        glutInit(argc, argc);
        glutInitDisplayMode(0/*GLUT_DOUBLE() | GLUT_RGBA() | GLUT_DEPTH()*/);
        glutInitWindowSize(1, 1);
        glutInitWindowPosition(-100, -100);
        glutCreateWindow("InvisiblePanamaGLWindowForGLContext");
    }

    @Override
    public void glutInit(int i, int j) {
        freeglut_h.glutInit(getAllocator().allocate(i), getAllocator().allocate(j));
    }

    @Override
    public void glutInit(Addressable argcp, Addressable argv) {
        freeglut_h.glutInit(argcp, argv);
    }

    @Override
    public void glutInitDisplayMode(int mode) {
        freeglut_h.glutInitDisplayMode(GLUT_DOUBLE() | GLUT_RGB() | GLUT_DEPTH());
    }

    @Override
    public void glutInitWindowSize(int width, int height) {
        freeglut_h.glutInitWindowSize(width, height);
    }

    @Override
    public void glutInitWindowPosition(int x, int y) {
        freeglut_h.glutInitWindowPosition(x, y);
    }

    @Override
    public void glutCreateWindow(String title) {
        freeglut_h.glutCreateWindow(CLinker.toCString(title, getScope()));
    }

    @Override
    public void glGenTextures(int size, MemorySegment ids) {
        freeglut_h.glGenTextures(1, ids);
    }

    @Override
    public void glBindTexture(int textureType, int textureId) {
        freeglut_h.glBindTexture(freeglut_h.GL_TEXTURE_2D(), textureId);
    }

    @Override
    public void glTexParameteri(int target, int pname, int param) {
        freeglut_h.glTexParameteri(target, pname, param);
    }

    @Override
    public void glGenFramebuffers(int id, MemorySegment frameBuffer){
        freeglut_h.glGenFramebuffers(1, frameBuffer);
    }

    @Override
    public void glFramebufferTexture2D(int frameBufferExt, int colorAttachement, int texture, int textureId, int level){
        freeglut_h.glFramebufferTexture2D(frameBufferExt, colorAttachement, texture, textureId, level);
    }

    @Override
    public void glGenRenderbuffers(int n, MemorySegment depthRb){
        freeglut_h.glGenRenderbuffers(1, depthRb);
    }

    @Override
    public void glBindRenderbuffer(int renderBufferExt, int depthRbId){
        freeglut_h.glBindRenderbuffer(renderBufferExt, depthRbId);
    }

    @Override
    public void glRenderbufferStorage(int renderBufferExt, int depthComponent, int width, int height){
        freeglut_h.glRenderbufferStorage(renderBufferExt, depthComponent, width, height);
    }

    @Override
    public void glFramebufferRenderbuffer(int frameBufferExt, int depthAttachmentExt, int renderBufferExt, int depthRbId){
        freeglut_h.glFramebufferRenderbuffer(frameBufferExt, depthAttachmentExt, renderBufferExt, depthRbId);
    }

    @Override
    public int glCheckFramebufferStatus(int frameBufferExt){
        return freeglut_h.glCheckFramebufferStatus(frameBufferExt);
    }

    @Override
    public void glDeleteTextures(int size, Addressable textureBuffers) {
        freeglut_h.glDeleteTextures(size, textureBuffers);

    }

    @Override
    public void glDeleteRenderbuffers(int size, Addressable renderBuffers) {
        freeglut_h.glDeleteRenderbuffers(size, renderBuffers);

    }

    @Override
    public void glDeleteFramebuffers(int size, Addressable frameBuffers) {
        freeglut_h.glDeleteFramebuffers(size, frameBuffers);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, MemorySegment pixelsRead){
        freeglut_h.glReadPixels(x, y, width, height, format, type, pixelsRead);
    }

    @Override
    public void glClearColor(float r, float g, float b, float a){
        freeglut_h.glClearColor(r, g, b, a);
    }

    @Override
    public void glClearDepth(float depth){
        freeglut_h.glClearDepth(depth);
    }

    @Override
    public void glClear(int mask){
        freeglut_h.glClear(mask);
    }


    // CONSTANTS ---------------------------

    @Override
    public int GL_TEXTURE_2D(){return freeglut_h.GL_TEXTURE_2D();}
    @Override
    public int GL_TEXTURE_WRAP_S(){return freeglut_h.GL_TEXTURE_WRAP_S();}
    @Override
    public int GL_REPEAT(){return freeglut_h.GL_REPEAT();}
    @Override
    public int GL_TEXTURE_WRAP_T(){return freeglut_h.GL_TEXTURE_WRAP_T();}
    @Override
    public int GL_TEXTURE_MIN_FILTER(){return freeglut_h.GL_TEXTURE_MIN_FILTER();}
    @Override
    public int GL_TEXTURE_MAG_FILTER(){return freeglut_h.GL_TEXTURE_MAG_FILTER();}
    @Override
    public int GL_NEAREST(){return freeglut_h.GL_NEAREST();}
    @Override
    public int GL_RGBA8(){return freeglut_h.GL_RGBA8();}
    @Override
    public int GL_BGRA(){return freeglut_h.GL_BGRA();}
    @Override
    public int GL_FRAMEBUFFER(){return freeglut_h.GL_FRAMEBUFFER();}
    @Override
    public int GL_COLOR_ATTACHMENT0(){return freeglut_h.GL_COLOR_ATTACHMENT0();}
    @Override
    public int GL_RENDERBUFFER(){return freeglut_h.GL_RENDERBUFFER();}
    @Override
    public int GL_DEPTH_COMPONENT24(){return freeglut_h.GL_DEPTH_COMPONENT24();}
    @Override
    public int GL_DEPTH_ATTACHMENT(){return freeglut_h.GL_DEPTH_ATTACHMENT();}
    @Override
    public int GL_COLOR_BUFFER_BIT(){return freeglut_h.GL_COLOR_BUFFER_BIT();}
    @Override
    public int GL_DEPTH_BUFFER_BIT(){return freeglut_h.GL_DEPTH_BUFFER_BIT();}
    @Override
    public int GL_BYTE(){return freeglut_h.GL_BYTE();}
    @Override
    public int GL_UNSIGNED_BYTE(){return freeglut_h.GL_UNSIGNED_BYTE();}
    @Override
    public int GL_FRAMEBUFFER_COMPLETE(){return freeglut_h.GL_FRAMEBUFFER_COMPLETE();}

}
