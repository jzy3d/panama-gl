// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class XVisualInfo {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("visual"),
        C_LONG.withName("visualid"),
        C_INT.withName("screen"),
        C_INT.withName("depth"),
        C_INT.withName("class"),
        MemoryLayout.paddingLayout(32),
        C_LONG.withName("red_mask"),
        C_LONG.withName("green_mask"),
        C_LONG.withName("blue_mask"),
        C_INT.withName("colormap_size"),
        C_INT.withName("bits_per_rgb")
    );
    public static MemoryLayout $LAYOUT() {
        return XVisualInfo.$struct$LAYOUT;
    }
    static final VarHandle visual$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("visual")));
    public static VarHandle visual$VH() {
        return XVisualInfo.visual$VH;
    }
    public static MemoryAddress visual$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XVisualInfo.visual$VH.get(seg);
    }
    public static void visual$set( MemorySegment seg, MemoryAddress x) {
        XVisualInfo.visual$VH.set(seg, x);
    }
    public static MemoryAddress visual$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XVisualInfo.visual$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void visual$set(MemorySegment seg, long index, MemoryAddress x) {
        XVisualInfo.visual$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle visualid$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("visualid"));
    public static VarHandle visualid$VH() {
        return XVisualInfo.visualid$VH;
    }
    public static long visualid$get(MemorySegment seg) {
        return (long)XVisualInfo.visualid$VH.get(seg);
    }
    public static void visualid$set( MemorySegment seg, long x) {
        XVisualInfo.visualid$VH.set(seg, x);
    }
    public static long visualid$get(MemorySegment seg, long index) {
        return (long)XVisualInfo.visualid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void visualid$set(MemorySegment seg, long index, long x) {
        XVisualInfo.visualid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle screen$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("screen"));
    public static VarHandle screen$VH() {
        return XVisualInfo.screen$VH;
    }
    public static int screen$get(MemorySegment seg) {
        return (int)XVisualInfo.screen$VH.get(seg);
    }
    public static void screen$set( MemorySegment seg, int x) {
        XVisualInfo.screen$VH.set(seg, x);
    }
    public static int screen$get(MemorySegment seg, long index) {
        return (int)XVisualInfo.screen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void screen$set(MemorySegment seg, long index, int x) {
        XVisualInfo.screen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle depth$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("depth"));
    public static VarHandle depth$VH() {
        return XVisualInfo.depth$VH;
    }
    public static int depth$get(MemorySegment seg) {
        return (int)XVisualInfo.depth$VH.get(seg);
    }
    public static void depth$set( MemorySegment seg, int x) {
        XVisualInfo.depth$VH.set(seg, x);
    }
    public static int depth$get(MemorySegment seg, long index) {
        return (int)XVisualInfo.depth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void depth$set(MemorySegment seg, long index, int x) {
        XVisualInfo.depth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle class_$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("class"));
    public static VarHandle class_$VH() {
        return XVisualInfo.class_$VH;
    }
    public static int class_$get(MemorySegment seg) {
        return (int)XVisualInfo.class_$VH.get(seg);
    }
    public static void class_$set( MemorySegment seg, int x) {
        XVisualInfo.class_$VH.set(seg, x);
    }
    public static int class_$get(MemorySegment seg, long index) {
        return (int)XVisualInfo.class_$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void class_$set(MemorySegment seg, long index, int x) {
        XVisualInfo.class_$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle red_mask$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("red_mask"));
    public static VarHandle red_mask$VH() {
        return XVisualInfo.red_mask$VH;
    }
    public static long red_mask$get(MemorySegment seg) {
        return (long)XVisualInfo.red_mask$VH.get(seg);
    }
    public static void red_mask$set( MemorySegment seg, long x) {
        XVisualInfo.red_mask$VH.set(seg, x);
    }
    public static long red_mask$get(MemorySegment seg, long index) {
        return (long)XVisualInfo.red_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void red_mask$set(MemorySegment seg, long index, long x) {
        XVisualInfo.red_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle green_mask$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("green_mask"));
    public static VarHandle green_mask$VH() {
        return XVisualInfo.green_mask$VH;
    }
    public static long green_mask$get(MemorySegment seg) {
        return (long)XVisualInfo.green_mask$VH.get(seg);
    }
    public static void green_mask$set( MemorySegment seg, long x) {
        XVisualInfo.green_mask$VH.set(seg, x);
    }
    public static long green_mask$get(MemorySegment seg, long index) {
        return (long)XVisualInfo.green_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void green_mask$set(MemorySegment seg, long index, long x) {
        XVisualInfo.green_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle blue_mask$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("blue_mask"));
    public static VarHandle blue_mask$VH() {
        return XVisualInfo.blue_mask$VH;
    }
    public static long blue_mask$get(MemorySegment seg) {
        return (long)XVisualInfo.blue_mask$VH.get(seg);
    }
    public static void blue_mask$set( MemorySegment seg, long x) {
        XVisualInfo.blue_mask$VH.set(seg, x);
    }
    public static long blue_mask$get(MemorySegment seg, long index) {
        return (long)XVisualInfo.blue_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void blue_mask$set(MemorySegment seg, long index, long x) {
        XVisualInfo.blue_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle colormap_size$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("colormap_size"));
    public static VarHandle colormap_size$VH() {
        return XVisualInfo.colormap_size$VH;
    }
    public static int colormap_size$get(MemorySegment seg) {
        return (int)XVisualInfo.colormap_size$VH.get(seg);
    }
    public static void colormap_size$set( MemorySegment seg, int x) {
        XVisualInfo.colormap_size$VH.set(seg, x);
    }
    public static int colormap_size$get(MemorySegment seg, long index) {
        return (int)XVisualInfo.colormap_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void colormap_size$set(MemorySegment seg, long index, int x) {
        XVisualInfo.colormap_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bits_per_rgb$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bits_per_rgb"));
    public static VarHandle bits_per_rgb$VH() {
        return XVisualInfo.bits_per_rgb$VH;
    }
    public static int bits_per_rgb$get(MemorySegment seg) {
        return (int)XVisualInfo.bits_per_rgb$VH.get(seg);
    }
    public static void bits_per_rgb$set( MemorySegment seg, int x) {
        XVisualInfo.bits_per_rgb$VH.set(seg, x);
    }
    public static int bits_per_rgb$get(MemorySegment seg, long index) {
        return (int)XVisualInfo.bits_per_rgb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bits_per_rgb$set(MemorySegment seg, long index, int x) {
        XVisualInfo.bits_per_rgb$VH.set(seg.asSlice(index*sizeof()), x);
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


