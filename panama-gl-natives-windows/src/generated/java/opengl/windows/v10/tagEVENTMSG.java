// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class tagEVENTMSG {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("message"),
        Constants$root.C_LONG$LAYOUT.withName("paramL"),
        Constants$root.C_LONG$LAYOUT.withName("paramH"),
        Constants$root.C_LONG$LAYOUT.withName("time"),
        Constants$root.C_POINTER$LAYOUT.withName("hwnd")
    ).withName("tagEVENTMSG");
    public static MemoryLayout $LAYOUT() {
        return tagEVENTMSG.$struct$LAYOUT;
    }
    static final VarHandle message$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("message"));
    public static VarHandle message$VH() {
        return tagEVENTMSG.message$VH;
    }
    public static int message$get(MemorySegment seg) {
        return (int)tagEVENTMSG.message$VH.get(seg);
    }
    public static void message$set( MemorySegment seg, int x) {
        tagEVENTMSG.message$VH.set(seg, x);
    }
    public static int message$get(MemorySegment seg, long index) {
        return (int)tagEVENTMSG.message$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void message$set(MemorySegment seg, long index, int x) {
        tagEVENTMSG.message$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle paramL$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("paramL"));
    public static VarHandle paramL$VH() {
        return tagEVENTMSG.paramL$VH;
    }
    public static int paramL$get(MemorySegment seg) {
        return (int)tagEVENTMSG.paramL$VH.get(seg);
    }
    public static void paramL$set( MemorySegment seg, int x) {
        tagEVENTMSG.paramL$VH.set(seg, x);
    }
    public static int paramL$get(MemorySegment seg, long index) {
        return (int)tagEVENTMSG.paramL$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void paramL$set(MemorySegment seg, long index, int x) {
        tagEVENTMSG.paramL$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle paramH$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("paramH"));
    public static VarHandle paramH$VH() {
        return tagEVENTMSG.paramH$VH;
    }
    public static int paramH$get(MemorySegment seg) {
        return (int)tagEVENTMSG.paramH$VH.get(seg);
    }
    public static void paramH$set( MemorySegment seg, int x) {
        tagEVENTMSG.paramH$VH.set(seg, x);
    }
    public static int paramH$get(MemorySegment seg, long index) {
        return (int)tagEVENTMSG.paramH$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void paramH$set(MemorySegment seg, long index, int x) {
        tagEVENTMSG.paramH$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return tagEVENTMSG.time$VH;
    }
    public static int time$get(MemorySegment seg) {
        return (int)tagEVENTMSG.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, int x) {
        tagEVENTMSG.time$VH.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)tagEVENTMSG.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        tagEVENTMSG.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwnd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwnd"));
    public static VarHandle hwnd$VH() {
        return tagEVENTMSG.hwnd$VH;
    }
    public static MemoryAddress hwnd$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagEVENTMSG.hwnd$VH.get(seg);
    }
    public static void hwnd$set( MemorySegment seg, MemoryAddress x) {
        tagEVENTMSG.hwnd$VH.set(seg, x);
    }
    public static MemoryAddress hwnd$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagEVENTMSG.hwnd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwnd$set(MemorySegment seg, long index, MemoryAddress x) {
        tagEVENTMSG.hwnd$VH.set(seg.asSlice(index*sizeof()), x);
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


