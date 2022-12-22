// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class XCrossingEvent {

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
        C_INT.withName("mode"),
        C_INT.withName("detail"),
        C_INT.withName("same_screen"),
        C_INT.withName("focus"),
        C_INT.withName("state"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return XCrossingEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XCrossingEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XCrossingEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XCrossingEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XCrossingEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XCrossingEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XCrossingEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XCrossingEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XCrossingEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XCrossingEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XCrossingEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XCrossingEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XCrossingEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XCrossingEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XCrossingEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XCrossingEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("display")));
    public static VarHandle display$VH() {
        return XCrossingEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XCrossingEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XCrossingEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XCrossingEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XCrossingEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XCrossingEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XCrossingEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XCrossingEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XCrossingEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XCrossingEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle root$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("root"));
    public static VarHandle root$VH() {
        return XCrossingEvent.root$VH;
    }
    public static long root$get(MemorySegment seg) {
        return (long)XCrossingEvent.root$VH.get(seg);
    }
    public static void root$set( MemorySegment seg, long x) {
        XCrossingEvent.root$VH.set(seg, x);
    }
    public static long root$get(MemorySegment seg, long index) {
        return (long)XCrossingEvent.root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void root$set(MemorySegment seg, long index, long x) {
        XCrossingEvent.root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle subwindow$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("subwindow"));
    public static VarHandle subwindow$VH() {
        return XCrossingEvent.subwindow$VH;
    }
    public static long subwindow$get(MemorySegment seg) {
        return (long)XCrossingEvent.subwindow$VH.get(seg);
    }
    public static void subwindow$set( MemorySegment seg, long x) {
        XCrossingEvent.subwindow$VH.set(seg, x);
    }
    public static long subwindow$get(MemorySegment seg, long index) {
        return (long)XCrossingEvent.subwindow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void subwindow$set(MemorySegment seg, long index, long x) {
        XCrossingEvent.subwindow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return XCrossingEvent.time$VH;
    }
    public static long time$get(MemorySegment seg) {
        return (long)XCrossingEvent.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, long x) {
        XCrossingEvent.time$VH.set(seg, x);
    }
    public static long time$get(MemorySegment seg, long index) {
        return (long)XCrossingEvent.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, long x) {
        XCrossingEvent.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return XCrossingEvent.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)XCrossingEvent.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        XCrossingEvent.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)XCrossingEvent.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        XCrossingEvent.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return XCrossingEvent.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)XCrossingEvent.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        XCrossingEvent.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)XCrossingEvent.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        XCrossingEvent.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x_root$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("x_root"));
    public static VarHandle x_root$VH() {
        return XCrossingEvent.x_root$VH;
    }
    public static int x_root$get(MemorySegment seg) {
        return (int)XCrossingEvent.x_root$VH.get(seg);
    }
    public static void x_root$set( MemorySegment seg, int x) {
        XCrossingEvent.x_root$VH.set(seg, x);
    }
    public static int x_root$get(MemorySegment seg, long index) {
        return (int)XCrossingEvent.x_root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x_root$set(MemorySegment seg, long index, int x) {
        XCrossingEvent.x_root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y_root$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("y_root"));
    public static VarHandle y_root$VH() {
        return XCrossingEvent.y_root$VH;
    }
    public static int y_root$get(MemorySegment seg) {
        return (int)XCrossingEvent.y_root$VH.get(seg);
    }
    public static void y_root$set( MemorySegment seg, int x) {
        XCrossingEvent.y_root$VH.set(seg, x);
    }
    public static int y_root$get(MemorySegment seg, long index) {
        return (int)XCrossingEvent.y_root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y_root$set(MemorySegment seg, long index, int x) {
        XCrossingEvent.y_root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mode$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("mode"));
    public static VarHandle mode$VH() {
        return XCrossingEvent.mode$VH;
    }
    public static int mode$get(MemorySegment seg) {
        return (int)XCrossingEvent.mode$VH.get(seg);
    }
    public static void mode$set( MemorySegment seg, int x) {
        XCrossingEvent.mode$VH.set(seg, x);
    }
    public static int mode$get(MemorySegment seg, long index) {
        return (int)XCrossingEvent.mode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mode$set(MemorySegment seg, long index, int x) {
        XCrossingEvent.mode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle detail$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("detail"));
    public static VarHandle detail$VH() {
        return XCrossingEvent.detail$VH;
    }
    public static int detail$get(MemorySegment seg) {
        return (int)XCrossingEvent.detail$VH.get(seg);
    }
    public static void detail$set( MemorySegment seg, int x) {
        XCrossingEvent.detail$VH.set(seg, x);
    }
    public static int detail$get(MemorySegment seg, long index) {
        return (int)XCrossingEvent.detail$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void detail$set(MemorySegment seg, long index, int x) {
        XCrossingEvent.detail$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle same_screen$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("same_screen"));
    public static VarHandle same_screen$VH() {
        return XCrossingEvent.same_screen$VH;
    }
    public static int same_screen$get(MemorySegment seg) {
        return (int)XCrossingEvent.same_screen$VH.get(seg);
    }
    public static void same_screen$set( MemorySegment seg, int x) {
        XCrossingEvent.same_screen$VH.set(seg, x);
    }
    public static int same_screen$get(MemorySegment seg, long index) {
        return (int)XCrossingEvent.same_screen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void same_screen$set(MemorySegment seg, long index, int x) {
        XCrossingEvent.same_screen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle focus$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("focus"));
    public static VarHandle focus$VH() {
        return XCrossingEvent.focus$VH;
    }
    public static int focus$get(MemorySegment seg) {
        return (int)XCrossingEvent.focus$VH.get(seg);
    }
    public static void focus$set( MemorySegment seg, int x) {
        XCrossingEvent.focus$VH.set(seg, x);
    }
    public static int focus$get(MemorySegment seg, long index) {
        return (int)XCrossingEvent.focus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void focus$set(MemorySegment seg, long index, int x) {
        XCrossingEvent.focus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle state$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("state"));
    public static VarHandle state$VH() {
        return XCrossingEvent.state$VH;
    }
    public static int state$get(MemorySegment seg) {
        return (int)XCrossingEvent.state$VH.get(seg);
    }
    public static void state$set( MemorySegment seg, int x) {
        XCrossingEvent.state$VH.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)XCrossingEvent.state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        XCrossingEvent.state$VH.set(seg.asSlice(index*sizeof()), x);
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


