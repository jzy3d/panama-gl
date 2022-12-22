// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class GLXHyperpipeConfigSGIX {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(80, C_CHAR).withName("pipeName"),
        C_INT.withName("channel"),
        C_INT.withName("participationType"),
        C_INT.withName("timeSlice")
    );
    public static MemoryLayout $LAYOUT() {
        return GLXHyperpipeConfigSGIX.$struct$LAYOUT;
    }
    public static MemorySegment pipeName$slice(MemorySegment seg) {
        return seg.asSlice(0, 80);
    }
    static final VarHandle channel$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("channel"));
    public static VarHandle channel$VH() {
        return GLXHyperpipeConfigSGIX.channel$VH;
    }
    public static int channel$get(MemorySegment seg) {
        return (int)GLXHyperpipeConfigSGIX.channel$VH.get(seg);
    }
    public static void channel$set( MemorySegment seg, int x) {
        GLXHyperpipeConfigSGIX.channel$VH.set(seg, x);
    }
    public static int channel$get(MemorySegment seg, long index) {
        return (int)GLXHyperpipeConfigSGIX.channel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void channel$set(MemorySegment seg, long index, int x) {
        GLXHyperpipeConfigSGIX.channel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle participationType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("participationType"));
    public static VarHandle participationType$VH() {
        return GLXHyperpipeConfigSGIX.participationType$VH;
    }
    public static int participationType$get(MemorySegment seg) {
        return (int)GLXHyperpipeConfigSGIX.participationType$VH.get(seg);
    }
    public static void participationType$set( MemorySegment seg, int x) {
        GLXHyperpipeConfigSGIX.participationType$VH.set(seg, x);
    }
    public static int participationType$get(MemorySegment seg, long index) {
        return (int)GLXHyperpipeConfigSGIX.participationType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void participationType$set(MemorySegment seg, long index, int x) {
        GLXHyperpipeConfigSGIX.participationType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle timeSlice$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("timeSlice"));
    public static VarHandle timeSlice$VH() {
        return GLXHyperpipeConfigSGIX.timeSlice$VH;
    }
    public static int timeSlice$get(MemorySegment seg) {
        return (int)GLXHyperpipeConfigSGIX.timeSlice$VH.get(seg);
    }
    public static void timeSlice$set( MemorySegment seg, int x) {
        GLXHyperpipeConfigSGIX.timeSlice$VH.set(seg, x);
    }
    public static int timeSlice$get(MemorySegment seg, long index) {
        return (int)GLXHyperpipeConfigSGIX.timeSlice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void timeSlice$set(MemorySegment seg, long index, int x) {
        GLXHyperpipeConfigSGIX.timeSlice$VH.set(seg.asSlice(index*sizeof()), x);
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


