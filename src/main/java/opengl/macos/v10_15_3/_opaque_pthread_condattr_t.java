// Generated by jextract

package opengl.macos.v10_15_3;

import java.lang.invoke.VarHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _opaque_pthread_condattr_t {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("__sig"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("__opaque")
    ).withName("_opaque_pthread_condattr_t");
    public static MemoryLayout $LAYOUT() {
        return _opaque_pthread_condattr_t.$struct$LAYOUT;
    }
    static final VarHandle __sig$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("__sig"));
    public static VarHandle __sig$VH() {
        return _opaque_pthread_condattr_t.__sig$VH;
    }
    public static long __sig$get(MemorySegment seg) {
        return (long)_opaque_pthread_condattr_t.__sig$VH.get(seg);
    }
    public static void __sig$set( MemorySegment seg, long x) {
        _opaque_pthread_condattr_t.__sig$VH.set(seg, x);
    }
    public static long __sig$get(MemorySegment seg, long index) {
        return (long)_opaque_pthread_condattr_t.__sig$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __sig$set(MemorySegment seg, long index, long x) {
        _opaque_pthread_condattr_t.__sig$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __opaque$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.ofScope(scope)); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


