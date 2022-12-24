// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _LIST_ENTRY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Flink"),
        Constants$root.C_POINTER$LAYOUT.withName("Blink")
    ).withName("_LIST_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _LIST_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle Flink$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flink"));
    public static VarHandle Flink$VH() {
        return _LIST_ENTRY.Flink$VH;
    }
    public static MemoryAddress Flink$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_LIST_ENTRY.Flink$VH.get(seg);
    }
    public static void Flink$set( MemorySegment seg, MemoryAddress x) {
        _LIST_ENTRY.Flink$VH.set(seg, x);
    }
    public static MemoryAddress Flink$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_LIST_ENTRY.Flink$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flink$set(MemorySegment seg, long index, MemoryAddress x) {
        _LIST_ENTRY.Flink$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Blink$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Blink"));
    public static VarHandle Blink$VH() {
        return _LIST_ENTRY.Blink$VH;
    }
    public static MemoryAddress Blink$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_LIST_ENTRY.Blink$VH.get(seg);
    }
    public static void Blink$set( MemorySegment seg, MemoryAddress x) {
        _LIST_ENTRY.Blink$VH.set(seg, x);
    }
    public static MemoryAddress Blink$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_LIST_ENTRY.Blink$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Blink$set(MemorySegment seg, long index, MemoryAddress x) {
        _LIST_ENTRY.Blink$VH.set(seg.asSlice(index*sizeof()), x);
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


