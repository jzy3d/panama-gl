// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class DISPLAYCONFIG_RATIONAL {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Numerator"),
        Constants$root.C_LONG$LAYOUT.withName("Denominator")
    ).withName("DISPLAYCONFIG_RATIONAL");
    public static MemoryLayout $LAYOUT() {
        return DISPLAYCONFIG_RATIONAL.$struct$LAYOUT;
    }
    static final VarHandle Numerator$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Numerator"));
    public static VarHandle Numerator$VH() {
        return DISPLAYCONFIG_RATIONAL.Numerator$VH;
    }
    public static int Numerator$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_RATIONAL.Numerator$VH.get(seg);
    }
    public static void Numerator$set( MemorySegment seg, int x) {
        DISPLAYCONFIG_RATIONAL.Numerator$VH.set(seg, x);
    }
    public static int Numerator$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_RATIONAL.Numerator$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Numerator$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_RATIONAL.Numerator$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Denominator$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Denominator"));
    public static VarHandle Denominator$VH() {
        return DISPLAYCONFIG_RATIONAL.Denominator$VH;
    }
    public static int Denominator$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_RATIONAL.Denominator$VH.get(seg);
    }
    public static void Denominator$set( MemorySegment seg, int x) {
        DISPLAYCONFIG_RATIONAL.Denominator$VH.set(seg, x);
    }
    public static int Denominator$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_RATIONAL.Denominator$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Denominator$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_RATIONAL.Denominator$VH.set(seg.asSlice(index*sizeof()), x);
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


