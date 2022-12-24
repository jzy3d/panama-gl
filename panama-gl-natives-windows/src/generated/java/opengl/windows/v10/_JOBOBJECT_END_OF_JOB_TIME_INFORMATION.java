// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _JOBOBJECT_END_OF_JOB_TIME_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("EndOfJobTimeAction")
    ).withName("_JOBOBJECT_END_OF_JOB_TIME_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _JOBOBJECT_END_OF_JOB_TIME_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle EndOfJobTimeAction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EndOfJobTimeAction"));
    public static VarHandle EndOfJobTimeAction$VH() {
        return _JOBOBJECT_END_OF_JOB_TIME_INFORMATION.EndOfJobTimeAction$VH;
    }
    public static int EndOfJobTimeAction$get(MemorySegment seg) {
        return (int)_JOBOBJECT_END_OF_JOB_TIME_INFORMATION.EndOfJobTimeAction$VH.get(seg);
    }
    public static void EndOfJobTimeAction$set( MemorySegment seg, int x) {
        _JOBOBJECT_END_OF_JOB_TIME_INFORMATION.EndOfJobTimeAction$VH.set(seg, x);
    }
    public static int EndOfJobTimeAction$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_END_OF_JOB_TIME_INFORMATION.EndOfJobTimeAction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EndOfJobTimeAction$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_END_OF_JOB_TIME_INFORMATION.EndOfJobTimeAction$VH.set(seg.asSlice(index*sizeof()), x);
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


