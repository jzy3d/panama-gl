// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
public class Depth {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("depth"),
        C_INT.withName("nvisuals"),
        C_POINTER.withName("visuals")
    );
    public static MemoryLayout $LAYOUT() {
        return Depth.$struct$LAYOUT;
    }
    static final VarHandle depth$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("depth"));
    public static VarHandle depth$VH() {
        return Depth.depth$VH;
    }
    public static int depth$get(MemorySegment seg) {
        return (int)Depth.depth$VH.get(seg);
    }
    public static void depth$set( MemorySegment seg, int x) {
        Depth.depth$VH.set(seg, x);
    }
    public static int depth$get(MemorySegment seg, long index) {
        return (int)Depth.depth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void depth$set(MemorySegment seg, long index, int x) {
        Depth.depth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nvisuals$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nvisuals"));
    public static VarHandle nvisuals$VH() {
        return Depth.nvisuals$VH;
    }
    public static int nvisuals$get(MemorySegment seg) {
        return (int)Depth.nvisuals$VH.get(seg);
    }
    public static void nvisuals$set( MemorySegment seg, int x) {
        Depth.nvisuals$VH.set(seg, x);
    }
    public static int nvisuals$get(MemorySegment seg, long index) {
        return (int)Depth.nvisuals$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nvisuals$set(MemorySegment seg, long index, int x) {
        Depth.nvisuals$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle visuals$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("visuals")));
    public static VarHandle visuals$VH() {
        return Depth.visuals$VH;
    }
    public static MemoryAddress visuals$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)Depth.visuals$VH.get(seg);
    }
    public static void visuals$set( MemorySegment seg, MemoryAddress x) {
        Depth.visuals$VH.set(seg, x);
    }
    public static MemoryAddress visuals$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)Depth.visuals$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void visuals$set(MemorySegment seg, long index, MemoryAddress x) {
        Depth.visuals$VH.set(seg.asSlice(index*sizeof()), x);
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


