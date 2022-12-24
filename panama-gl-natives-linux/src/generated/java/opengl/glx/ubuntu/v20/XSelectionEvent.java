// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
public class XSelectionEvent {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("type"),
        MemoryLayout.paddingLayout(32),
        C_LONG.withName("serial"),
        C_INT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("display"),
        C_LONG.withName("requestor"),
        C_LONG.withName("selection"),
        C_LONG.withName("target"),
        C_LONG.withName("property"),
        C_LONG.withName("time")
    );
    public static MemoryLayout $LAYOUT() {
        return XSelectionEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XSelectionEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XSelectionEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XSelectionEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XSelectionEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XSelectionEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XSelectionEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XSelectionEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XSelectionEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XSelectionEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XSelectionEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XSelectionEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XSelectionEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XSelectionEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XSelectionEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XSelectionEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("display")));
    public static VarHandle display$VH() {
        return XSelectionEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XSelectionEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XSelectionEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XSelectionEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XSelectionEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle requestor$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("requestor"));
    public static VarHandle requestor$VH() {
        return XSelectionEvent.requestor$VH;
    }
    public static long requestor$get(MemorySegment seg) {
        return (long)XSelectionEvent.requestor$VH.get(seg);
    }
    public static void requestor$set( MemorySegment seg, long x) {
        XSelectionEvent.requestor$VH.set(seg, x);
    }
    public static long requestor$get(MemorySegment seg, long index) {
        return (long)XSelectionEvent.requestor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void requestor$set(MemorySegment seg, long index, long x) {
        XSelectionEvent.requestor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle selection$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("selection"));
    public static VarHandle selection$VH() {
        return XSelectionEvent.selection$VH;
    }
    public static long selection$get(MemorySegment seg) {
        return (long)XSelectionEvent.selection$VH.get(seg);
    }
    public static void selection$set( MemorySegment seg, long x) {
        XSelectionEvent.selection$VH.set(seg, x);
    }
    public static long selection$get(MemorySegment seg, long index) {
        return (long)XSelectionEvent.selection$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void selection$set(MemorySegment seg, long index, long x) {
        XSelectionEvent.selection$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle target$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("target"));
    public static VarHandle target$VH() {
        return XSelectionEvent.target$VH;
    }
    public static long target$get(MemorySegment seg) {
        return (long)XSelectionEvent.target$VH.get(seg);
    }
    public static void target$set( MemorySegment seg, long x) {
        XSelectionEvent.target$VH.set(seg, x);
    }
    public static long target$get(MemorySegment seg, long index) {
        return (long)XSelectionEvent.target$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void target$set(MemorySegment seg, long index, long x) {
        XSelectionEvent.target$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle property$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("property"));
    public static VarHandle property$VH() {
        return XSelectionEvent.property$VH;
    }
    public static long property$get(MemorySegment seg) {
        return (long)XSelectionEvent.property$VH.get(seg);
    }
    public static void property$set( MemorySegment seg, long x) {
        XSelectionEvent.property$VH.set(seg, x);
    }
    public static long property$get(MemorySegment seg, long index) {
        return (long)XSelectionEvent.property$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void property$set(MemorySegment seg, long index, long x) {
        XSelectionEvent.property$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return XSelectionEvent.time$VH;
    }
    public static long time$get(MemorySegment seg) {
        return (long)XSelectionEvent.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, long x) {
        XSelectionEvent.time$VH.set(seg, x);
    }
    public static long time$get(MemorySegment seg, long index) {
        return (long)XSelectionEvent.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, long x) {
        XSelectionEvent.time$VH.set(seg.asSlice(index*sizeof()), x);
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

