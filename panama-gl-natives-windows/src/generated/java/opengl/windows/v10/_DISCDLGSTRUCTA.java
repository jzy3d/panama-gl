// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _DISCDLGSTRUCTA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbStructure"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hwndOwner"),
        Constants$root.C_POINTER$LAYOUT.withName("lpLocalName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpRemoteName"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        MemoryLayout.paddingLayout(32)
    ).withName("_DISCDLGSTRUCTA");
    public static MemoryLayout $LAYOUT() {
        return _DISCDLGSTRUCTA.$struct$LAYOUT;
    }
    static final VarHandle cbStructure$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbStructure"));
    public static VarHandle cbStructure$VH() {
        return _DISCDLGSTRUCTA.cbStructure$VH;
    }
    public static int cbStructure$get(MemorySegment seg) {
        return (int)_DISCDLGSTRUCTA.cbStructure$VH.get(seg);
    }
    public static void cbStructure$set( MemorySegment seg, int x) {
        _DISCDLGSTRUCTA.cbStructure$VH.set(seg, x);
    }
    public static int cbStructure$get(MemorySegment seg, long index) {
        return (int)_DISCDLGSTRUCTA.cbStructure$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbStructure$set(MemorySegment seg, long index, int x) {
        _DISCDLGSTRUCTA.cbStructure$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndOwner"));
    public static VarHandle hwndOwner$VH() {
        return _DISCDLGSTRUCTA.hwndOwner$VH;
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_DISCDLGSTRUCTA.hwndOwner$VH.get(seg);
    }
    public static void hwndOwner$set( MemorySegment seg, MemoryAddress x) {
        _DISCDLGSTRUCTA.hwndOwner$VH.set(seg, x);
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_DISCDLGSTRUCTA.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        _DISCDLGSTRUCTA.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpLocalName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpLocalName"));
    public static VarHandle lpLocalName$VH() {
        return _DISCDLGSTRUCTA.lpLocalName$VH;
    }
    public static MemoryAddress lpLocalName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_DISCDLGSTRUCTA.lpLocalName$VH.get(seg);
    }
    public static void lpLocalName$set( MemorySegment seg, MemoryAddress x) {
        _DISCDLGSTRUCTA.lpLocalName$VH.set(seg, x);
    }
    public static MemoryAddress lpLocalName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_DISCDLGSTRUCTA.lpLocalName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpLocalName$set(MemorySegment seg, long index, MemoryAddress x) {
        _DISCDLGSTRUCTA.lpLocalName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpRemoteName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpRemoteName"));
    public static VarHandle lpRemoteName$VH() {
        return _DISCDLGSTRUCTA.lpRemoteName$VH;
    }
    public static MemoryAddress lpRemoteName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_DISCDLGSTRUCTA.lpRemoteName$VH.get(seg);
    }
    public static void lpRemoteName$set( MemorySegment seg, MemoryAddress x) {
        _DISCDLGSTRUCTA.lpRemoteName$VH.set(seg, x);
    }
    public static MemoryAddress lpRemoteName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_DISCDLGSTRUCTA.lpRemoteName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpRemoteName$set(MemorySegment seg, long index, MemoryAddress x) {
        _DISCDLGSTRUCTA.lpRemoteName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _DISCDLGSTRUCTA.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_DISCDLGSTRUCTA.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _DISCDLGSTRUCTA.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_DISCDLGSTRUCTA.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _DISCDLGSTRUCTA.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
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


