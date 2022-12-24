package opengl.ubuntu;

import static jdk.incubator.foreign.CLinker.C_INT;
import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemorySegment;
import opengl.AbstractGL;
import opengl.GL;
import opengl.glx.ubuntu.v20.glx_h;
import opengl.ubuntu.v20.glut_h;

/**
 * Look above ^^ this is how you link to platform binding.
 */
public class GLX_Ubuntu_20 extends AbstractGL implements GL  {
    public GLX_Ubuntu_20() {
        this(false);
    }

    public GLX_Ubuntu_20(boolean forceLoadGlut){
        super();
    }

    @Override
    public String glGetString(int stringID){
        return CLinker.toJavaString(glut_h.glGetString(stringID));
    }


    @Override
    public void glGenTextures(int size, MemorySegment ids) {
        glx_h.glGenTextures(1, ids);
    }

    @Override
    public void glBindTexture(int textureType, int textureId) {
        glx_h.glBindTexture(glx_h.GL_TEXTURE_2D(), textureId);
    }

    @Override
    public void glTexImage2D(int texture, int level, int internalFormat, int width, int height, int border, int format, int type, MemorySegment pixels){
        glx_h.glTexImage2D(texture, level, internalFormat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexParameteri(int target, int pname, int param) {
        glx_h.glTexParameteri(target, pname, param);
        
    }

    @Override
    public void glGenFramebuffers(int id, MemorySegment frameBuffer){

      if(glGenFramebuffersName==null) {
        glGenFramebuffersName = alloc("glGenFramebuffers");        
        glGenFramebuffers = (MemorySegment) glx_h.glXGetProcAddress(glGenFramebuffersName);
      }
      
      //glx_h.glGenFramebuffers(1, frameBuffer);
        
    }
    
    MemorySegment glGenFramebuffersName = null;
    MemorySegment glGenFramebuffers = null;
    
    @Override
    public void glBindFramebuffer(int frameExt, int frameBufferId){
      //glx_h.glBindFramebuffer(frameExt, frameBufferId);
    }

    @Override
    public void glFramebufferTexture2D(int frameBufferExt, int colorAttachement, int texture, int textureId, int level){
        //glx_h.glFramebufferTexture2D(frameBufferExt, colorAttachement, texture, textureId, level);
    }

    @Override
    public void glGenRenderbuffers(int n, MemorySegment depthRb){
        //glx_h.glGenRenderbuffers(1, depthRb);
    }

    @Override
    public void glBindRenderbuffer(int renderBufferExt, int depthRbId){
        //glx_h.glBindRenderbuffer(renderBufferExt, depthRbId);
    }

    @Override
    public void glRenderbufferStorage(int renderBufferExt, int depthComponent, int width, int height){
        //glx_h.glRenderbufferStorage(renderBufferExt, depthComponent, width, height);
    }

    @Override
    public void glFramebufferRenderbuffer(int frameBufferExt, int depthAttachmentExt, int renderBufferExt, int depthRbId){
        //glx_h.glFramebufferRenderbuffer(frameBufferExt, depthAttachmentExt, renderBufferExt, depthRbId);
    }

    @Override
    public int glCheckFramebufferStatus(int frameBufferExt){
      return -1;
        //return glx_h.glCheckFramebufferStatus(frameBufferExt);
    }

    @Override
    public void glDeleteTextures(int size, Addressable textureBuffers) {
        glx_h.glDeleteTextures(size, textureBuffers);

    }

    @Override
    public void glDeleteRenderbuffers(int size, Addressable renderBuffers) {
        //glx_h.glDeleteRenderbuffers(size, renderBuffers);

    }

    @Override
    public void glDeleteFramebuffers(int size, Addressable frameBuffers) {
        //glx_h.glDeleteFramebuffers(size, frameBuffers);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, MemorySegment pixelsRead){
        glx_h.glReadPixels(x, y, width, height, format, type, pixelsRead);
    }

    @Override
    public void glClearColor(float r, float g, float b, float a){
        glx_h.glClearColor(r, g, b, a);
    }

    @Override
    public void glClearDepth(float depth){
        glx_h.glClearDepth(depth);
    }

    @Override
    public void glClear(int mask){
        glx_h.glClear(mask);
    }


    // CONSTANTS ---------------------------

    @Override
    public int GL_TEXTURE_2D(){return glx_h.GL_TEXTURE_2D();}
    @Override
    public int GL_TEXTURE_WRAP_S(){return glx_h.GL_TEXTURE_WRAP_S();}
    @Override
    public int GL_REPEAT(){return glx_h.GL_REPEAT();}
    @Override
    public int GL_TEXTURE_WRAP_T(){return glx_h.GL_TEXTURE_WRAP_T();}
    @Override
    public int GL_TEXTURE_MIN_FILTER(){return glx_h.GL_TEXTURE_MIN_FILTER();}
    @Override
    public int GL_TEXTURE_MAG_FILTER(){return glx_h.GL_TEXTURE_MAG_FILTER();}
    @Override
    public int GL_NEAREST(){return glx_h.GL_NEAREST();}
    @Override
    public int GL_RGBA8(){return glx_h.GL_RGBA8();}
    @Override
    public int GL_BGRA(){return glx_h.GL_BGRA();}
    @Override
    public int GL_FRAMEBUFFER(){return glx_h.GL_FRAMEBUFFER();}
    @Override
    public int GL_COLOR_ATTACHMENT0(){return glx_h.GL_COLOR_ATTACHMENT0();}
    @Override
    public int GL_RENDERBUFFER(){return glx_h.GL_RENDERBUFFER();}
    @Override
    public int GL_DEPTH_COMPONENT24(){return glx_h.GL_DEPTH_COMPONENT24();}
    @Override
    public int GL_DEPTH_ATTACHMENT(){return glx_h.GL_DEPTH_ATTACHMENT();}
    @Override
    public int GL_COLOR_BUFFER_BIT(){return glx_h.GL_COLOR_BUFFER_BIT();}
    @Override
    public int GL_DEPTH_BUFFER_BIT(){return glx_h.GL_DEPTH_BUFFER_BIT();}
    @Override
    public int GL_BYTE(){return glx_h.GL_BYTE();}
    @Override
    public int GL_UNSIGNED_BYTE(){return glx_h.GL_UNSIGNED_BYTE();}
    @Override
    public int GL_FRAMEBUFFER_COMPLETE(){return glx_h.GL_FRAMEBUFFER_COMPLETE();}

}
