// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _TOKEN_SID_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Sid")
    ).withName("_TOKEN_SID_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _TOKEN_SID_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle Sid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Sid"));
    public static VarHandle Sid$VH() {
        return _TOKEN_SID_INFORMATION.Sid$VH;
    }
    public static MemoryAddress Sid$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_TOKEN_SID_INFORMATION.Sid$VH.get(seg);
    }
    public static void Sid$set( MemorySegment seg, MemoryAddress x) {
        _TOKEN_SID_INFORMATION.Sid$VH.set(seg, x);
    }
    public static MemoryAddress Sid$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_TOKEN_SID_INFORMATION.Sid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Sid$set(MemorySegment seg, long index, MemoryAddress x) {
        _TOKEN_SID_INFORMATION.Sid$VH.set(seg.asSlice(index*sizeof()), x);
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


