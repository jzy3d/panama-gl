// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class XConfigureEvent {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("type"),
        MemoryLayout.paddingLayout(32),
        C_LONG.withName("serial"),
        C_INT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("display"),
        C_LONG.withName("event"),
        C_LONG.withName("window"),
        C_INT.withName("x"),
        C_INT.withName("y"),
        C_INT.withName("width"),
        C_INT.withName("height"),
        C_INT.withName("border_width"),
        MemoryLayout.paddingLayout(32),
        C_LONG.withName("above"),
        C_INT.withName("override_redirect"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return XConfigureEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XConfigureEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XConfigureEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XConfigureEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XConfigureEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XConfigureEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XConfigureEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XConfigureEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XConfigureEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XConfigureEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XConfigureEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XConfigureEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XConfigureEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XConfigureEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XConfigureEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XConfigureEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("display")));
    public static VarHandle display$VH() {
        return XConfigureEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XConfigureEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XConfigureEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XConfigureEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XConfigureEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle event$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("event"));
    public static VarHandle event$VH() {
        return XConfigureEvent.event$VH;
    }
    public static long event$get(MemorySegment seg) {
        return (long)XConfigureEvent.event$VH.get(seg);
    }
    public static void event$set( MemorySegment seg, long x) {
        XConfigureEvent.event$VH.set(seg, x);
    }
    public static long event$get(MemorySegment seg, long index) {
        return (long)XConfigureEvent.event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void event$set(MemorySegment seg, long index, long x) {
        XConfigureEvent.event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XConfigureEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XConfigureEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XConfigureEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XConfigureEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XConfigureEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return XConfigureEvent.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)XConfigureEvent.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        XConfigureEvent.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)XConfigureEvent.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        XConfigureEvent.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return XConfigureEvent.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)XConfigureEvent.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        XConfigureEvent.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)XConfigureEvent.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        XConfigureEvent.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return XConfigureEvent.width$VH;
    }
    public static int width$get(MemorySegment seg) {
        return (int)XConfigureEvent.width$VH.get(seg);
    }
    public static void width$set( MemorySegment seg, int x) {
        XConfigureEvent.width$VH.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)XConfigureEvent.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        XConfigureEvent.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return XConfigureEvent.height$VH;
    }
    public static int height$get(MemorySegment seg) {
        return (int)XConfigureEvent.height$VH.get(seg);
    }
    public static void height$set( MemorySegment seg, int x) {
        XConfigureEvent.height$VH.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)XConfigureEvent.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        XConfigureEvent.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle border_width$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("border_width"));
    public static VarHandle border_width$VH() {
        return XConfigureEvent.border_width$VH;
    }
    public static int border_width$get(MemorySegment seg) {
        return (int)XConfigureEvent.border_width$VH.get(seg);
    }
    public static void border_width$set( MemorySegment seg, int x) {
        XConfigureEvent.border_width$VH.set(seg, x);
    }
    public static int border_width$get(MemorySegment seg, long index) {
        return (int)XConfigureEvent.border_width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void border_width$set(MemorySegment seg, long index, int x) {
        XConfigureEvent.border_width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle above$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("above"));
    public static VarHandle above$VH() {
        return XConfigureEvent.above$VH;
    }
    public static long above$get(MemorySegment seg) {
        return (long)XConfigureEvent.above$VH.get(seg);
    }
    public static void above$set( MemorySegment seg, long x) {
        XConfigureEvent.above$VH.set(seg, x);
    }
    public static long above$get(MemorySegment seg, long index) {
        return (long)XConfigureEvent.above$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void above$set(MemorySegment seg, long index, long x) {
        XConfigureEvent.above$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle override_redirect$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("override_redirect"));
    public static VarHandle override_redirect$VH() {
        return XConfigureEvent.override_redirect$VH;
    }
    public static int override_redirect$get(MemorySegment seg) {
        return (int)XConfigureEvent.override_redirect$VH.get(seg);
    }
    public static void override_redirect$set( MemorySegment seg, int x) {
        XConfigureEvent.override_redirect$VH.set(seg, x);
    }
    public static int override_redirect$get(MemorySegment seg, long index) {
        return (int)XConfigureEvent.override_redirect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void override_redirect$set(MemorySegment seg, long index, int x) {
        XConfigureEvent.override_redirect$VH.set(seg.asSlice(index*sizeof()), x);
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


