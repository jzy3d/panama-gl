// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _TAPE_WMI_OPERATIONS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Method"),
        Constants$root.C_LONG$LAYOUT.withName("DataBufferSize"),
        Constants$root.C_POINTER$LAYOUT.withName("DataBuffer")
    ).withName("_TAPE_WMI_OPERATIONS");
    public static MemoryLayout $LAYOUT() {
        return _TAPE_WMI_OPERATIONS.$struct$LAYOUT;
    }
    static final VarHandle Method$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Method"));
    public static VarHandle Method$VH() {
        return _TAPE_WMI_OPERATIONS.Method$VH;
    }
    public static int Method$get(MemorySegment seg) {
        return (int)_TAPE_WMI_OPERATIONS.Method$VH.get(seg);
    }
    public static void Method$set( MemorySegment seg, int x) {
        _TAPE_WMI_OPERATIONS.Method$VH.set(seg, x);
    }
    public static int Method$get(MemorySegment seg, long index) {
        return (int)_TAPE_WMI_OPERATIONS.Method$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Method$set(MemorySegment seg, long index, int x) {
        _TAPE_WMI_OPERATIONS.Method$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataBufferSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataBufferSize"));
    public static VarHandle DataBufferSize$VH() {
        return _TAPE_WMI_OPERATIONS.DataBufferSize$VH;
    }
    public static int DataBufferSize$get(MemorySegment seg) {
        return (int)_TAPE_WMI_OPERATIONS.DataBufferSize$VH.get(seg);
    }
    public static void DataBufferSize$set( MemorySegment seg, int x) {
        _TAPE_WMI_OPERATIONS.DataBufferSize$VH.set(seg, x);
    }
    public static int DataBufferSize$get(MemorySegment seg, long index) {
        return (int)_TAPE_WMI_OPERATIONS.DataBufferSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBufferSize$set(MemorySegment seg, long index, int x) {
        _TAPE_WMI_OPERATIONS.DataBufferSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataBuffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataBuffer"));
    public static VarHandle DataBuffer$VH() {
        return _TAPE_WMI_OPERATIONS.DataBuffer$VH;
    }
    public static MemoryAddress DataBuffer$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_TAPE_WMI_OPERATIONS.DataBuffer$VH.get(seg);
    }
    public static void DataBuffer$set( MemorySegment seg, MemoryAddress x) {
        _TAPE_WMI_OPERATIONS.DataBuffer$VH.set(seg, x);
    }
    public static MemoryAddress DataBuffer$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_TAPE_WMI_OPERATIONS.DataBuffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBuffer$set(MemorySegment seg, long index, MemoryAddress x) {
        _TAPE_WMI_OPERATIONS.DataBuffer$VH.set(seg.asSlice(index*sizeof()), x);
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


