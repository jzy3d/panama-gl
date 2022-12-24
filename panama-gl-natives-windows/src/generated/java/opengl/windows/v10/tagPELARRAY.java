// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class tagPELARRAY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("paXCount"),
        Constants$root.C_LONG$LAYOUT.withName("paYCount"),
        Constants$root.C_LONG$LAYOUT.withName("paXExt"),
        Constants$root.C_LONG$LAYOUT.withName("paYExt"),
        Constants$root.C_CHAR$LAYOUT.withName("paRGBs"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagPELARRAY");
    public static MemoryLayout $LAYOUT() {
        return tagPELARRAY.$struct$LAYOUT;
    }
    static final VarHandle paXCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("paXCount"));
    public static VarHandle paXCount$VH() {
        return tagPELARRAY.paXCount$VH;
    }
    public static int paXCount$get(MemorySegment seg) {
        return (int)tagPELARRAY.paXCount$VH.get(seg);
    }
    public static void paXCount$set( MemorySegment seg, int x) {
        tagPELARRAY.paXCount$VH.set(seg, x);
    }
    public static int paXCount$get(MemorySegment seg, long index) {
        return (int)tagPELARRAY.paXCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void paXCount$set(MemorySegment seg, long index, int x) {
        tagPELARRAY.paXCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle paYCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("paYCount"));
    public static VarHandle paYCount$VH() {
        return tagPELARRAY.paYCount$VH;
    }
    public static int paYCount$get(MemorySegment seg) {
        return (int)tagPELARRAY.paYCount$VH.get(seg);
    }
    public static void paYCount$set( MemorySegment seg, int x) {
        tagPELARRAY.paYCount$VH.set(seg, x);
    }
    public static int paYCount$get(MemorySegment seg, long index) {
        return (int)tagPELARRAY.paYCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void paYCount$set(MemorySegment seg, long index, int x) {
        tagPELARRAY.paYCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle paXExt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("paXExt"));
    public static VarHandle paXExt$VH() {
        return tagPELARRAY.paXExt$VH;
    }
    public static int paXExt$get(MemorySegment seg) {
        return (int)tagPELARRAY.paXExt$VH.get(seg);
    }
    public static void paXExt$set( MemorySegment seg, int x) {
        tagPELARRAY.paXExt$VH.set(seg, x);
    }
    public static int paXExt$get(MemorySegment seg, long index) {
        return (int)tagPELARRAY.paXExt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void paXExt$set(MemorySegment seg, long index, int x) {
        tagPELARRAY.paXExt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle paYExt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("paYExt"));
    public static VarHandle paYExt$VH() {
        return tagPELARRAY.paYExt$VH;
    }
    public static int paYExt$get(MemorySegment seg) {
        return (int)tagPELARRAY.paYExt$VH.get(seg);
    }
    public static void paYExt$set( MemorySegment seg, int x) {
        tagPELARRAY.paYExt$VH.set(seg, x);
    }
    public static int paYExt$get(MemorySegment seg, long index) {
        return (int)tagPELARRAY.paYExt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void paYExt$set(MemorySegment seg, long index, int x) {
        tagPELARRAY.paYExt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle paRGBs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("paRGBs"));
    public static VarHandle paRGBs$VH() {
        return tagPELARRAY.paRGBs$VH;
    }
    public static byte paRGBs$get(MemorySegment seg) {
        return (byte)tagPELARRAY.paRGBs$VH.get(seg);
    }
    public static void paRGBs$set( MemorySegment seg, byte x) {
        tagPELARRAY.paRGBs$VH.set(seg, x);
    }
    public static byte paRGBs$get(MemorySegment seg, long index) {
        return (byte)tagPELARRAY.paRGBs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void paRGBs$set(MemorySegment seg, long index, byte x) {
        tagPELARRAY.paRGBs$VH.set(seg.asSlice(index*sizeof()), x);
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


