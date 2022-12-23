package opengl;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;

/**
 * A base class for Panama based OpenGL binding, implementing part of {@lin GL}
 * 
 * @author Martin Pernollet
 */
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


}
