// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
public class XArc {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_SHORT.withName("x"),
        C_SHORT.withName("y"),
        C_SHORT.withName("width"),
        C_SHORT.withName("height"),
        C_SHORT.withName("angle1"),
        C_SHORT.withName("angle2")
    );
    public static MemoryLayout $LAYOUT() {
        return XArc.$struct$LAYOUT;
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return XArc.x$VH;
    }
    public static short x$get(MemorySegment seg) {
        return (short)XArc.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, short x) {
        XArc.x$VH.set(seg, x);
    }
    public static short x$get(MemorySegment seg, long index) {
        return (short)XArc.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, short x) {
        XArc.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return XArc.y$VH;
    }
    public static short y$get(MemorySegment seg) {
        return (short)XArc.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, short x) {
        XArc.y$VH.set(seg, x);
    }
    public static short y$get(MemorySegment seg, long index) {
        return (short)XArc.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, short x) {
        XArc.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return XArc.width$VH;
    }
    public static short width$get(MemorySegment seg) {
        return (short)XArc.width$VH.get(seg);
    }
    public static void width$set( MemorySegment seg, short x) {
        XArc.width$VH.set(seg, x);
    }
    public static short width$get(MemorySegment seg, long index) {
        return (short)XArc.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, short x) {
        XArc.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return XArc.height$VH;
    }
    public static short height$get(MemorySegment seg) {
        return (short)XArc.height$VH.get(seg);
    }
    public static void height$set( MemorySegment seg, short x) {
        XArc.height$VH.set(seg, x);
    }
    public static short height$get(MemorySegment seg, long index) {
        return (short)XArc.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, short x) {
        XArc.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle angle1$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("angle1"));
    public static VarHandle angle1$VH() {
        return XArc.angle1$VH;
    }
    public static short angle1$get(MemorySegment seg) {
        return (short)XArc.angle1$VH.get(seg);
    }
    public static void angle1$set( MemorySegment seg, short x) {
        XArc.angle1$VH.set(seg, x);
    }
    public static short angle1$get(MemorySegment seg, long index) {
        return (short)XArc.angle1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void angle1$set(MemorySegment seg, long index, short x) {
        XArc.angle1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle angle2$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("angle2"));
    public static VarHandle angle2$VH() {
        return XArc.angle2$VH;
    }
    public static short angle2$get(MemorySegment seg) {
        return (short)XArc.angle2$VH.get(seg);
    }
    public static void angle2$set( MemorySegment seg, short x) {
        XArc.angle2$VH.set(seg, x);
    }
    public static short angle2$get(MemorySegment seg, long index) {
        return (short)XArc.angle2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void angle2$set(MemorySegment seg, long index, short x) {
        XArc.angle2$VH.set(seg.asSlice(index*sizeof()), x);
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

