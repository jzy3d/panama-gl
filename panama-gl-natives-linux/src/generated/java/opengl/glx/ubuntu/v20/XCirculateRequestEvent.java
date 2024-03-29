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
public class XCirculateRequestEvent {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("type"),
        MemoryLayout.paddingLayout(32),
        C_LONG.withName("serial"),
        C_INT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("display"),
        C_LONG.withName("parent"),
        C_LONG.withName("window"),
        C_INT.withName("place"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return XCirculateRequestEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XCirculateRequestEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XCirculateRequestEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XCirculateRequestEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XCirculateRequestEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XCirculateRequestEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XCirculateRequestEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XCirculateRequestEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XCirculateRequestEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XCirculateRequestEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XCirculateRequestEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XCirculateRequestEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XCirculateRequestEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XCirculateRequestEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XCirculateRequestEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XCirculateRequestEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("display")));
    public static VarHandle display$VH() {
        return XCirculateRequestEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XCirculateRequestEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XCirculateRequestEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XCirculateRequestEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XCirculateRequestEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle parent$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("parent"));
    public static VarHandle parent$VH() {
        return XCirculateRequestEvent.parent$VH;
    }
    public static long parent$get(MemorySegment seg) {
        return (long)XCirculateRequestEvent.parent$VH.get(seg);
    }
    public static void parent$set( MemorySegment seg, long x) {
        XCirculateRequestEvent.parent$VH.set(seg, x);
    }
    public static long parent$get(MemorySegment seg, long index) {
        return (long)XCirculateRequestEvent.parent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void parent$set(MemorySegment seg, long index, long x) {
        XCirculateRequestEvent.parent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XCirculateRequestEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XCirculateRequestEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XCirculateRequestEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XCirculateRequestEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XCirculateRequestEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle place$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("place"));
    public static VarHandle place$VH() {
        return XCirculateRequestEvent.place$VH;
    }
    public static int place$get(MemorySegment seg) {
        return (int)XCirculateRequestEvent.place$VH.get(seg);
    }
    public static void place$set( MemorySegment seg, int x) {
        XCirculateRequestEvent.place$VH.set(seg, x);
    }
    public static int place$get(MemorySegment seg, long index) {
        return (int)XCirculateRequestEvent.place$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void place$set(MemorySegment seg, long index, int x) {
        XCirculateRequestEvent.place$VH.set(seg.asSlice(index*sizeof()), x);
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


