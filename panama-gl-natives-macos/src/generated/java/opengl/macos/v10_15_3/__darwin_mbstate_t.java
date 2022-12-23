// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_LONG_LONG;
import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
public class __darwin_mbstate_t {

    static final MemoryLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(128, C_CHAR).withName("__mbstate8"),
        C_LONG_LONG.withName("_mbstateL")
    );
    public static MemoryLayout $LAYOUT() {
        return __darwin_mbstate_t.$union$LAYOUT;
    }
    public static MemorySegment __mbstate8$slice(MemorySegment seg) {
        return seg.asSlice(0, 128);
    }
    static final VarHandle _mbstateL$VH = $union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_mbstateL"));
    public static VarHandle _mbstateL$VH() {
        return __darwin_mbstate_t._mbstateL$VH;
    }
    public static long _mbstateL$get(MemorySegment seg) {
        return (long)__darwin_mbstate_t._mbstateL$VH.get(seg);
    }
    public static void _mbstateL$set( MemorySegment seg, long x) {
        __darwin_mbstate_t._mbstateL$VH.set(seg, x);
    }
    public static long _mbstateL$get(MemorySegment seg, long index) {
        return (long)__darwin_mbstate_t._mbstateL$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _mbstateL$set(MemorySegment seg, long index, long x) {
        __darwin_mbstate_t._mbstateL$VH.set(seg.asSlice(index*sizeof()), x);
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


