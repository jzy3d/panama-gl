// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _REPARSE_GUID_DATA_BUFFER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ReparseTag"),
        Constants$root.C_SHORT$LAYOUT.withName("ReparseDataLength"),
        Constants$root.C_SHORT$LAYOUT.withName("Reserved"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ReparseGuid"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("DataBuffer")
        ).withName("GenericReparseBuffer"),
        MemoryLayout.paddingLayout(24)
    ).withName("_REPARSE_GUID_DATA_BUFFER");
    public static MemoryLayout $LAYOUT() {
        return _REPARSE_GUID_DATA_BUFFER.$struct$LAYOUT;
    }
    static final VarHandle ReparseTag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReparseTag"));
    public static VarHandle ReparseTag$VH() {
        return _REPARSE_GUID_DATA_BUFFER.ReparseTag$VH;
    }
    public static int ReparseTag$get(MemorySegment seg) {
        return (int)_REPARSE_GUID_DATA_BUFFER.ReparseTag$VH.get(seg);
    }
    public static void ReparseTag$set( MemorySegment seg, int x) {
        _REPARSE_GUID_DATA_BUFFER.ReparseTag$VH.set(seg, x);
    }
    public static int ReparseTag$get(MemorySegment seg, long index) {
        return (int)_REPARSE_GUID_DATA_BUFFER.ReparseTag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReparseTag$set(MemorySegment seg, long index, int x) {
        _REPARSE_GUID_DATA_BUFFER.ReparseTag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReparseDataLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReparseDataLength"));
    public static VarHandle ReparseDataLength$VH() {
        return _REPARSE_GUID_DATA_BUFFER.ReparseDataLength$VH;
    }
    public static short ReparseDataLength$get(MemorySegment seg) {
        return (short)_REPARSE_GUID_DATA_BUFFER.ReparseDataLength$VH.get(seg);
    }
    public static void ReparseDataLength$set( MemorySegment seg, short x) {
        _REPARSE_GUID_DATA_BUFFER.ReparseDataLength$VH.set(seg, x);
    }
    public static short ReparseDataLength$get(MemorySegment seg, long index) {
        return (short)_REPARSE_GUID_DATA_BUFFER.ReparseDataLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReparseDataLength$set(MemorySegment seg, long index, short x) {
        _REPARSE_GUID_DATA_BUFFER.ReparseDataLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _REPARSE_GUID_DATA_BUFFER.Reserved$VH;
    }
    public static short Reserved$get(MemorySegment seg) {
        return (short)_REPARSE_GUID_DATA_BUFFER.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, short x) {
        _REPARSE_GUID_DATA_BUFFER.Reserved$VH.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)_REPARSE_GUID_DATA_BUFFER.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        _REPARSE_GUID_DATA_BUFFER.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ReparseGuid$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static class GenericReparseBuffer {

        static final  GroupLayout GenericReparseBuffer$struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("DataBuffer")
        );
        public static MemoryLayout $LAYOUT() {
            return GenericReparseBuffer.GenericReparseBuffer$struct$LAYOUT;
        }
        public static MemorySegment DataBuffer$slice(MemorySegment seg) {
            return seg.asSlice(0, 1);
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

    public static MemorySegment GenericReparseBuffer$slice(MemorySegment seg) {
        return seg.asSlice(24, 1);
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


