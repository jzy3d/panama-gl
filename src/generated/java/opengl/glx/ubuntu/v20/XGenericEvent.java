// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class XGenericEvent {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("type"),
        MemoryLayout.paddingLayout(32),
        C_LONG.withName("serial"),
        C_INT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("display"),
        C_INT.withName("extension"),
        C_INT.withName("evtype")
    );
    public static MemoryLayout $LAYOUT() {
        return XGenericEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XGenericEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XGenericEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XGenericEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XGenericEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XGenericEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XGenericEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XGenericEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XGenericEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XGenericEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XGenericEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XGenericEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XGenericEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XGenericEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XGenericEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XGenericEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("display")));
    public static VarHandle display$VH() {
        return XGenericEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XGenericEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XGenericEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XGenericEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XGenericEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle extension$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("extension"));
    public static VarHandle extension$VH() {
        return XGenericEvent.extension$VH;
    }
    public static int extension$get(MemorySegment seg) {
        return (int)XGenericEvent.extension$VH.get(seg);
    }
    public static void extension$set( MemorySegment seg, int x) {
        XGenericEvent.extension$VH.set(seg, x);
    }
    public static int extension$get(MemorySegment seg, long index) {
        return (int)XGenericEvent.extension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void extension$set(MemorySegment seg, long index, int x) {
        XGenericEvent.extension$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle evtype$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("evtype"));
    public static VarHandle evtype$VH() {
        return XGenericEvent.evtype$VH;
    }
    public static int evtype$get(MemorySegment seg) {
        return (int)XGenericEvent.evtype$VH.get(seg);
    }
    public static void evtype$set( MemorySegment seg, int x) {
        XGenericEvent.evtype$VH.set(seg, x);
    }
    public static int evtype$get(MemorySegment seg, long index) {
        return (int)XGenericEvent.evtype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void evtype$set(MemorySegment seg, long index, int x) {
        XGenericEvent.evtype$VH.set(seg.asSlice(index*sizeof()), x);
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


