// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _WIN32_FIND_DATAA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwFileAttributes"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwLowDateTime"),
            Constants$root.C_LONG$LAYOUT.withName("dwHighDateTime")
        ).withName("ftCreationTime"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwLowDateTime"),
            Constants$root.C_LONG$LAYOUT.withName("dwHighDateTime")
        ).withName("ftLastAccessTime"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwLowDateTime"),
            Constants$root.C_LONG$LAYOUT.withName("dwHighDateTime")
        ).withName("ftLastWriteTime"),
        Constants$root.C_LONG$LAYOUT.withName("nFileSizeHigh"),
        Constants$root.C_LONG$LAYOUT.withName("nFileSizeLow"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved0"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved1"),
        MemoryLayout.sequenceLayout(260, Constants$root.C_CHAR$LAYOUT).withName("cFileName"),
        MemoryLayout.sequenceLayout(14, Constants$root.C_CHAR$LAYOUT).withName("cAlternateFileName"),
        MemoryLayout.paddingLayout(16)
    ).withName("_WIN32_FIND_DATAA");
    public static MemoryLayout $LAYOUT() {
        return _WIN32_FIND_DATAA.$struct$LAYOUT;
    }
    static final VarHandle dwFileAttributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFileAttributes"));
    public static VarHandle dwFileAttributes$VH() {
        return _WIN32_FIND_DATAA.dwFileAttributes$VH;
    }
    public static int dwFileAttributes$get(MemorySegment seg) {
        return (int)_WIN32_FIND_DATAA.dwFileAttributes$VH.get(seg);
    }
    public static void dwFileAttributes$set( MemorySegment seg, int x) {
        _WIN32_FIND_DATAA.dwFileAttributes$VH.set(seg, x);
    }
    public static int dwFileAttributes$get(MemorySegment seg, long index) {
        return (int)_WIN32_FIND_DATAA.dwFileAttributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFileAttributes$set(MemorySegment seg, long index, int x) {
        _WIN32_FIND_DATAA.dwFileAttributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ftCreationTime$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
    }
    public static MemorySegment ftLastAccessTime$slice(MemorySegment seg) {
        return seg.asSlice(12, 8);
    }
    public static MemorySegment ftLastWriteTime$slice(MemorySegment seg) {
        return seg.asSlice(20, 8);
    }
    static final VarHandle nFileSizeHigh$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nFileSizeHigh"));
    public static VarHandle nFileSizeHigh$VH() {
        return _WIN32_FIND_DATAA.nFileSizeHigh$VH;
    }
    public static int nFileSizeHigh$get(MemorySegment seg) {
        return (int)_WIN32_FIND_DATAA.nFileSizeHigh$VH.get(seg);
    }
    public static void nFileSizeHigh$set( MemorySegment seg, int x) {
        _WIN32_FIND_DATAA.nFileSizeHigh$VH.set(seg, x);
    }
    public static int nFileSizeHigh$get(MemorySegment seg, long index) {
        return (int)_WIN32_FIND_DATAA.nFileSizeHigh$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nFileSizeHigh$set(MemorySegment seg, long index, int x) {
        _WIN32_FIND_DATAA.nFileSizeHigh$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nFileSizeLow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nFileSizeLow"));
    public static VarHandle nFileSizeLow$VH() {
        return _WIN32_FIND_DATAA.nFileSizeLow$VH;
    }
    public static int nFileSizeLow$get(MemorySegment seg) {
        return (int)_WIN32_FIND_DATAA.nFileSizeLow$VH.get(seg);
    }
    public static void nFileSizeLow$set( MemorySegment seg, int x) {
        _WIN32_FIND_DATAA.nFileSizeLow$VH.set(seg, x);
    }
    public static int nFileSizeLow$get(MemorySegment seg, long index) {
        return (int)_WIN32_FIND_DATAA.nFileSizeLow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nFileSizeLow$set(MemorySegment seg, long index, int x) {
        _WIN32_FIND_DATAA.nFileSizeLow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved0$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved0"));
    public static VarHandle dwReserved0$VH() {
        return _WIN32_FIND_DATAA.dwReserved0$VH;
    }
    public static int dwReserved0$get(MemorySegment seg) {
        return (int)_WIN32_FIND_DATAA.dwReserved0$VH.get(seg);
    }
    public static void dwReserved0$set( MemorySegment seg, int x) {
        _WIN32_FIND_DATAA.dwReserved0$VH.set(seg, x);
    }
    public static int dwReserved0$get(MemorySegment seg, long index) {
        return (int)_WIN32_FIND_DATAA.dwReserved0$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved0$set(MemorySegment seg, long index, int x) {
        _WIN32_FIND_DATAA.dwReserved0$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved1"));
    public static VarHandle dwReserved1$VH() {
        return _WIN32_FIND_DATAA.dwReserved1$VH;
    }
    public static int dwReserved1$get(MemorySegment seg) {
        return (int)_WIN32_FIND_DATAA.dwReserved1$VH.get(seg);
    }
    public static void dwReserved1$set( MemorySegment seg, int x) {
        _WIN32_FIND_DATAA.dwReserved1$VH.set(seg, x);
    }
    public static int dwReserved1$get(MemorySegment seg, long index) {
        return (int)_WIN32_FIND_DATAA.dwReserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved1$set(MemorySegment seg, long index, int x) {
        _WIN32_FIND_DATAA.dwReserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment cFileName$slice(MemorySegment seg) {
        return seg.asSlice(44, 260);
    }
    public static MemorySegment cAlternateFileName$slice(MemorySegment seg) {
        return seg.asSlice(304, 14);
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


