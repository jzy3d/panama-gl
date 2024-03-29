// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
public class XEDataObject {

    static final MemoryLayout $union$LAYOUT = MemoryLayout.unionLayout(
        C_POINTER.withName("display"),
        C_POINTER.withName("gc"),
        C_POINTER.withName("visual"),
        C_POINTER.withName("screen"),
        C_POINTER.withName("pixmap_format"),
        C_POINTER.withName("font")
    );
    public static MemoryLayout $LAYOUT() {
        return XEDataObject.$union$LAYOUT;
    }
    static final VarHandle display$VH = MemoryHandles.asAddressVarHandle($union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("display")));
    public static VarHandle display$VH() {
        return XEDataObject.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XEDataObject.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XEDataObject.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XEDataObject.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XEDataObject.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle gc$VH = MemoryHandles.asAddressVarHandle($union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("gc")));
    public static VarHandle gc$VH() {
        return XEDataObject.gc$VH;
    }
    public static MemoryAddress gc$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XEDataObject.gc$VH.get(seg);
    }
    public static void gc$set( MemorySegment seg, MemoryAddress x) {
        XEDataObject.gc$VH.set(seg, x);
    }
    public static MemoryAddress gc$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XEDataObject.gc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gc$set(MemorySegment seg, long index, MemoryAddress x) {
        XEDataObject.gc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle visual$VH = MemoryHandles.asAddressVarHandle($union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("visual")));
    public static VarHandle visual$VH() {
        return XEDataObject.visual$VH;
    }
    public static MemoryAddress visual$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XEDataObject.visual$VH.get(seg);
    }
    public static void visual$set( MemorySegment seg, MemoryAddress x) {
        XEDataObject.visual$VH.set(seg, x);
    }
    public static MemoryAddress visual$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XEDataObject.visual$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void visual$set(MemorySegment seg, long index, MemoryAddress x) {
        XEDataObject.visual$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle screen$VH = MemoryHandles.asAddressVarHandle($union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("screen")));
    public static VarHandle screen$VH() {
        return XEDataObject.screen$VH;
    }
    public static MemoryAddress screen$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XEDataObject.screen$VH.get(seg);
    }
    public static void screen$set( MemorySegment seg, MemoryAddress x) {
        XEDataObject.screen$VH.set(seg, x);
    }
    public static MemoryAddress screen$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XEDataObject.screen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void screen$set(MemorySegment seg, long index, MemoryAddress x) {
        XEDataObject.screen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pixmap_format$VH = MemoryHandles.asAddressVarHandle($union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pixmap_format")));
    public static VarHandle pixmap_format$VH() {
        return XEDataObject.pixmap_format$VH;
    }
    public static MemoryAddress pixmap_format$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XEDataObject.pixmap_format$VH.get(seg);
    }
    public static void pixmap_format$set( MemorySegment seg, MemoryAddress x) {
        XEDataObject.pixmap_format$VH.set(seg, x);
    }
    public static MemoryAddress pixmap_format$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XEDataObject.pixmap_format$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pixmap_format$set(MemorySegment seg, long index, MemoryAddress x) {
        XEDataObject.pixmap_format$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle font$VH = MemoryHandles.asAddressVarHandle($union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("font")));
    public static VarHandle font$VH() {
        return XEDataObject.font$VH;
    }
    public static MemoryAddress font$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XEDataObject.font$VH.get(seg);
    }
    public static void font$set( MemorySegment seg, MemoryAddress x) {
        XEDataObject.font$VH.set(seg, x);
    }
    public static MemoryAddress font$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XEDataObject.font$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void font$set(MemorySegment seg, long index, MemoryAddress x) {
        XEDataObject.font$VH.set(seg.asSlice(index*sizeof()), x);
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


