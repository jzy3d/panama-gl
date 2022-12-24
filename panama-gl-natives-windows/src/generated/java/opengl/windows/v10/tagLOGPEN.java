// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class tagLOGPEN {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("lopnStyle"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("lopnWidth"),
        Constants$root.C_LONG$LAYOUT.withName("lopnColor")
    ).withName("tagLOGPEN");
    public static MemoryLayout $LAYOUT() {
        return tagLOGPEN.$struct$LAYOUT;
    }
    static final VarHandle lopnStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lopnStyle"));
    public static VarHandle lopnStyle$VH() {
        return tagLOGPEN.lopnStyle$VH;
    }
    public static int lopnStyle$get(MemorySegment seg) {
        return (int)tagLOGPEN.lopnStyle$VH.get(seg);
    }
    public static void lopnStyle$set( MemorySegment seg, int x) {
        tagLOGPEN.lopnStyle$VH.set(seg, x);
    }
    public static int lopnStyle$get(MemorySegment seg, long index) {
        return (int)tagLOGPEN.lopnStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lopnStyle$set(MemorySegment seg, long index, int x) {
        tagLOGPEN.lopnStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lopnWidth$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
    }
    static final VarHandle lopnColor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lopnColor"));
    public static VarHandle lopnColor$VH() {
        return tagLOGPEN.lopnColor$VH;
    }
    public static int lopnColor$get(MemorySegment seg) {
        return (int)tagLOGPEN.lopnColor$VH.get(seg);
    }
    public static void lopnColor$set( MemorySegment seg, int x) {
        tagLOGPEN.lopnColor$VH.set(seg, x);
    }
    public static int lopnColor$get(MemorySegment seg, long index) {
        return (int)tagLOGPEN.lopnColor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lopnColor$set(MemorySegment seg, long index, int x) {
        tagLOGPEN.lopnColor$VH.set(seg.asSlice(index*sizeof()), x);
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


