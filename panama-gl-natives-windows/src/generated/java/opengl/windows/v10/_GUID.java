// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GUID {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    public static MemoryLayout $LAYOUT() {
        return _GUID.$struct$LAYOUT;
    }
    static final VarHandle Data1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Data1"));
    public static VarHandle Data1$VH() {
        return _GUID.Data1$VH;
    }
    public static int Data1$get(MemorySegment seg) {
        return (int)_GUID.Data1$VH.get(seg);
    }
    public static void Data1$set( MemorySegment seg, int x) {
        _GUID.Data1$VH.set(seg, x);
    }
    public static int Data1$get(MemorySegment seg, long index) {
        return (int)_GUID.Data1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Data1$set(MemorySegment seg, long index, int x) {
        _GUID.Data1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Data2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Data2"));
    public static VarHandle Data2$VH() {
        return _GUID.Data2$VH;
    }
    public static short Data2$get(MemorySegment seg) {
        return (short)_GUID.Data2$VH.get(seg);
    }
    public static void Data2$set( MemorySegment seg, short x) {
        _GUID.Data2$VH.set(seg, x);
    }
    public static short Data2$get(MemorySegment seg, long index) {
        return (short)_GUID.Data2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Data2$set(MemorySegment seg, long index, short x) {
        _GUID.Data2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Data3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Data3"));
    public static VarHandle Data3$VH() {
        return _GUID.Data3$VH;
    }
    public static short Data3$get(MemorySegment seg) {
        return (short)_GUID.Data3$VH.get(seg);
    }
    public static void Data3$set( MemorySegment seg, short x) {
        _GUID.Data3$VH.set(seg, x);
    }
    public static short Data3$get(MemorySegment seg, long index) {
        return (short)_GUID.Data3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Data3$set(MemorySegment seg, long index, short x) {
        _GUID.Data3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Data4$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
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


