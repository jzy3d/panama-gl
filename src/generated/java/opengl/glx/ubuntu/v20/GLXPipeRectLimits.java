// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class GLXPipeRectLimits {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(80, C_CHAR).withName("pipeName"),
        C_INT.withName("XOrigin"),
        C_INT.withName("YOrigin"),
        C_INT.withName("maxHeight"),
        C_INT.withName("maxWidth")
    );
    public static MemoryLayout $LAYOUT() {
        return GLXPipeRectLimits.$struct$LAYOUT;
    }
    public static MemorySegment pipeName$slice(MemorySegment seg) {
        return seg.asSlice(0, 80);
    }
    static final VarHandle XOrigin$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("XOrigin"));
    public static VarHandle XOrigin$VH() {
        return GLXPipeRectLimits.XOrigin$VH;
    }
    public static int XOrigin$get(MemorySegment seg) {
        return (int)GLXPipeRectLimits.XOrigin$VH.get(seg);
    }
    public static void XOrigin$set( MemorySegment seg, int x) {
        GLXPipeRectLimits.XOrigin$VH.set(seg, x);
    }
    public static int XOrigin$get(MemorySegment seg, long index) {
        return (int)GLXPipeRectLimits.XOrigin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void XOrigin$set(MemorySegment seg, long index, int x) {
        GLXPipeRectLimits.XOrigin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle YOrigin$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("YOrigin"));
    public static VarHandle YOrigin$VH() {
        return GLXPipeRectLimits.YOrigin$VH;
    }
    public static int YOrigin$get(MemorySegment seg) {
        return (int)GLXPipeRectLimits.YOrigin$VH.get(seg);
    }
    public static void YOrigin$set( MemorySegment seg, int x) {
        GLXPipeRectLimits.YOrigin$VH.set(seg, x);
    }
    public static int YOrigin$get(MemorySegment seg, long index) {
        return (int)GLXPipeRectLimits.YOrigin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void YOrigin$set(MemorySegment seg, long index, int x) {
        GLXPipeRectLimits.YOrigin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle maxHeight$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("maxHeight"));
    public static VarHandle maxHeight$VH() {
        return GLXPipeRectLimits.maxHeight$VH;
    }
    public static int maxHeight$get(MemorySegment seg) {
        return (int)GLXPipeRectLimits.maxHeight$VH.get(seg);
    }
    public static void maxHeight$set( MemorySegment seg, int x) {
        GLXPipeRectLimits.maxHeight$VH.set(seg, x);
    }
    public static int maxHeight$get(MemorySegment seg, long index) {
        return (int)GLXPipeRectLimits.maxHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void maxHeight$set(MemorySegment seg, long index, int x) {
        GLXPipeRectLimits.maxHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle maxWidth$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("maxWidth"));
    public static VarHandle maxWidth$VH() {
        return GLXPipeRectLimits.maxWidth$VH;
    }
    public static int maxWidth$get(MemorySegment seg) {
        return (int)GLXPipeRectLimits.maxWidth$VH.get(seg);
    }
    public static void maxWidth$set( MemorySegment seg, int x) {
        GLXPipeRectLimits.maxWidth$VH.set(seg, x);
    }
    public static int maxWidth$get(MemorySegment seg, long index) {
        return (int)GLXPipeRectLimits.maxWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void maxWidth$set(MemorySegment seg, long index, int x) {
        GLXPipeRectLimits.maxWidth$VH.set(seg.asSlice(index*sizeof()), x);
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


