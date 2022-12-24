// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _ICONINFOEXA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("fIcon"),
        Constants$root.C_LONG$LAYOUT.withName("xHotspot"),
        Constants$root.C_LONG$LAYOUT.withName("yHotspot"),
        Constants$root.C_POINTER$LAYOUT.withName("hbmMask"),
        Constants$root.C_POINTER$LAYOUT.withName("hbmColor"),
        Constants$root.C_SHORT$LAYOUT.withName("wResID"),
        MemoryLayout.sequenceLayout(260, Constants$root.C_CHAR$LAYOUT).withName("szModName"),
        MemoryLayout.sequenceLayout(260, Constants$root.C_CHAR$LAYOUT).withName("szResName"),
        MemoryLayout.paddingLayout(48)
    ).withName("_ICONINFOEXA");
    public static MemoryLayout $LAYOUT() {
        return _ICONINFOEXA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _ICONINFOEXA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_ICONINFOEXA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _ICONINFOEXA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_ICONINFOEXA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _ICONINFOEXA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fIcon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fIcon"));
    public static VarHandle fIcon$VH() {
        return _ICONINFOEXA.fIcon$VH;
    }
    public static int fIcon$get(MemorySegment seg) {
        return (int)_ICONINFOEXA.fIcon$VH.get(seg);
    }
    public static void fIcon$set( MemorySegment seg, int x) {
        _ICONINFOEXA.fIcon$VH.set(seg, x);
    }
    public static int fIcon$get(MemorySegment seg, long index) {
        return (int)_ICONINFOEXA.fIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fIcon$set(MemorySegment seg, long index, int x) {
        _ICONINFOEXA.fIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xHotspot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xHotspot"));
    public static VarHandle xHotspot$VH() {
        return _ICONINFOEXA.xHotspot$VH;
    }
    public static int xHotspot$get(MemorySegment seg) {
        return (int)_ICONINFOEXA.xHotspot$VH.get(seg);
    }
    public static void xHotspot$set( MemorySegment seg, int x) {
        _ICONINFOEXA.xHotspot$VH.set(seg, x);
    }
    public static int xHotspot$get(MemorySegment seg, long index) {
        return (int)_ICONINFOEXA.xHotspot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xHotspot$set(MemorySegment seg, long index, int x) {
        _ICONINFOEXA.xHotspot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yHotspot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("yHotspot"));
    public static VarHandle yHotspot$VH() {
        return _ICONINFOEXA.yHotspot$VH;
    }
    public static int yHotspot$get(MemorySegment seg) {
        return (int)_ICONINFOEXA.yHotspot$VH.get(seg);
    }
    public static void yHotspot$set( MemorySegment seg, int x) {
        _ICONINFOEXA.yHotspot$VH.set(seg, x);
    }
    public static int yHotspot$get(MemorySegment seg, long index) {
        return (int)_ICONINFOEXA.yHotspot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yHotspot$set(MemorySegment seg, long index, int x) {
        _ICONINFOEXA.yHotspot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hbmMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hbmMask"));
    public static VarHandle hbmMask$VH() {
        return _ICONINFOEXA.hbmMask$VH;
    }
    public static MemoryAddress hbmMask$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_ICONINFOEXA.hbmMask$VH.get(seg);
    }
    public static void hbmMask$set( MemorySegment seg, MemoryAddress x) {
        _ICONINFOEXA.hbmMask$VH.set(seg, x);
    }
    public static MemoryAddress hbmMask$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_ICONINFOEXA.hbmMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbmMask$set(MemorySegment seg, long index, MemoryAddress x) {
        _ICONINFOEXA.hbmMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hbmColor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hbmColor"));
    public static VarHandle hbmColor$VH() {
        return _ICONINFOEXA.hbmColor$VH;
    }
    public static MemoryAddress hbmColor$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_ICONINFOEXA.hbmColor$VH.get(seg);
    }
    public static void hbmColor$set( MemorySegment seg, MemoryAddress x) {
        _ICONINFOEXA.hbmColor$VH.set(seg, x);
    }
    public static MemoryAddress hbmColor$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_ICONINFOEXA.hbmColor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbmColor$set(MemorySegment seg, long index, MemoryAddress x) {
        _ICONINFOEXA.hbmColor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wResID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wResID"));
    public static VarHandle wResID$VH() {
        return _ICONINFOEXA.wResID$VH;
    }
    public static short wResID$get(MemorySegment seg) {
        return (short)_ICONINFOEXA.wResID$VH.get(seg);
    }
    public static void wResID$set( MemorySegment seg, short x) {
        _ICONINFOEXA.wResID$VH.set(seg, x);
    }
    public static short wResID$get(MemorySegment seg, long index) {
        return (short)_ICONINFOEXA.wResID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wResID$set(MemorySegment seg, long index, short x) {
        _ICONINFOEXA.wResID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szModName$slice(MemorySegment seg) {
        return seg.asSlice(34, 260);
    }
    public static MemorySegment szResName$slice(MemorySegment seg) {
        return seg.asSlice(294, 260);
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


