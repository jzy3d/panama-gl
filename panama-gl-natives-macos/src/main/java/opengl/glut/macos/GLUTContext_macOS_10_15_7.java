package opengl.glut.macos;

import jdk.incubator.foreign.*;
import opengl.GL;
import opengl.GLContext;
import opengl.macos.v10_15_3.glut_h;

import static jdk.incubator.foreign.CLinker.*;
import static opengl.macos.v10_15_3.glut_h.*;

/**
 * This GLUT {@link GLContext} initialize a GLUT offscreen context allowing to then
 * invoke {@link GL} methods.
 *
 * NB : glutInit() should only be called once. In case part of the program invokes it,
 * it is possible to initialize the window without calling glutInit by instead calling GLUTContext.init(false)
 */
public class GLUTContext_macOS_10_15_7 implements GLContext {
    ResourceScope scope;
    SegmentAllocator allocator;

    public GLUTContext_macOS_10_15_7(){
        try {
            scope = ResourceScope.newConfinedScope();
            allocator = SegmentAllocator.ofScope(scope);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** Initialize GLUT and create a window */
    public void init(){
        init(true);
    }

    /** Initialize GLUT if input arg is true, and create a window */
    public void init(boolean forceLoadGlut){

        if(forceLoadGlut) {
            var argc = allocator.allocate(C_INT, 0);

            glutInit(argc, argc);
            glutInitDisplayMode(GLUT_DOUBLE() | GLUT_RGBA() | GLUT_DEPTH());
        }
        glutInitWindowSize(1, 1);
        glutInitWindowPosition(-100, -100);
        glutCreateWindow("InvisiblePanamaGLWindowForGLContext");
    }

    public void glutInit(Addressable argcp, Addressable argv) {
        glut_h.glutInit(argcp, argv);
    }
    public void glutInitDisplayMode(int mode) {
        glut_h.glutInitDisplayMode(mode);
    }
    public void glutInitWindowSize(int width, int height) {
        glut_h.glutInitWindowSize(width, height);
    }
    public void glutInitWindowPosition(int x, int y) {
        glut_h.glutInitWindowPosition(x, y);
    }
    public void glutCreateWindow(String title) {
        glut_h.glutCreateWindow(CLinker.toCString(title, scope));
    }

}
