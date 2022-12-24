// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _CONNECTDLGSTRUCTW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbStructure"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hwndOwner"),
        Constants$root.C_POINTER$LAYOUT.withName("lpConnRes"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwDevNum")
    ).withName("_CONNECTDLGSTRUCTW");
    public static MemoryLayout $LAYOUT() {
        return _CONNECTDLGSTRUCTW.$struct$LAYOUT;
    }
    static final VarHandle cbStructure$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbStructure"));
    public static VarHandle cbStructure$VH() {
        return _CONNECTDLGSTRUCTW.cbStructure$VH;
    }
    public static int cbStructure$get(MemorySegment seg) {
        return (int)_CONNECTDLGSTRUCTW.cbStructure$VH.get(seg);
    }
    public static void cbStructure$set( MemorySegment seg, int x) {
        _CONNECTDLGSTRUCTW.cbStructure$VH.set(seg, x);
    }
    public static int cbStructure$get(MemorySegment seg, long index) {
        return (int)_CONNECTDLGSTRUCTW.cbStructure$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbStructure$set(MemorySegment seg, long index, int x) {
        _CONNECTDLGSTRUCTW.cbStructure$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndOwner"));
    public static VarHandle hwndOwner$VH() {
        return _CONNECTDLGSTRUCTW.hwndOwner$VH;
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CONNECTDLGSTRUCTW.hwndOwner$VH.get(seg);
    }
    public static void hwndOwner$set( MemorySegment seg, MemoryAddress x) {
        _CONNECTDLGSTRUCTW.hwndOwner$VH.set(seg, x);
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CONNECTDLGSTRUCTW.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        _CONNECTDLGSTRUCTW.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpConnRes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpConnRes"));
    public static VarHandle lpConnRes$VH() {
        return _CONNECTDLGSTRUCTW.lpConnRes$VH;
    }
    public static MemoryAddress lpConnRes$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CONNECTDLGSTRUCTW.lpConnRes$VH.get(seg);
    }
    public static void lpConnRes$set( MemorySegment seg, MemoryAddress x) {
        _CONNECTDLGSTRUCTW.lpConnRes$VH.set(seg, x);
    }
    public static MemoryAddress lpConnRes$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CONNECTDLGSTRUCTW.lpConnRes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpConnRes$set(MemorySegment seg, long index, MemoryAddress x) {
        _CONNECTDLGSTRUCTW.lpConnRes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _CONNECTDLGSTRUCTW.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_CONNECTDLGSTRUCTW.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _CONNECTDLGSTRUCTW.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_CONNECTDLGSTRUCTW.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _CONNECTDLGSTRUCTW.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwDevNum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDevNum"));
    public static VarHandle dwDevNum$VH() {
        return _CONNECTDLGSTRUCTW.dwDevNum$VH;
    }
    public static int dwDevNum$get(MemorySegment seg) {
        return (int)_CONNECTDLGSTRUCTW.dwDevNum$VH.get(seg);
    }
    public static void dwDevNum$set( MemorySegment seg, int x) {
        _CONNECTDLGSTRUCTW.dwDevNum$VH.set(seg, x);
    }
    public static int dwDevNum$get(MemorySegment seg, long index) {
        return (int)_CONNECTDLGSTRUCTW.dwDevNum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDevNum$set(MemorySegment seg, long index, int x) {
        _CONNECTDLGSTRUCTW.dwDevNum$VH.set(seg.asSlice(index*sizeof()), x);
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


