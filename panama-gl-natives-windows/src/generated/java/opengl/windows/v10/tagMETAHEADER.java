// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class tagMETAHEADER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("mtType"),
        Constants$root.C_SHORT$LAYOUT.withName("mtHeaderSize"),
        Constants$root.C_SHORT$LAYOUT.withName("mtVersion"),
        Constants$root.C_LONG$LAYOUT.withName("mtSize"),
        Constants$root.C_SHORT$LAYOUT.withName("mtNoObjects"),
        Constants$root.C_LONG$LAYOUT.withName("mtMaxRecord"),
        Constants$root.C_SHORT$LAYOUT.withName("mtNoParameters")
    ).withName("tagMETAHEADER");
    public static MemoryLayout $LAYOUT() {
        return tagMETAHEADER.$struct$LAYOUT;
    }
    static final VarHandle mtType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mtType"));
    public static VarHandle mtType$VH() {
        return tagMETAHEADER.mtType$VH;
    }
    public static short mtType$get(MemorySegment seg) {
        return (short)tagMETAHEADER.mtType$VH.get(seg);
    }
    public static void mtType$set( MemorySegment seg, short x) {
        tagMETAHEADER.mtType$VH.set(seg, x);
    }
    public static short mtType$get(MemorySegment seg, long index) {
        return (short)tagMETAHEADER.mtType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mtType$set(MemorySegment seg, long index, short x) {
        tagMETAHEADER.mtType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mtHeaderSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mtHeaderSize"));
    public static VarHandle mtHeaderSize$VH() {
        return tagMETAHEADER.mtHeaderSize$VH;
    }
    public static short mtHeaderSize$get(MemorySegment seg) {
        return (short)tagMETAHEADER.mtHeaderSize$VH.get(seg);
    }
    public static void mtHeaderSize$set( MemorySegment seg, short x) {
        tagMETAHEADER.mtHeaderSize$VH.set(seg, x);
    }
    public static short mtHeaderSize$get(MemorySegment seg, long index) {
        return (short)tagMETAHEADER.mtHeaderSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mtHeaderSize$set(MemorySegment seg, long index, short x) {
        tagMETAHEADER.mtHeaderSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mtVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mtVersion"));
    public static VarHandle mtVersion$VH() {
        return tagMETAHEADER.mtVersion$VH;
    }
    public static short mtVersion$get(MemorySegment seg) {
        return (short)tagMETAHEADER.mtVersion$VH.get(seg);
    }
    public static void mtVersion$set( MemorySegment seg, short x) {
        tagMETAHEADER.mtVersion$VH.set(seg, x);
    }
    public static short mtVersion$get(MemorySegment seg, long index) {
        return (short)tagMETAHEADER.mtVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mtVersion$set(MemorySegment seg, long index, short x) {
        tagMETAHEADER.mtVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mtSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mtSize"));
    public static VarHandle mtSize$VH() {
        return tagMETAHEADER.mtSize$VH;
    }
    public static int mtSize$get(MemorySegment seg) {
        return (int)tagMETAHEADER.mtSize$VH.get(seg);
    }
    public static void mtSize$set( MemorySegment seg, int x) {
        tagMETAHEADER.mtSize$VH.set(seg, x);
    }
    public static int mtSize$get(MemorySegment seg, long index) {
        return (int)tagMETAHEADER.mtSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mtSize$set(MemorySegment seg, long index, int x) {
        tagMETAHEADER.mtSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mtNoObjects$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mtNoObjects"));
    public static VarHandle mtNoObjects$VH() {
        return tagMETAHEADER.mtNoObjects$VH;
    }
    public static short mtNoObjects$get(MemorySegment seg) {
        return (short)tagMETAHEADER.mtNoObjects$VH.get(seg);
    }
    public static void mtNoObjects$set( MemorySegment seg, short x) {
        tagMETAHEADER.mtNoObjects$VH.set(seg, x);
    }
    public static short mtNoObjects$get(MemorySegment seg, long index) {
        return (short)tagMETAHEADER.mtNoObjects$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mtNoObjects$set(MemorySegment seg, long index, short x) {
        tagMETAHEADER.mtNoObjects$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mtMaxRecord$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mtMaxRecord"));
    public static VarHandle mtMaxRecord$VH() {
        return tagMETAHEADER.mtMaxRecord$VH;
    }
    public static int mtMaxRecord$get(MemorySegment seg) {
        return (int)tagMETAHEADER.mtMaxRecord$VH.get(seg);
    }
    public static void mtMaxRecord$set( MemorySegment seg, int x) {
        tagMETAHEADER.mtMaxRecord$VH.set(seg, x);
    }
    public static int mtMaxRecord$get(MemorySegment seg, long index) {
        return (int)tagMETAHEADER.mtMaxRecord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mtMaxRecord$set(MemorySegment seg, long index, int x) {
        tagMETAHEADER.mtMaxRecord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mtNoParameters$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mtNoParameters"));
    public static VarHandle mtNoParameters$VH() {
        return tagMETAHEADER.mtNoParameters$VH;
    }
    public static short mtNoParameters$get(MemorySegment seg) {
        return (short)tagMETAHEADER.mtNoParameters$VH.get(seg);
    }
    public static void mtNoParameters$set( MemorySegment seg, short x) {
        tagMETAHEADER.mtNoParameters$VH.set(seg, x);
    }
    public static short mtNoParameters$get(MemorySegment seg, long index) {
        return (short)tagMETAHEADER.mtNoParameters$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mtNoParameters$set(MemorySegment seg, long index, short x) {
        tagMETAHEADER.mtNoParameters$VH.set(seg.asSlice(index*sizeof()), x);
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


