// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class tagMDINEXTMENU {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hmenuIn"),
        Constants$root.C_POINTER$LAYOUT.withName("hmenuNext"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndNext")
    ).withName("tagMDINEXTMENU");
    public static MemoryLayout $LAYOUT() {
        return tagMDINEXTMENU.$struct$LAYOUT;
    }
    static final VarHandle hmenuIn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hmenuIn"));
    public static VarHandle hmenuIn$VH() {
        return tagMDINEXTMENU.hmenuIn$VH;
    }
    public static MemoryAddress hmenuIn$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMDINEXTMENU.hmenuIn$VH.get(seg);
    }
    public static void hmenuIn$set( MemorySegment seg, MemoryAddress x) {
        tagMDINEXTMENU.hmenuIn$VH.set(seg, x);
    }
    public static MemoryAddress hmenuIn$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMDINEXTMENU.hmenuIn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hmenuIn$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMDINEXTMENU.hmenuIn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hmenuNext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hmenuNext"));
    public static VarHandle hmenuNext$VH() {
        return tagMDINEXTMENU.hmenuNext$VH;
    }
    public static MemoryAddress hmenuNext$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMDINEXTMENU.hmenuNext$VH.get(seg);
    }
    public static void hmenuNext$set( MemorySegment seg, MemoryAddress x) {
        tagMDINEXTMENU.hmenuNext$VH.set(seg, x);
    }
    public static MemoryAddress hmenuNext$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMDINEXTMENU.hmenuNext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hmenuNext$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMDINEXTMENU.hmenuNext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndNext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndNext"));
    public static VarHandle hwndNext$VH() {
        return tagMDINEXTMENU.hwndNext$VH;
    }
    public static MemoryAddress hwndNext$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMDINEXTMENU.hwndNext$VH.get(seg);
    }
    public static void hwndNext$set( MemorySegment seg, MemoryAddress x) {
        tagMDINEXTMENU.hwndNext$VH.set(seg, x);
    }
    public static MemoryAddress hwndNext$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMDINEXTMENU.hwndNext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndNext$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMDINEXTMENU.hwndNext$VH.set(seg.asSlice(index*sizeof()), x);
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


