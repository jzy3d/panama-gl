package opengl.glut.macos;

import jdk.incubator.foreign.*;
import opengl.GLContext;
import opengl.macos.v10_15_3.glut_h;

import static jdk.incubator.foreign.CLinker.*;
import static opengl.macos.v10_15_3.glut_h.*;

public class GLUTContext_macOS_10_15_7 implements GLContext {
    public void init(){
        try {
            scope = ResourceScope.newConfinedScope();
            allocator = SegmentAllocator.ofScope(scope);
        } catch (Exception e) {
            e.printStackTrace();
        }

        init(true);
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

    public String glGetString(int stringID){
        return CLinker.toJavaString(glut_h.glGetString(stringID));
    }
    public void glutInit(Addressable argcp, Addressable argv) {
        glut_h.glutInit(argcp, argv);
    }
    public void glutInitDisplayMode(int mode) {
        glut_h.glutInitDisplayMode(GLUT_DOUBLE() | GLUT_RGB() | GLUT_DEPTH());
    }
    public void glutInitWindowSize(int width, int height) {
        glut_h.glutInitWindowSize(width, height);
    }
    public void glutInitWindowPosition(int x, int y) {
        glut_h.glutInitWindowPosition(x, y);
    }
    public void glutCreateWindow(String title) {
        glut_h.glutCreateWindow(CLinker.toCString(title, getScope()));
    }

    ResourceScope scope;
    SegmentAllocator allocator;

    public ResourceScope getScope() {
        return scope;
    }

    public SegmentAllocator getAllocator() {
        return allocator;
    }

    public MemorySegment alloc(double[] value) {
        return allocator.allocateArray(C_DOUBLE, value);
    }

    public MemorySegment alloc(float[] value) {
        return allocator.allocateArray(C_FLOAT, value);
    }

    public MemorySegment alloc(int[] value) {
        return allocator.allocateArray(C_INT, value);
    }

    public MemorySegment alloc(String value) {
        return CLinker.toCString(value, scope);
    }

}
