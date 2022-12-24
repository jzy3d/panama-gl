// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _WGLSWAP {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hdc"),
        Constants$root.C_LONG$LAYOUT.withName("uiFlags"),
        MemoryLayout.paddingLayout(32)
    ).withName("_WGLSWAP");
    public static MemoryLayout $LAYOUT() {
        return _WGLSWAP.$struct$LAYOUT;
    }
    static final VarHandle hdc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hdc"));
    public static VarHandle hdc$VH() {
        return _WGLSWAP.hdc$VH;
    }
    public static MemoryAddress hdc$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_WGLSWAP.hdc$VH.get(seg);
    }
    public static void hdc$set( MemorySegment seg, MemoryAddress x) {
        _WGLSWAP.hdc$VH.set(seg, x);
    }
    public static MemoryAddress hdc$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_WGLSWAP.hdc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hdc$set(MemorySegment seg, long index, MemoryAddress x) {
        _WGLSWAP.hdc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uiFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uiFlags"));
    public static VarHandle uiFlags$VH() {
        return _WGLSWAP.uiFlags$VH;
    }
    public static int uiFlags$get(MemorySegment seg) {
        return (int)_WGLSWAP.uiFlags$VH.get(seg);
    }
    public static void uiFlags$set( MemorySegment seg, int x) {
        _WGLSWAP.uiFlags$VH.set(seg, x);
    }
    public static int uiFlags$get(MemorySegment seg, long index) {
        return (int)_WGLSWAP.uiFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uiFlags$set(MemorySegment seg, long index, int x) {
        _WGLSWAP.uiFlags$VH.set(seg.asSlice(index*sizeof()), x);
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


