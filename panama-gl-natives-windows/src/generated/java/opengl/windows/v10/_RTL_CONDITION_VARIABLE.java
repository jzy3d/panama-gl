// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _RTL_CONDITION_VARIABLE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Ptr")
    ).withName("_RTL_CONDITION_VARIABLE");
    public static MemoryLayout $LAYOUT() {
        return _RTL_CONDITION_VARIABLE.$struct$LAYOUT;
    }
    static final VarHandle Ptr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Ptr"));
    public static VarHandle Ptr$VH() {
        return _RTL_CONDITION_VARIABLE.Ptr$VH;
    }
    public static MemoryAddress Ptr$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_RTL_CONDITION_VARIABLE.Ptr$VH.get(seg);
    }
    public static void Ptr$set( MemorySegment seg, MemoryAddress x) {
        _RTL_CONDITION_VARIABLE.Ptr$VH.set(seg, x);
    }
    public static MemoryAddress Ptr$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_RTL_CONDITION_VARIABLE.Ptr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Ptr$set(MemorySegment seg, long index, MemoryAddress x) {
        _RTL_CONDITION_VARIABLE.Ptr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


