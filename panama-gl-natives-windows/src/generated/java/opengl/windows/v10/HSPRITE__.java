// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class HSPRITE__ {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("unused")
    ).withName("HSPRITE__");
    public static MemoryLayout $LAYOUT() {
        return HSPRITE__.$struct$LAYOUT;
    }
    static final VarHandle unused$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("unused"));
    public static VarHandle unused$VH() {
        return HSPRITE__.unused$VH;
    }
    public static int unused$get(MemorySegment seg) {
        return (int)HSPRITE__.unused$VH.get(seg);
    }
    public static void unused$set( MemorySegment seg, int x) {
        HSPRITE__.unused$VH.set(seg, x);
    }
    public static int unused$get(MemorySegment seg, long index) {
        return (int)HSPRITE__.unused$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void unused$set(MemorySegment seg, long index, int x) {
        HSPRITE__.unused$VH.set(seg.asSlice(index*sizeof()), x);
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


