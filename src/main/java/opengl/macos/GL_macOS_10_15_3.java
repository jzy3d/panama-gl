package opengl.macos;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemorySegment;
import opengl.AbstractGL;
import opengl.GL;
import opengl.macos.v10_15_3.glut_h;

import static jdk.incubator.foreign.CLinker.C_INT;
import static opengl.macos.v10_15_3.glut_h.*;

/**
 * Look above ^^ this is how you link to platform binding.
 */
public class GL_macOS_10_15_3 extends AbstractGL implements GL  {
    public GL_macOS_10_15_3() {
        this(false);
    }

    public GL_macOS_10_15_3(boolean forceLoadGlut){
        super();
        init(forceLoadGlut);
    }

    protected void init(boolean forceLoadGlut){

        if(forceLoadGlut) {
            var argc = getAllocator().allocate(C_INT, 0);

            glutInit(argc, argc);
            glutInitDisplayMode(0/*GLUT_DOUBLE() | GLUT_RGBA() | GLUT_DEPTH()*/);
            glutInitWindowSize(1, 1);
            glutInitWindowPosition(-100, -100);
        }
        glutCreateWindow("InvisiblePanamaGLWindowForGLContext");
    }

    @Override
    public void glutInit(int i, int j) {
        glut_h.glutInit(getAllocator().allocate(i), getAllocator().allocate(j));
    }

    @Override
    public void glutInit(Addressable argcp, Addressable argv) {
        glut_h.glutInit(argcp, argv);
    }

    @Override
    public void glutInitDisplayMode(int mode) {
        glut_h.glutInitDisplayMode(GLUT_DOUBLE() | GLUT_RGB() | GLUT_DEPTH());
    }

    @Override
    public void glutInitWindowSize(int width, int height) {
        glut_h.glutInitWindowSize(width, height);
    }

    @Override
    public void glutInitWindowPosition(int x, int y) {
        glut_h.glutInitWindowPosition(x, y);
    }

    @Override
    public void glutCreateWindow(String title) {
        glut_h.glutCreateWindow(CLinker.toCString(title, getScope()));
    }

    @Override
    public void glGenTextures(int size, MemorySegment ids) {
        glut_h.glGenTextures(1, ids);
    }

    @Override
    public void glBindTexture(int textureType, int textureId) {
        glut_h.glBindTexture(glut_h.GL_TEXTURE_2D(), textureId);
    }

    @Override
    public void glTexParameteri(int target, int pname, int param) {
        glut_h.glTexParameteri(target, pname, param);
    }

    @Override
    public void glGenFramebuffers(int id, MemorySegment frameBuffer){
        glut_h.glGenFramebuffers(1, frameBuffer);
    }

    @Override
    public void glBindFramebuffer(int frameExt, int frameBufferId){
        glut_h.glBindFramebuffer(frameExt, frameBufferId);
    }

    @Override
    public void glFramebufferTexture2D(int frameBufferExt, int colorAttachement, int texture, int textureId, int level){
        glut_h.glFramebufferTexture2D(frameBufferExt, colorAttachement, texture, textureId, level);
    }

    @Override
    public void glGenRenderbuffers(int n, MemorySegment depthRb){
        glut_h.glGenRenderbuffers(1, depthRb);
    }

    @Override
    public void glBindRenderbuffer(int renderBufferExt, int depthRbId){
        glut_h.glBindRenderbuffer(renderBufferExt, depthRbId);
    }

    @Override
    public void glRenderbufferStorage(int renderBufferExt, int depthComponent, int width, int height){
        glut_h.glRenderbufferStorage(renderBufferExt, depthComponent, width, height);
    }

    @Override
    public void glFramebufferRenderbuffer(int frameBufferExt, int depthAttachmentExt, int renderBufferExt, int depthRbId){
        glut_h.glFramebufferRenderbuffer(frameBufferExt, depthAttachmentExt, renderBufferExt, depthRbId);
    }

    @Override
    public int glCheckFramebufferStatus(int frameBufferExt){
        return glut_h.glCheckFramebufferStatus(frameBufferExt);
    }

    @Override
    public void glDeleteTextures(int size, Addressable textureBuffers) {
        glut_h.glDeleteTextures(size, textureBuffers);

    }

    @Override
    public void glDeleteRenderbuffers(int size, Addressable renderBuffers) {
        glut_h.glDeleteRenderbuffers(size, renderBuffers);

    }

    @Override
    public void glDeleteFramebuffers(int size, Addressable frameBuffers) {
        glut_h.glDeleteFramebuffers(size, frameBuffers);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, MemorySegment pixelsRead){
        glut_h.glReadPixels(x, y, width, height, format, type, pixelsRead);
    }

    @Override
    public void glClearColor(float r, float g, float b, float a){
        glut_h.glClearColor(r, g, b, a);
    }

    @Override
    public void glClearDepth(float depth){
        glut_h.glClearDepth(depth);
    }

    @Override
    public void glClear(int mask){
        glut_h.glClear(mask);
    }


    // CONSTANTS ---------------------------

    @Override
    public int GL_TEXTURE_2D(){return glut_h.GL_TEXTURE_2D();}
    @Override
    public int GL_TEXTURE_WRAP_S(){return glut_h.GL_TEXTURE_WRAP_S();}
    @Override
    public int GL_REPEAT(){return glut_h.GL_REPEAT();}
    @Override
    public int GL_TEXTURE_WRAP_T(){return glut_h.GL_TEXTURE_WRAP_T();}
    @Override
    public int GL_TEXTURE_MIN_FILTER(){return glut_h.GL_TEXTURE_MIN_FILTER();}
    @Override
    public int GL_TEXTURE_MAG_FILTER(){return glut_h.GL_TEXTURE_MAG_FILTER();}
    @Override
    public int GL_NEAREST(){return glut_h.GL_NEAREST();}
    @Override
    public int GL_RGBA8(){return glut_h.GL_RGBA8();}
    @Override
    public int GL_BGRA(){return glut_h.GL_BGRA();}
    @Override
    public int GL_FRAMEBUFFER(){return glut_h.GL_FRAMEBUFFER();}
    @Override
    public int GL_COLOR_ATTACHMENT0(){return glut_h.GL_COLOR_ATTACHMENT0();}
    @Override
    public int GL_RENDERBUFFER(){return glut_h.GL_RENDERBUFFER();}
    @Override
    public int GL_DEPTH_COMPONENT24(){return glut_h.GL_DEPTH_COMPONENT24();}
    @Override
    public int GL_DEPTH_ATTACHMENT(){return glut_h.GL_DEPTH_ATTACHMENT();}
    @Override
    public int GL_COLOR_BUFFER_BIT(){return glut_h.GL_COLOR_BUFFER_BIT();}
    @Override
    public int GL_DEPTH_BUFFER_BIT(){return glut_h.GL_DEPTH_BUFFER_BIT();}
    @Override
    public int GL_BYTE(){return glut_h.GL_BYTE();}
    @Override
    public int GL_UNSIGNED_BYTE(){return glut_h.GL_UNSIGNED_BYTE();}
    @Override
    public int GL_FRAMEBUFFER_COMPLETE(){return glut_h.GL_FRAMEBUFFER_COMPLETE();}

}
