// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _TAPE_CREATE_PARTITION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Method"),
        Constants$root.C_LONG$LAYOUT.withName("Count"),
        Constants$root.C_LONG$LAYOUT.withName("Size")
    ).withName("_TAPE_CREATE_PARTITION");
    public static MemoryLayout $LAYOUT() {
        return _TAPE_CREATE_PARTITION.$struct$LAYOUT;
    }
    static final VarHandle Method$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Method"));
    public static VarHandle Method$VH() {
        return _TAPE_CREATE_PARTITION.Method$VH;
    }
    public static int Method$get(MemorySegment seg) {
        return (int)_TAPE_CREATE_PARTITION.Method$VH.get(seg);
    }
    public static void Method$set( MemorySegment seg, int x) {
        _TAPE_CREATE_PARTITION.Method$VH.set(seg, x);
    }
    public static int Method$get(MemorySegment seg, long index) {
        return (int)_TAPE_CREATE_PARTITION.Method$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Method$set(MemorySegment seg, long index, int x) {
        _TAPE_CREATE_PARTITION.Method$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    public static VarHandle Count$VH() {
        return _TAPE_CREATE_PARTITION.Count$VH;
    }
    public static int Count$get(MemorySegment seg) {
        return (int)_TAPE_CREATE_PARTITION.Count$VH.get(seg);
    }
    public static void Count$set( MemorySegment seg, int x) {
        _TAPE_CREATE_PARTITION.Count$VH.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)_TAPE_CREATE_PARTITION.Count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        _TAPE_CREATE_PARTITION.Count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _TAPE_CREATE_PARTITION.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_TAPE_CREATE_PARTITION.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _TAPE_CREATE_PARTITION.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_TAPE_CREATE_PARTITION.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _TAPE_CREATE_PARTITION.Size$VH.set(seg.asSlice(index*sizeof()), x);
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


