// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class XIconSize {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("min_width"),
        C_INT.withName("min_height"),
        C_INT.withName("max_width"),
        C_INT.withName("max_height"),
        C_INT.withName("width_inc"),
        C_INT.withName("height_inc")
    );
    public static MemoryLayout $LAYOUT() {
        return XIconSize.$struct$LAYOUT;
    }
    static final VarHandle min_width$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("min_width"));
    public static VarHandle min_width$VH() {
        return XIconSize.min_width$VH;
    }
    public static int min_width$get(MemorySegment seg) {
        return (int)XIconSize.min_width$VH.get(seg);
    }
    public static void min_width$set( MemorySegment seg, int x) {
        XIconSize.min_width$VH.set(seg, x);
    }
    public static int min_width$get(MemorySegment seg, long index) {
        return (int)XIconSize.min_width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void min_width$set(MemorySegment seg, long index, int x) {
        XIconSize.min_width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle min_height$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("min_height"));
    public static VarHandle min_height$VH() {
        return XIconSize.min_height$VH;
    }
    public static int min_height$get(MemorySegment seg) {
        return (int)XIconSize.min_height$VH.get(seg);
    }
    public static void min_height$set( MemorySegment seg, int x) {
        XIconSize.min_height$VH.set(seg, x);
    }
    public static int min_height$get(MemorySegment seg, long index) {
        return (int)XIconSize.min_height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void min_height$set(MemorySegment seg, long index, int x) {
        XIconSize.min_height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_width$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("max_width"));
    public static VarHandle max_width$VH() {
        return XIconSize.max_width$VH;
    }
    public static int max_width$get(MemorySegment seg) {
        return (int)XIconSize.max_width$VH.get(seg);
    }
    public static void max_width$set( MemorySegment seg, int x) {
        XIconSize.max_width$VH.set(seg, x);
    }
    public static int max_width$get(MemorySegment seg, long index) {
        return (int)XIconSize.max_width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_width$set(MemorySegment seg, long index, int x) {
        XIconSize.max_width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_height$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("max_height"));
    public static VarHandle max_height$VH() {
        return XIconSize.max_height$VH;
    }
    public static int max_height$get(MemorySegment seg) {
        return (int)XIconSize.max_height$VH.get(seg);
    }
    public static void max_height$set( MemorySegment seg, int x) {
        XIconSize.max_height$VH.set(seg, x);
    }
    public static int max_height$get(MemorySegment seg, long index) {
        return (int)XIconSize.max_height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_height$set(MemorySegment seg, long index, int x) {
        XIconSize.max_height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width_inc$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("width_inc"));
    public static VarHandle width_inc$VH() {
        return XIconSize.width_inc$VH;
    }
    public static int width_inc$get(MemorySegment seg) {
        return (int)XIconSize.width_inc$VH.get(seg);
    }
    public static void width_inc$set( MemorySegment seg, int x) {
        XIconSize.width_inc$VH.set(seg, x);
    }
    public static int width_inc$get(MemorySegment seg, long index) {
        return (int)XIconSize.width_inc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width_inc$set(MemorySegment seg, long index, int x) {
        XIconSize.width_inc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height_inc$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("height_inc"));
    public static VarHandle height_inc$VH() {
        return XIconSize.height_inc$VH;
    }
    public static int height_inc$get(MemorySegment seg) {
        return (int)XIconSize.height_inc$VH.get(seg);
    }
    public static void height_inc$set( MemorySegment seg, int x) {
        XIconSize.height_inc$VH.set(seg, x);
    }
    public static int height_inc$get(MemorySegment seg, long index) {
        return (int)XIconSize.height_inc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height_inc$set(MemorySegment seg, long index, int x) {
        XIconSize.height_inc$VH.set(seg.asSlice(index*sizeof()), x);
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


