// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class tagEMRRESIZEPALETTE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        Constants$root.C_LONG$LAYOUT.withName("ihPal"),
        Constants$root.C_LONG$LAYOUT.withName("cEntries")
    ).withName("tagEMRRESIZEPALETTE");
    public static MemoryLayout $LAYOUT() {
        return tagEMRRESIZEPALETTE.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle ihPal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ihPal"));
    public static VarHandle ihPal$VH() {
        return tagEMRRESIZEPALETTE.ihPal$VH;
    }
    public static int ihPal$get(MemorySegment seg) {
        return (int)tagEMRRESIZEPALETTE.ihPal$VH.get(seg);
    }
    public static void ihPal$set( MemorySegment seg, int x) {
        tagEMRRESIZEPALETTE.ihPal$VH.set(seg, x);
    }
    public static int ihPal$get(MemorySegment seg, long index) {
        return (int)tagEMRRESIZEPALETTE.ihPal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ihPal$set(MemorySegment seg, long index, int x) {
        tagEMRRESIZEPALETTE.ihPal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cEntries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cEntries"));
    public static VarHandle cEntries$VH() {
        return tagEMRRESIZEPALETTE.cEntries$VH;
    }
    public static int cEntries$get(MemorySegment seg) {
        return (int)tagEMRRESIZEPALETTE.cEntries$VH.get(seg);
    }
    public static void cEntries$set( MemorySegment seg, int x) {
        tagEMRRESIZEPALETTE.cEntries$VH.set(seg, x);
    }
    public static int cEntries$get(MemorySegment seg, long index) {
        return (int)tagEMRRESIZEPALETTE.cEntries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cEntries$set(MemorySegment seg, long index, int x) {
        tagEMRRESIZEPALETTE.cEntries$VH.set(seg.asSlice(index*sizeof()), x);
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


