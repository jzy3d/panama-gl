// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _PSFEATURE_OUTPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("bPageIndependent"),
        Constants$root.C_LONG$LAYOUT.withName("bSetPageDevice")
    ).withName("_PSFEATURE_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _PSFEATURE_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle bPageIndependent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bPageIndependent"));
    public static VarHandle bPageIndependent$VH() {
        return _PSFEATURE_OUTPUT.bPageIndependent$VH;
    }
    public static int bPageIndependent$get(MemorySegment seg) {
        return (int)_PSFEATURE_OUTPUT.bPageIndependent$VH.get(seg);
    }
    public static void bPageIndependent$set( MemorySegment seg, int x) {
        _PSFEATURE_OUTPUT.bPageIndependent$VH.set(seg, x);
    }
    public static int bPageIndependent$get(MemorySegment seg, long index) {
        return (int)_PSFEATURE_OUTPUT.bPageIndependent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bPageIndependent$set(MemorySegment seg, long index, int x) {
        _PSFEATURE_OUTPUT.bPageIndependent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bSetPageDevice$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bSetPageDevice"));
    public static VarHandle bSetPageDevice$VH() {
        return _PSFEATURE_OUTPUT.bSetPageDevice$VH;
    }
    public static int bSetPageDevice$get(MemorySegment seg) {
        return (int)_PSFEATURE_OUTPUT.bSetPageDevice$VH.get(seg);
    }
    public static void bSetPageDevice$set( MemorySegment seg, int x) {
        _PSFEATURE_OUTPUT.bSetPageDevice$VH.set(seg, x);
    }
    public static int bSetPageDevice$get(MemorySegment seg, long index) {
        return (int)_PSFEATURE_OUTPUT.bSetPageDevice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bSetPageDevice$set(MemorySegment seg, long index, int x) {
        _PSFEATURE_OUTPUT.bSetPageDevice$VH.set(seg.asSlice(index*sizeof()), x);
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


