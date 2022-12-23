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
public class XKeyEvent {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("type"),
        MemoryLayout.paddingLayout(32),
        C_LONG.withName("serial"),
        C_INT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("display"),
        C_LONG.withName("window"),
        C_LONG.withName("root"),
        C_LONG.withName("subwindow"),
        C_LONG.withName("time"),
        C_INT.withName("x"),
        C_INT.withName("y"),
        C_INT.withName("x_root"),
        C_INT.withName("y_root"),
        C_INT.withName("state"),
        C_INT.withName("keycode"),
        C_INT.withName("same_screen"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return XKeyEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XKeyEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XKeyEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XKeyEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XKeyEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XKeyEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XKeyEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XKeyEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XKeyEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XKeyEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XKeyEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XKeyEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XKeyEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XKeyEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("display")));
    public static VarHandle display$VH() {
        return XKeyEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XKeyEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XKeyEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XKeyEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XKeyEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XKeyEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XKeyEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XKeyEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XKeyEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XKeyEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle root$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("root"));
    public static VarHandle root$VH() {
        return XKeyEvent.root$VH;
    }
    public static long root$get(MemorySegment seg) {
        return (long)XKeyEvent.root$VH.get(seg);
    }
    public static void root$set( MemorySegment seg, long x) {
        XKeyEvent.root$VH.set(seg, x);
    }
    public static long root$get(MemorySegment seg, long index) {
        return (long)XKeyEvent.root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void root$set(MemorySegment seg, long index, long x) {
        XKeyEvent.root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle subwindow$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("subwindow"));
    public static VarHandle subwindow$VH() {
        return XKeyEvent.subwindow$VH;
    }
    public static long subwindow$get(MemorySegment seg) {
        return (long)XKeyEvent.subwindow$VH.get(seg);
    }
    public static void subwindow$set( MemorySegment seg, long x) {
        XKeyEvent.subwindow$VH.set(seg, x);
    }
    public static long subwindow$get(MemorySegment seg, long index) {
        return (long)XKeyEvent.subwindow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void subwindow$set(MemorySegment seg, long index, long x) {
        XKeyEvent.subwindow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return XKeyEvent.time$VH;
    }
    public static long time$get(MemorySegment seg) {
        return (long)XKeyEvent.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, long x) {
        XKeyEvent.time$VH.set(seg, x);
    }
    public static long time$get(MemorySegment seg, long index) {
        return (long)XKeyEvent.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, long x) {
        XKeyEvent.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return XKeyEvent.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)XKeyEvent.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        XKeyEvent.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        XKeyEvent.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return XKeyEvent.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)XKeyEvent.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        XKeyEvent.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        XKeyEvent.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x_root$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("x_root"));
    public static VarHandle x_root$VH() {
        return XKeyEvent.x_root$VH;
    }
    public static int x_root$get(MemorySegment seg) {
        return (int)XKeyEvent.x_root$VH.get(seg);
    }
    public static void x_root$set( MemorySegment seg, int x) {
        XKeyEvent.x_root$VH.set(seg, x);
    }
    public static int x_root$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.x_root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x_root$set(MemorySegment seg, long index, int x) {
        XKeyEvent.x_root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y_root$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("y_root"));
    public static VarHandle y_root$VH() {
        return XKeyEvent.y_root$VH;
    }
    public static int y_root$get(MemorySegment seg) {
        return (int)XKeyEvent.y_root$VH.get(seg);
    }
    public static void y_root$set( MemorySegment seg, int x) {
        XKeyEvent.y_root$VH.set(seg, x);
    }
    public static int y_root$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.y_root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y_root$set(MemorySegment seg, long index, int x) {
        XKeyEvent.y_root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle state$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("state"));
    public static VarHandle state$VH() {
        return XKeyEvent.state$VH;
    }
    public static int state$get(MemorySegment seg) {
        return (int)XKeyEvent.state$VH.get(seg);
    }
    public static void state$set( MemorySegment seg, int x) {
        XKeyEvent.state$VH.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        XKeyEvent.state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle keycode$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("keycode"));
    public static VarHandle keycode$VH() {
        return XKeyEvent.keycode$VH;
    }
    public static int keycode$get(MemorySegment seg) {
        return (int)XKeyEvent.keycode$VH.get(seg);
    }
    public static void keycode$set( MemorySegment seg, int x) {
        XKeyEvent.keycode$VH.set(seg, x);
    }
    public static int keycode$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.keycode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void keycode$set(MemorySegment seg, long index, int x) {
        XKeyEvent.keycode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle same_screen$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("same_screen"));
    public static VarHandle same_screen$VH() {
        return XKeyEvent.same_screen$VH;
    }
    public static int same_screen$get(MemorySegment seg) {
        return (int)XKeyEvent.same_screen$VH.get(seg);
    }
    public static void same_screen$set( MemorySegment seg, int x) {
        XKeyEvent.same_screen$VH.set(seg, x);
    }
    public static int same_screen$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.same_screen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void same_screen$set(MemorySegment seg, long index, int x) {
        XKeyEvent.same_screen$VH.set(seg.asSlice(index*sizeof()), x);
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


