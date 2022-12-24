// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _REMOTE_NAME_INFOA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpUniversalName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpConnectionName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpRemainingPath")
    ).withName("_REMOTE_NAME_INFOA");
    public static MemoryLayout $LAYOUT() {
        return _REMOTE_NAME_INFOA.$struct$LAYOUT;
    }
    static final VarHandle lpUniversalName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpUniversalName"));
    public static VarHandle lpUniversalName$VH() {
        return _REMOTE_NAME_INFOA.lpUniversalName$VH;
    }
    public static MemoryAddress lpUniversalName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_REMOTE_NAME_INFOA.lpUniversalName$VH.get(seg);
    }
    public static void lpUniversalName$set( MemorySegment seg, MemoryAddress x) {
        _REMOTE_NAME_INFOA.lpUniversalName$VH.set(seg, x);
    }
    public static MemoryAddress lpUniversalName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_REMOTE_NAME_INFOA.lpUniversalName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpUniversalName$set(MemorySegment seg, long index, MemoryAddress x) {
        _REMOTE_NAME_INFOA.lpUniversalName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpConnectionName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpConnectionName"));
    public static VarHandle lpConnectionName$VH() {
        return _REMOTE_NAME_INFOA.lpConnectionName$VH;
    }
    public static MemoryAddress lpConnectionName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_REMOTE_NAME_INFOA.lpConnectionName$VH.get(seg);
    }
    public static void lpConnectionName$set( MemorySegment seg, MemoryAddress x) {
        _REMOTE_NAME_INFOA.lpConnectionName$VH.set(seg, x);
    }
    public static MemoryAddress lpConnectionName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_REMOTE_NAME_INFOA.lpConnectionName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpConnectionName$set(MemorySegment seg, long index, MemoryAddress x) {
        _REMOTE_NAME_INFOA.lpConnectionName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpRemainingPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpRemainingPath"));
    public static VarHandle lpRemainingPath$VH() {
        return _REMOTE_NAME_INFOA.lpRemainingPath$VH;
    }
    public static MemoryAddress lpRemainingPath$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_REMOTE_NAME_INFOA.lpRemainingPath$VH.get(seg);
    }
    public static void lpRemainingPath$set( MemorySegment seg, MemoryAddress x) {
        _REMOTE_NAME_INFOA.lpRemainingPath$VH.set(seg, x);
    }
    public static MemoryAddress lpRemainingPath$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_REMOTE_NAME_INFOA.lpRemainingPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpRemainingPath$set(MemorySegment seg, long index, MemoryAddress x) {
        _REMOTE_NAME_INFOA.lpRemainingPath$VH.set(seg.asSlice(index*sizeof()), x);
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


