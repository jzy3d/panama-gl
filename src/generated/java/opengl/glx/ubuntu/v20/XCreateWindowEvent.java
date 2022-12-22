// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class XCreateWindowEvent {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("type"),
        MemoryLayout.paddingLayout(32),
        C_LONG.withName("serial"),
        C_INT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("display"),
        C_LONG.withName("parent"),
        C_LONG.withName("window"),
        C_INT.withName("x"),
        C_INT.withName("y"),
        C_INT.withName("width"),
        C_INT.withName("height"),
        C_INT.withName("border_width"),
        C_INT.withName("override_redirect")
    );
    public static MemoryLayout $LAYOUT() {
        return XCreateWindowEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XCreateWindowEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XCreateWindowEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XCreateWindowEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XCreateWindowEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XCreateWindowEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XCreateWindowEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XCreateWindowEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XCreateWindowEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XCreateWindowEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XCreateWindowEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XCreateWindowEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XCreateWindowEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XCreateWindowEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XCreateWindowEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XCreateWindowEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("display")));
    public static VarHandle display$VH() {
        return XCreateWindowEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XCreateWindowEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XCreateWindowEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XCreateWindowEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XCreateWindowEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle parent$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("parent"));
    public static VarHandle parent$VH() {
        return XCreateWindowEvent.parent$VH;
    }
    public static long parent$get(MemorySegment seg) {
        return (long)XCreateWindowEvent.parent$VH.get(seg);
    }
    public static void parent$set( MemorySegment seg, long x) {
        XCreateWindowEvent.parent$VH.set(seg, x);
    }
    public static long parent$get(MemorySegment seg, long index) {
        return (long)XCreateWindowEvent.parent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void parent$set(MemorySegment seg, long index, long x) {
        XCreateWindowEvent.parent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XCreateWindowEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XCreateWindowEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XCreateWindowEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XCreateWindowEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XCreateWindowEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return XCreateWindowEvent.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)XCreateWindowEvent.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        XCreateWindowEvent.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)XCreateWindowEvent.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        XCreateWindowEvent.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return XCreateWindowEvent.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)XCreateWindowEvent.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        XCreateWindowEvent.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)XCreateWindowEvent.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        XCreateWindowEvent.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return XCreateWindowEvent.width$VH;
    }
    public static int width$get(MemorySegment seg) {
        return (int)XCreateWindowEvent.width$VH.get(seg);
    }
    public static void width$set( MemorySegment seg, int x) {
        XCreateWindowEvent.width$VH.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)XCreateWindowEvent.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        XCreateWindowEvent.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return XCreateWindowEvent.height$VH;
    }
    public static int height$get(MemorySegment seg) {
        return (int)XCreateWindowEvent.height$VH.get(seg);
    }
    public static void height$set( MemorySegment seg, int x) {
        XCreateWindowEvent.height$VH.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)XCreateWindowEvent.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        XCreateWindowEvent.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle border_width$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("border_width"));
    public static VarHandle border_width$VH() {
        return XCreateWindowEvent.border_width$VH;
    }
    public static int border_width$get(MemorySegment seg) {
        return (int)XCreateWindowEvent.border_width$VH.get(seg);
    }
    public static void border_width$set( MemorySegment seg, int x) {
        XCreateWindowEvent.border_width$VH.set(seg, x);
    }
    public static int border_width$get(MemorySegment seg, long index) {
        return (int)XCreateWindowEvent.border_width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void border_width$set(MemorySegment seg, long index, int x) {
        XCreateWindowEvent.border_width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle override_redirect$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("override_redirect"));
    public static VarHandle override_redirect$VH() {
        return XCreateWindowEvent.override_redirect$VH;
    }
    public static int override_redirect$get(MemorySegment seg) {
        return (int)XCreateWindowEvent.override_redirect$VH.get(seg);
    }
    public static void override_redirect$set( MemorySegment seg, int x) {
        XCreateWindowEvent.override_redirect$VH.set(seg, x);
    }
    public static int override_redirect$get(MemorySegment seg, long index) {
        return (int)XCreateWindowEvent.override_redirect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void override_redirect$set(MemorySegment seg, long index, int x) {
        XCreateWindowEvent.override_redirect$VH.set(seg.asSlice(index*sizeof()), x);
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


