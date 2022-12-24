// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class tagGCP_RESULTSW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("lStructSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpOutString"),
        Constants$root.C_POINTER$LAYOUT.withName("lpOrder"),
        Constants$root.C_POINTER$LAYOUT.withName("lpDx"),
        Constants$root.C_POINTER$LAYOUT.withName("lpCaretPos"),
        Constants$root.C_POINTER$LAYOUT.withName("lpClass"),
        Constants$root.C_POINTER$LAYOUT.withName("lpGlyphs"),
        Constants$root.C_LONG$LAYOUT.withName("nGlyphs"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxFit")
    ).withName("tagGCP_RESULTSW");
    public static MemoryLayout $LAYOUT() {
        return tagGCP_RESULTSW.$struct$LAYOUT;
    }
    static final VarHandle lStructSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lStructSize"));
    public static VarHandle lStructSize$VH() {
        return tagGCP_RESULTSW.lStructSize$VH;
    }
    public static int lStructSize$get(MemorySegment seg) {
        return (int)tagGCP_RESULTSW.lStructSize$VH.get(seg);
    }
    public static void lStructSize$set( MemorySegment seg, int x) {
        tagGCP_RESULTSW.lStructSize$VH.set(seg, x);
    }
    public static int lStructSize$get(MemorySegment seg, long index) {
        return (int)tagGCP_RESULTSW.lStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lStructSize$set(MemorySegment seg, long index, int x) {
        tagGCP_RESULTSW.lStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpOutString$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpOutString"));
    public static VarHandle lpOutString$VH() {
        return tagGCP_RESULTSW.lpOutString$VH;
    }
    public static MemoryAddress lpOutString$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagGCP_RESULTSW.lpOutString$VH.get(seg);
    }
    public static void lpOutString$set( MemorySegment seg, MemoryAddress x) {
        tagGCP_RESULTSW.lpOutString$VH.set(seg, x);
    }
    public static MemoryAddress lpOutString$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagGCP_RESULTSW.lpOutString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpOutString$set(MemorySegment seg, long index, MemoryAddress x) {
        tagGCP_RESULTSW.lpOutString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpOrder$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpOrder"));
    public static VarHandle lpOrder$VH() {
        return tagGCP_RESULTSW.lpOrder$VH;
    }
    public static MemoryAddress lpOrder$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagGCP_RESULTSW.lpOrder$VH.get(seg);
    }
    public static void lpOrder$set( MemorySegment seg, MemoryAddress x) {
        tagGCP_RESULTSW.lpOrder$VH.set(seg, x);
    }
    public static MemoryAddress lpOrder$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagGCP_RESULTSW.lpOrder$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpOrder$set(MemorySegment seg, long index, MemoryAddress x) {
        tagGCP_RESULTSW.lpOrder$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpDx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpDx"));
    public static VarHandle lpDx$VH() {
        return tagGCP_RESULTSW.lpDx$VH;
    }
    public static MemoryAddress lpDx$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagGCP_RESULTSW.lpDx$VH.get(seg);
    }
    public static void lpDx$set( MemorySegment seg, MemoryAddress x) {
        tagGCP_RESULTSW.lpDx$VH.set(seg, x);
    }
    public static MemoryAddress lpDx$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagGCP_RESULTSW.lpDx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpDx$set(MemorySegment seg, long index, MemoryAddress x) {
        tagGCP_RESULTSW.lpDx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpCaretPos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpCaretPos"));
    public static VarHandle lpCaretPos$VH() {
        return tagGCP_RESULTSW.lpCaretPos$VH;
    }
    public static MemoryAddress lpCaretPos$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagGCP_RESULTSW.lpCaretPos$VH.get(seg);
    }
    public static void lpCaretPos$set( MemorySegment seg, MemoryAddress x) {
        tagGCP_RESULTSW.lpCaretPos$VH.set(seg, x);
    }
    public static MemoryAddress lpCaretPos$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagGCP_RESULTSW.lpCaretPos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpCaretPos$set(MemorySegment seg, long index, MemoryAddress x) {
        tagGCP_RESULTSW.lpCaretPos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpClass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpClass"));
    public static VarHandle lpClass$VH() {
        return tagGCP_RESULTSW.lpClass$VH;
    }
    public static MemoryAddress lpClass$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagGCP_RESULTSW.lpClass$VH.get(seg);
    }
    public static void lpClass$set( MemorySegment seg, MemoryAddress x) {
        tagGCP_RESULTSW.lpClass$VH.set(seg, x);
    }
    public static MemoryAddress lpClass$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagGCP_RESULTSW.lpClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpClass$set(MemorySegment seg, long index, MemoryAddress x) {
        tagGCP_RESULTSW.lpClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpGlyphs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpGlyphs"));
    public static VarHandle lpGlyphs$VH() {
        return tagGCP_RESULTSW.lpGlyphs$VH;
    }
    public static MemoryAddress lpGlyphs$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagGCP_RESULTSW.lpGlyphs$VH.get(seg);
    }
    public static void lpGlyphs$set( MemorySegment seg, MemoryAddress x) {
        tagGCP_RESULTSW.lpGlyphs$VH.set(seg, x);
    }
    public static MemoryAddress lpGlyphs$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagGCP_RESULTSW.lpGlyphs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpGlyphs$set(MemorySegment seg, long index, MemoryAddress x) {
        tagGCP_RESULTSW.lpGlyphs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nGlyphs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nGlyphs"));
    public static VarHandle nGlyphs$VH() {
        return tagGCP_RESULTSW.nGlyphs$VH;
    }
    public static int nGlyphs$get(MemorySegment seg) {
        return (int)tagGCP_RESULTSW.nGlyphs$VH.get(seg);
    }
    public static void nGlyphs$set( MemorySegment seg, int x) {
        tagGCP_RESULTSW.nGlyphs$VH.set(seg, x);
    }
    public static int nGlyphs$get(MemorySegment seg, long index) {
        return (int)tagGCP_RESULTSW.nGlyphs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nGlyphs$set(MemorySegment seg, long index, int x) {
        tagGCP_RESULTSW.nGlyphs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxFit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxFit"));
    public static VarHandle nMaxFit$VH() {
        return tagGCP_RESULTSW.nMaxFit$VH;
    }
    public static int nMaxFit$get(MemorySegment seg) {
        return (int)tagGCP_RESULTSW.nMaxFit$VH.get(seg);
    }
    public static void nMaxFit$set( MemorySegment seg, int x) {
        tagGCP_RESULTSW.nMaxFit$VH.set(seg, x);
    }
    public static int nMaxFit$get(MemorySegment seg, long index) {
        return (int)tagGCP_RESULTSW.nMaxFit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxFit$set(MemorySegment seg, long index, int x) {
        tagGCP_RESULTSW.nMaxFit$VH.set(seg.asSlice(index*sizeof()), x);
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


