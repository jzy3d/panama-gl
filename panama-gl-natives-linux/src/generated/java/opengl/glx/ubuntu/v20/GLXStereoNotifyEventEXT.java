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
public class GLXStereoNotifyEventEXT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("type"),
        MemoryLayout.paddingLayout(32),
        C_LONG.withName("serial"),
        C_INT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("display"),
        C_INT.withName("extension"),
        C_INT.withName("evtype"),
        C_LONG.withName("window"),
        C_INT.withName("stereo_tree"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return GLXStereoNotifyEventEXT.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return GLXStereoNotifyEventEXT.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)GLXStereoNotifyEventEXT.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        GLXStereoNotifyEventEXT.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)GLXStereoNotifyEventEXT.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        GLXStereoNotifyEventEXT.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return GLXStereoNotifyEventEXT.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)GLXStereoNotifyEventEXT.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        GLXStereoNotifyEventEXT.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)GLXStereoNotifyEventEXT.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        GLXStereoNotifyEventEXT.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return GLXStereoNotifyEventEXT.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)GLXStereoNotifyEventEXT.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        GLXStereoNotifyEventEXT.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)GLXStereoNotifyEventEXT.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        GLXStereoNotifyEventEXT.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("display")));
    public static VarHandle display$VH() {
        return GLXStereoNotifyEventEXT.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)GLXStereoNotifyEventEXT.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        GLXStereoNotifyEventEXT.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)GLXStereoNotifyEventEXT.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        GLXStereoNotifyEventEXT.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle extension$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("extension"));
    public static VarHandle extension$VH() {
        return GLXStereoNotifyEventEXT.extension$VH;
    }
    public static int extension$get(MemorySegment seg) {
        return (int)GLXStereoNotifyEventEXT.extension$VH.get(seg);
    }
    public static void extension$set( MemorySegment seg, int x) {
        GLXStereoNotifyEventEXT.extension$VH.set(seg, x);
    }
    public static int extension$get(MemorySegment seg, long index) {
        return (int)GLXStereoNotifyEventEXT.extension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void extension$set(MemorySegment seg, long index, int x) {
        GLXStereoNotifyEventEXT.extension$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle evtype$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("evtype"));
    public static VarHandle evtype$VH() {
        return GLXStereoNotifyEventEXT.evtype$VH;
    }
    public static int evtype$get(MemorySegment seg) {
        return (int)GLXStereoNotifyEventEXT.evtype$VH.get(seg);
    }
    public static void evtype$set( MemorySegment seg, int x) {
        GLXStereoNotifyEventEXT.evtype$VH.set(seg, x);
    }
    public static int evtype$get(MemorySegment seg, long index) {
        return (int)GLXStereoNotifyEventEXT.evtype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void evtype$set(MemorySegment seg, long index, int x) {
        GLXStereoNotifyEventEXT.evtype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return GLXStereoNotifyEventEXT.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)GLXStereoNotifyEventEXT.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        GLXStereoNotifyEventEXT.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)GLXStereoNotifyEventEXT.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        GLXStereoNotifyEventEXT.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle stereo_tree$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("stereo_tree"));
    public static VarHandle stereo_tree$VH() {
        return GLXStereoNotifyEventEXT.stereo_tree$VH;
    }
    public static int stereo_tree$get(MemorySegment seg) {
        return (int)GLXStereoNotifyEventEXT.stereo_tree$VH.get(seg);
    }
    public static void stereo_tree$set( MemorySegment seg, int x) {
        GLXStereoNotifyEventEXT.stereo_tree$VH.set(seg, x);
    }
    public static int stereo_tree$get(MemorySegment seg, long index) {
        return (int)GLXStereoNotifyEventEXT.stereo_tree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void stereo_tree$set(MemorySegment seg, long index, int x) {
        GLXStereoNotifyEventEXT.stereo_tree$VH.set(seg.asSlice(index*sizeof()), x);
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


