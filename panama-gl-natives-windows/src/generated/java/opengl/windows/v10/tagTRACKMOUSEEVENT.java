// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class tagTRACKMOUSEEVENT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndTrack"),
        Constants$root.C_LONG$LAYOUT.withName("dwHoverTime"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagTRACKMOUSEEVENT");
    public static MemoryLayout $LAYOUT() {
        return tagTRACKMOUSEEVENT.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagTRACKMOUSEEVENT.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagTRACKMOUSEEVENT.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagTRACKMOUSEEVENT.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagTRACKMOUSEEVENT.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagTRACKMOUSEEVENT.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagTRACKMOUSEEVENT.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagTRACKMOUSEEVENT.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagTRACKMOUSEEVENT.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagTRACKMOUSEEVENT.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagTRACKMOUSEEVENT.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndTrack$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndTrack"));
    public static VarHandle hwndTrack$VH() {
        return tagTRACKMOUSEEVENT.hwndTrack$VH;
    }
    public static MemoryAddress hwndTrack$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagTRACKMOUSEEVENT.hwndTrack$VH.get(seg);
    }
    public static void hwndTrack$set( MemorySegment seg, MemoryAddress x) {
        tagTRACKMOUSEEVENT.hwndTrack$VH.set(seg, x);
    }
    public static MemoryAddress hwndTrack$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagTRACKMOUSEEVENT.hwndTrack$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndTrack$set(MemorySegment seg, long index, MemoryAddress x) {
        tagTRACKMOUSEEVENT.hwndTrack$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwHoverTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwHoverTime"));
    public static VarHandle dwHoverTime$VH() {
        return tagTRACKMOUSEEVENT.dwHoverTime$VH;
    }
    public static int dwHoverTime$get(MemorySegment seg) {
        return (int)tagTRACKMOUSEEVENT.dwHoverTime$VH.get(seg);
    }
    public static void dwHoverTime$set( MemorySegment seg, int x) {
        tagTRACKMOUSEEVENT.dwHoverTime$VH.set(seg, x);
    }
    public static int dwHoverTime$get(MemorySegment seg, long index) {
        return (int)tagTRACKMOUSEEVENT.dwHoverTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwHoverTime$set(MemorySegment seg, long index, int x) {
        tagTRACKMOUSEEVENT.dwHoverTime$VH.set(seg.asSlice(index*sizeof()), x);
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


