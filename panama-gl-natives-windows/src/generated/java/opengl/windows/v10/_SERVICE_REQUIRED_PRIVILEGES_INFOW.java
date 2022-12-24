// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _SERVICE_REQUIRED_PRIVILEGES_INFOW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pmszRequiredPrivileges")
    ).withName("_SERVICE_REQUIRED_PRIVILEGES_INFOW");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_REQUIRED_PRIVILEGES_INFOW.$struct$LAYOUT;
    }
    static final VarHandle pmszRequiredPrivileges$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pmszRequiredPrivileges"));
    public static VarHandle pmszRequiredPrivileges$VH() {
        return _SERVICE_REQUIRED_PRIVILEGES_INFOW.pmszRequiredPrivileges$VH;
    }
    public static MemoryAddress pmszRequiredPrivileges$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SERVICE_REQUIRED_PRIVILEGES_INFOW.pmszRequiredPrivileges$VH.get(seg);
    }
    public static void pmszRequiredPrivileges$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_REQUIRED_PRIVILEGES_INFOW.pmszRequiredPrivileges$VH.set(seg, x);
    }
    public static MemoryAddress pmszRequiredPrivileges$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SERVICE_REQUIRED_PRIVILEGES_INFOW.pmszRequiredPrivileges$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pmszRequiredPrivileges$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_REQUIRED_PRIVILEGES_INFOW.pmszRequiredPrivileges$VH.set(seg.asSlice(index*sizeof()), x);
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


