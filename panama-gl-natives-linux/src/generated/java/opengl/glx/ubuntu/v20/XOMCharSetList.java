// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
public class XOMCharSetList {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("charset_count"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("charset_list")
    );
    public static MemoryLayout $LAYOUT() {
        return XOMCharSetList.$struct$LAYOUT;
    }
    static final VarHandle charset_count$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("charset_count"));
    public static VarHandle charset_count$VH() {
        return XOMCharSetList.charset_count$VH;
    }
    public static int charset_count$get(MemorySegment seg) {
        return (int)XOMCharSetList.charset_count$VH.get(seg);
    }
    public static void charset_count$set( MemorySegment seg, int x) {
        XOMCharSetList.charset_count$VH.set(seg, x);
    }
    public static int charset_count$get(MemorySegment seg, long index) {
        return (int)XOMCharSetList.charset_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void charset_count$set(MemorySegment seg, long index, int x) {
        XOMCharSetList.charset_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle charset_list$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("charset_list")));
    public static VarHandle charset_list$VH() {
        return XOMCharSetList.charset_list$VH;
    }
    public static MemoryAddress charset_list$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XOMCharSetList.charset_list$VH.get(seg);
    }
    public static void charset_list$set( MemorySegment seg, MemoryAddress x) {
        XOMCharSetList.charset_list$VH.set(seg, x);
    }
    public static MemoryAddress charset_list$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XOMCharSetList.charset_list$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void charset_list$set(MemorySegment seg, long index, MemoryAddress x) {
        XOMCharSetList.charset_list$VH.set(seg.asSlice(index*sizeof()), x);
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


