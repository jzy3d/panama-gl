// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _HIBERFILE_BUCKET {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("MaxPhysicalMemory"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_LONG$LAYOUT).withName("PhysicalMemoryPercent"),
        MemoryLayout.paddingLayout(32)
    ).withName("_HIBERFILE_BUCKET");
    public static MemoryLayout $LAYOUT() {
        return _HIBERFILE_BUCKET.$struct$LAYOUT;
    }
    static final VarHandle MaxPhysicalMemory$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxPhysicalMemory"));
    public static VarHandle MaxPhysicalMemory$VH() {
        return _HIBERFILE_BUCKET.MaxPhysicalMemory$VH;
    }
    public static long MaxPhysicalMemory$get(MemorySegment seg) {
        return (long)_HIBERFILE_BUCKET.MaxPhysicalMemory$VH.get(seg);
    }
    public static void MaxPhysicalMemory$set( MemorySegment seg, long x) {
        _HIBERFILE_BUCKET.MaxPhysicalMemory$VH.set(seg, x);
    }
    public static long MaxPhysicalMemory$get(MemorySegment seg, long index) {
        return (long)_HIBERFILE_BUCKET.MaxPhysicalMemory$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxPhysicalMemory$set(MemorySegment seg, long index, long x) {
        _HIBERFILE_BUCKET.MaxPhysicalMemory$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment PhysicalMemoryPercent$slice(MemorySegment seg) {
        return seg.asSlice(8, 12);
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


