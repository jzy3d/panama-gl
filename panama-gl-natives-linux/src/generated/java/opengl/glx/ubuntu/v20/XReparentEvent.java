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
public class XReparentEvent {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("type"),
        MemoryLayout.paddingLayout(32),
        C_LONG.withName("serial"),
        C_INT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("display"),
        C_LONG.withName("event"),
        C_LONG.withName("window"),
        C_LONG.withName("parent"),
        C_INT.withName("x"),
        C_INT.withName("y"),
        C_INT.withName("override_redirect"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return XReparentEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XReparentEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XReparentEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XReparentEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XReparentEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XReparentEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XReparentEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XReparentEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XReparentEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XReparentEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XReparentEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XReparentEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XReparentEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XReparentEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XReparentEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XReparentEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("display")));
    public static VarHandle display$VH() {
        return XReparentEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XReparentEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XReparentEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XReparentEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XReparentEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle event$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("event"));
    public static VarHandle event$VH() {
        return XReparentEvent.event$VH;
    }
    public static long event$get(MemorySegment seg) {
        return (long)XReparentEvent.event$VH.get(seg);
    }
    public static void event$set( MemorySegment seg, long x) {
        XReparentEvent.event$VH.set(seg, x);
    }
    public static long event$get(MemorySegment seg, long index) {
        return (long)XReparentEvent.event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void event$set(MemorySegment seg, long index, long x) {
        XReparentEvent.event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XReparentEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XReparentEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XReparentEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XReparentEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XReparentEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle parent$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("parent"));
    public static VarHandle parent$VH() {
        return XReparentEvent.parent$VH;
    }
    public static long parent$get(MemorySegment seg) {
        return (long)XReparentEvent.parent$VH.get(seg);
    }
    public static void parent$set( MemorySegment seg, long x) {
        XReparentEvent.parent$VH.set(seg, x);
    }
    public static long parent$get(MemorySegment seg, long index) {
        return (long)XReparentEvent.parent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void parent$set(MemorySegment seg, long index, long x) {
        XReparentEvent.parent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return XReparentEvent.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)XReparentEvent.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        XReparentEvent.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)XReparentEvent.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        XReparentEvent.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return XReparentEvent.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)XReparentEvent.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        XReparentEvent.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)XReparentEvent.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        XReparentEvent.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle override_redirect$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("override_redirect"));
    public static VarHandle override_redirect$VH() {
        return XReparentEvent.override_redirect$VH;
    }
    public static int override_redirect$get(MemorySegment seg) {
        return (int)XReparentEvent.override_redirect$VH.get(seg);
    }
    public static void override_redirect$set( MemorySegment seg, int x) {
        XReparentEvent.override_redirect$VH.set(seg, x);
    }
    public static int override_redirect$get(MemorySegment seg, long index) {
        return (int)XReparentEvent.override_redirect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void override_redirect$set(MemorySegment seg, long index, int x) {
        XReparentEvent.override_redirect$VH.set(seg.asSlice(index*sizeof()), x);
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


