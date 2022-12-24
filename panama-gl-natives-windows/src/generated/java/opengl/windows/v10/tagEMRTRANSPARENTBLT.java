// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class tagEMRTRANSPARENTBLT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rclBounds"),
        Constants$root.C_LONG$LAYOUT.withName("xDest"),
        Constants$root.C_LONG$LAYOUT.withName("yDest"),
        Constants$root.C_LONG$LAYOUT.withName("cxDest"),
        Constants$root.C_LONG$LAYOUT.withName("cyDest"),
        Constants$root.C_LONG$LAYOUT.withName("dwRop"),
        Constants$root.C_LONG$LAYOUT.withName("xSrc"),
        Constants$root.C_LONG$LAYOUT.withName("ySrc"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("eM11"),
            Constants$root.C_FLOAT$LAYOUT.withName("eM12"),
            Constants$root.C_FLOAT$LAYOUT.withName("eM21"),
            Constants$root.C_FLOAT$LAYOUT.withName("eM22"),
            Constants$root.C_FLOAT$LAYOUT.withName("eDx"),
            Constants$root.C_FLOAT$LAYOUT.withName("eDy")
        ).withName("xformSrc"),
        Constants$root.C_LONG$LAYOUT.withName("crBkColorSrc"),
        Constants$root.C_LONG$LAYOUT.withName("iUsageSrc"),
        Constants$root.C_LONG$LAYOUT.withName("offBmiSrc"),
        Constants$root.C_LONG$LAYOUT.withName("cbBmiSrc"),
        Constants$root.C_LONG$LAYOUT.withName("offBitsSrc"),
        Constants$root.C_LONG$LAYOUT.withName("cbBitsSrc"),
        Constants$root.C_LONG$LAYOUT.withName("cxSrc"),
        Constants$root.C_LONG$LAYOUT.withName("cySrc")
    ).withName("tagEMRTRANSPARENTBLT");
    public static MemoryLayout $LAYOUT() {
        return tagEMRTRANSPARENTBLT.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment rclBounds$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    static final VarHandle xDest$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xDest"));
    public static VarHandle xDest$VH() {
        return tagEMRTRANSPARENTBLT.xDest$VH;
    }
    public static int xDest$get(MemorySegment seg) {
        return (int)tagEMRTRANSPARENTBLT.xDest$VH.get(seg);
    }
    public static void xDest$set( MemorySegment seg, int x) {
        tagEMRTRANSPARENTBLT.xDest$VH.set(seg, x);
    }
    public static int xDest$get(MemorySegment seg, long index) {
        return (int)tagEMRTRANSPARENTBLT.xDest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xDest$set(MemorySegment seg, long index, int x) {
        tagEMRTRANSPARENTBLT.xDest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yDest$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("yDest"));
    public static VarHandle yDest$VH() {
        return tagEMRTRANSPARENTBLT.yDest$VH;
    }
    public static int yDest$get(MemorySegment seg) {
        return (int)tagEMRTRANSPARENTBLT.yDest$VH.get(seg);
    }
    public static void yDest$set( MemorySegment seg, int x) {
        tagEMRTRANSPARENTBLT.yDest$VH.set(seg, x);
    }
    public static int yDest$get(MemorySegment seg, long index) {
        return (int)tagEMRTRANSPARENTBLT.yDest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yDest$set(MemorySegment seg, long index, int x) {
        tagEMRTRANSPARENTBLT.yDest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cxDest$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cxDest"));
    public static VarHandle cxDest$VH() {
        return tagEMRTRANSPARENTBLT.cxDest$VH;
    }
    public static int cxDest$get(MemorySegment seg) {
        return (int)tagEMRTRANSPARENTBLT.cxDest$VH.get(seg);
    }
    public static void cxDest$set( MemorySegment seg, int x) {
        tagEMRTRANSPARENTBLT.cxDest$VH.set(seg, x);
    }
    public static int cxDest$get(MemorySegment seg, long index) {
        return (int)tagEMRTRANSPARENTBLT.cxDest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cxDest$set(MemorySegment seg, long index, int x) {
        tagEMRTRANSPARENTBLT.cxDest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cyDest$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cyDest"));
    public static VarHandle cyDest$VH() {
        return tagEMRTRANSPARENTBLT.cyDest$VH;
    }
    public static int cyDest$get(MemorySegment seg) {
        return (int)tagEMRTRANSPARENTBLT.cyDest$VH.get(seg);
    }
    public static void cyDest$set( MemorySegment seg, int x) {
        tagEMRTRANSPARENTBLT.cyDest$VH.set(seg, x);
    }
    public static int cyDest$get(MemorySegment seg, long index) {
        return (int)tagEMRTRANSPARENTBLT.cyDest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cyDest$set(MemorySegment seg, long index, int x) {
        tagEMRTRANSPARENTBLT.cyDest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwRop$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwRop"));
    public static VarHandle dwRop$VH() {
        return tagEMRTRANSPARENTBLT.dwRop$VH;
    }
    public static int dwRop$get(MemorySegment seg) {
        return (int)tagEMRTRANSPARENTBLT.dwRop$VH.get(seg);
    }
    public static void dwRop$set( MemorySegment seg, int x) {
        tagEMRTRANSPARENTBLT.dwRop$VH.set(seg, x);
    }
    public static int dwRop$get(MemorySegment seg, long index) {
        return (int)tagEMRTRANSPARENTBLT.dwRop$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRop$set(MemorySegment seg, long index, int x) {
        tagEMRTRANSPARENTBLT.dwRop$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xSrc"));
    public static VarHandle xSrc$VH() {
        return tagEMRTRANSPARENTBLT.xSrc$VH;
    }
    public static int xSrc$get(MemorySegment seg) {
        return (int)tagEMRTRANSPARENTBLT.xSrc$VH.get(seg);
    }
    public static void xSrc$set( MemorySegment seg, int x) {
        tagEMRTRANSPARENTBLT.xSrc$VH.set(seg, x);
    }
    public static int xSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRTRANSPARENTBLT.xSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xSrc$set(MemorySegment seg, long index, int x) {
        tagEMRTRANSPARENTBLT.xSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ySrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ySrc"));
    public static VarHandle ySrc$VH() {
        return tagEMRTRANSPARENTBLT.ySrc$VH;
    }
    public static int ySrc$get(MemorySegment seg) {
        return (int)tagEMRTRANSPARENTBLT.ySrc$VH.get(seg);
    }
    public static void ySrc$set( MemorySegment seg, int x) {
        tagEMRTRANSPARENTBLT.ySrc$VH.set(seg, x);
    }
    public static int ySrc$get(MemorySegment seg, long index) {
        return (int)tagEMRTRANSPARENTBLT.ySrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ySrc$set(MemorySegment seg, long index, int x) {
        tagEMRTRANSPARENTBLT.ySrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment xformSrc$slice(MemorySegment seg) {
        return seg.asSlice(52, 24);
    }
    static final VarHandle crBkColorSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("crBkColorSrc"));
    public static VarHandle crBkColorSrc$VH() {
        return tagEMRTRANSPARENTBLT.crBkColorSrc$VH;
    }
    public static int crBkColorSrc$get(MemorySegment seg) {
        return (int)tagEMRTRANSPARENTBLT.crBkColorSrc$VH.get(seg);
    }
    public static void crBkColorSrc$set( MemorySegment seg, int x) {
        tagEMRTRANSPARENTBLT.crBkColorSrc$VH.set(seg, x);
    }
    public static int crBkColorSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRTRANSPARENTBLT.crBkColorSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void crBkColorSrc$set(MemorySegment seg, long index, int x) {
        tagEMRTRANSPARENTBLT.crBkColorSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iUsageSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iUsageSrc"));
    public static VarHandle iUsageSrc$VH() {
        return tagEMRTRANSPARENTBLT.iUsageSrc$VH;
    }
    public static int iUsageSrc$get(MemorySegment seg) {
        return (int)tagEMRTRANSPARENTBLT.iUsageSrc$VH.get(seg);
    }
    public static void iUsageSrc$set( MemorySegment seg, int x) {
        tagEMRTRANSPARENTBLT.iUsageSrc$VH.set(seg, x);
    }
    public static int iUsageSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRTRANSPARENTBLT.iUsageSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iUsageSrc$set(MemorySegment seg, long index, int x) {
        tagEMRTRANSPARENTBLT.iUsageSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBmiSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offBmiSrc"));
    public static VarHandle offBmiSrc$VH() {
        return tagEMRTRANSPARENTBLT.offBmiSrc$VH;
    }
    public static int offBmiSrc$get(MemorySegment seg) {
        return (int)tagEMRTRANSPARENTBLT.offBmiSrc$VH.get(seg);
    }
    public static void offBmiSrc$set( MemorySegment seg, int x) {
        tagEMRTRANSPARENTBLT.offBmiSrc$VH.set(seg, x);
    }
    public static int offBmiSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRTRANSPARENTBLT.offBmiSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBmiSrc$set(MemorySegment seg, long index, int x) {
        tagEMRTRANSPARENTBLT.offBmiSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBmiSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBmiSrc"));
    public static VarHandle cbBmiSrc$VH() {
        return tagEMRTRANSPARENTBLT.cbBmiSrc$VH;
    }
    public static int cbBmiSrc$get(MemorySegment seg) {
        return (int)tagEMRTRANSPARENTBLT.cbBmiSrc$VH.get(seg);
    }
    public static void cbBmiSrc$set( MemorySegment seg, int x) {
        tagEMRTRANSPARENTBLT.cbBmiSrc$VH.set(seg, x);
    }
    public static int cbBmiSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRTRANSPARENTBLT.cbBmiSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBmiSrc$set(MemorySegment seg, long index, int x) {
        tagEMRTRANSPARENTBLT.cbBmiSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBitsSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offBitsSrc"));
    public static VarHandle offBitsSrc$VH() {
        return tagEMRTRANSPARENTBLT.offBitsSrc$VH;
    }
    public static int offBitsSrc$get(MemorySegment seg) {
        return (int)tagEMRTRANSPARENTBLT.offBitsSrc$VH.get(seg);
    }
    public static void offBitsSrc$set( MemorySegment seg, int x) {
        tagEMRTRANSPARENTBLT.offBitsSrc$VH.set(seg, x);
    }
    public static int offBitsSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRTRANSPARENTBLT.offBitsSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBitsSrc$set(MemorySegment seg, long index, int x) {
        tagEMRTRANSPARENTBLT.offBitsSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBitsSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBitsSrc"));
    public static VarHandle cbBitsSrc$VH() {
        return tagEMRTRANSPARENTBLT.cbBitsSrc$VH;
    }
    public static int cbBitsSrc$get(MemorySegment seg) {
        return (int)tagEMRTRANSPARENTBLT.cbBitsSrc$VH.get(seg);
    }
    public static void cbBitsSrc$set( MemorySegment seg, int x) {
        tagEMRTRANSPARENTBLT.cbBitsSrc$VH.set(seg, x);
    }
    public static int cbBitsSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRTRANSPARENTBLT.cbBitsSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBitsSrc$set(MemorySegment seg, long index, int x) {
        tagEMRTRANSPARENTBLT.cbBitsSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cxSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cxSrc"));
    public static VarHandle cxSrc$VH() {
        return tagEMRTRANSPARENTBLT.cxSrc$VH;
    }
    public static int cxSrc$get(MemorySegment seg) {
        return (int)tagEMRTRANSPARENTBLT.cxSrc$VH.get(seg);
    }
    public static void cxSrc$set( MemorySegment seg, int x) {
        tagEMRTRANSPARENTBLT.cxSrc$VH.set(seg, x);
    }
    public static int cxSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRTRANSPARENTBLT.cxSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cxSrc$set(MemorySegment seg, long index, int x) {
        tagEMRTRANSPARENTBLT.cxSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cySrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cySrc"));
    public static VarHandle cySrc$VH() {
        return tagEMRTRANSPARENTBLT.cySrc$VH;
    }
    public static int cySrc$get(MemorySegment seg) {
        return (int)tagEMRTRANSPARENTBLT.cySrc$VH.get(seg);
    }
    public static void cySrc$set( MemorySegment seg, int x) {
        tagEMRTRANSPARENTBLT.cySrc$VH.set(seg, x);
    }
    public static int cySrc$get(MemorySegment seg, long index) {
        return (int)tagEMRTRANSPARENTBLT.cySrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cySrc$set(MemorySegment seg, long index, int x) {
        tagEMRTRANSPARENTBLT.cySrc$VH.set(seg.asSlice(index*sizeof()), x);
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


