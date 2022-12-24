// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _PROCESSOR_NUMBER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Group"),
        Constants$root.C_CHAR$LAYOUT.withName("Number"),
        Constants$root.C_CHAR$LAYOUT.withName("Reserved")
    ).withName("_PROCESSOR_NUMBER");
    public static MemoryLayout $LAYOUT() {
        return _PROCESSOR_NUMBER.$struct$LAYOUT;
    }
    static final VarHandle Group$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Group"));
    public static VarHandle Group$VH() {
        return _PROCESSOR_NUMBER.Group$VH;
    }
    public static short Group$get(MemorySegment seg) {
        return (short)_PROCESSOR_NUMBER.Group$VH.get(seg);
    }
    public static void Group$set( MemorySegment seg, short x) {
        _PROCESSOR_NUMBER.Group$VH.set(seg, x);
    }
    public static short Group$get(MemorySegment seg, long index) {
        return (short)_PROCESSOR_NUMBER.Group$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Group$set(MemorySegment seg, long index, short x) {
        _PROCESSOR_NUMBER.Group$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Number$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Number"));
    public static VarHandle Number$VH() {
        return _PROCESSOR_NUMBER.Number$VH;
    }
    public static byte Number$get(MemorySegment seg) {
        return (byte)_PROCESSOR_NUMBER.Number$VH.get(seg);
    }
    public static void Number$set( MemorySegment seg, byte x) {
        _PROCESSOR_NUMBER.Number$VH.set(seg, x);
    }
    public static byte Number$get(MemorySegment seg, long index) {
        return (byte)_PROCESSOR_NUMBER.Number$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Number$set(MemorySegment seg, long index, byte x) {
        _PROCESSOR_NUMBER.Number$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _PROCESSOR_NUMBER.Reserved$VH;
    }
    public static byte Reserved$get(MemorySegment seg) {
        return (byte)_PROCESSOR_NUMBER.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, byte x) {
        _PROCESSOR_NUMBER.Reserved$VH.set(seg, x);
    }
    public static byte Reserved$get(MemorySegment seg, long index) {
        return (byte)_PROCESSOR_NUMBER.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, byte x) {
        _PROCESSOR_NUMBER.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
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


