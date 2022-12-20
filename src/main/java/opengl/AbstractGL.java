package opengl;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
import opengl.macos.v10_15_3.glut_h;

import static jdk.incubator.foreign.CLinker.*;
import static jdk.incubator.foreign.ResourceScope.newImplicitScope;

public abstract class AbstractGL implements GL {
    ResourceScope scope;
    SegmentAllocator allocator;

    public AbstractGL(){
        try {
            scope = ResourceScope.newConfinedScope();
            allocator = SegmentAllocator.ofScope(scope);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void glTexImage2D(int texture, int level, int internalFormat, int width, int height, int border, int format, int type, MemorySegment pixels){
        glut_h.glTexImage2D(texture, level, internalFormat, width, height, border, format, type, pixels);
    }

    @Override
    public void glBindFramebufferEXT(int frameExt, int frameBufferId){
        glut_h.glBindFramebufferEXT(frameExt, frameBufferId);
    }

    /////////////////////////////////////////////

    @Override
    public ResourceScope getScope() {
        return scope;
    }

    @Override
    public SegmentAllocator getAllocator() {
        return allocator;
    }

    @Override
    public MemorySegment alloc(double[] value) {
        return allocator.allocateArray(C_DOUBLE, value);
    }

    @Override
    public MemorySegment alloc(float[] value) {
        return allocator.allocateArray(C_FLOAT, value);
    }

    @Override
    public MemorySegment alloc(int[] value) {
        return allocator.allocateArray(C_INT, value);
    }

    @Override
    public MemorySegment alloc(String value) {
        return CLinker.toCString(value, scope);
    }

    @Override
    public String glGetString(int stringID){
        return CLinker.toJavaString(glut_h.glGetString(stringID));
    }

}
