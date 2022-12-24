// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GRADIENT_RECT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("UpperLeft"),
        Constants$root.C_LONG$LAYOUT.withName("LowerRight")
    ).withName("_GRADIENT_RECT");
    public static MemoryLayout $LAYOUT() {
        return _GRADIENT_RECT.$struct$LAYOUT;
    }
    static final VarHandle UpperLeft$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UpperLeft"));
    public static VarHandle UpperLeft$VH() {
        return _GRADIENT_RECT.UpperLeft$VH;
    }
    public static int UpperLeft$get(MemorySegment seg) {
        return (int)_GRADIENT_RECT.UpperLeft$VH.get(seg);
    }
    public static void UpperLeft$set( MemorySegment seg, int x) {
        _GRADIENT_RECT.UpperLeft$VH.set(seg, x);
    }
    public static int UpperLeft$get(MemorySegment seg, long index) {
        return (int)_GRADIENT_RECT.UpperLeft$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UpperLeft$set(MemorySegment seg, long index, int x) {
        _GRADIENT_RECT.UpperLeft$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LowerRight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LowerRight"));
    public static VarHandle LowerRight$VH() {
        return _GRADIENT_RECT.LowerRight$VH;
    }
    public static int LowerRight$get(MemorySegment seg) {
        return (int)_GRADIENT_RECT.LowerRight$VH.get(seg);
    }
    public static void LowerRight$set( MemorySegment seg, int x) {
        _GRADIENT_RECT.LowerRight$VH.set(seg, x);
    }
    public static int LowerRight$get(MemorySegment seg, long index) {
        return (int)_GRADIENT_RECT.LowerRight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LowerRight$set(MemorySegment seg, long index, int x) {
        _GRADIENT_RECT.LowerRight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


