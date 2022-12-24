// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _SECURITY_ATTRIBUTES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("nLength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpSecurityDescriptor"),
        Constants$root.C_LONG$LAYOUT.withName("bInheritHandle"),
        MemoryLayout.paddingLayout(32)
    ).withName("_SECURITY_ATTRIBUTES");
    public static MemoryLayout $LAYOUT() {
        return _SECURITY_ATTRIBUTES.$struct$LAYOUT;
    }
    static final VarHandle nLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nLength"));
    public static VarHandle nLength$VH() {
        return _SECURITY_ATTRIBUTES.nLength$VH;
    }
    public static int nLength$get(MemorySegment seg) {
        return (int)_SECURITY_ATTRIBUTES.nLength$VH.get(seg);
    }
    public static void nLength$set( MemorySegment seg, int x) {
        _SECURITY_ATTRIBUTES.nLength$VH.set(seg, x);
    }
    public static int nLength$get(MemorySegment seg, long index) {
        return (int)_SECURITY_ATTRIBUTES.nLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nLength$set(MemorySegment seg, long index, int x) {
        _SECURITY_ATTRIBUTES.nLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpSecurityDescriptor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpSecurityDescriptor"));
    public static VarHandle lpSecurityDescriptor$VH() {
        return _SECURITY_ATTRIBUTES.lpSecurityDescriptor$VH;
    }
    public static MemoryAddress lpSecurityDescriptor$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SECURITY_ATTRIBUTES.lpSecurityDescriptor$VH.get(seg);
    }
    public static void lpSecurityDescriptor$set( MemorySegment seg, MemoryAddress x) {
        _SECURITY_ATTRIBUTES.lpSecurityDescriptor$VH.set(seg, x);
    }
    public static MemoryAddress lpSecurityDescriptor$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SECURITY_ATTRIBUTES.lpSecurityDescriptor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpSecurityDescriptor$set(MemorySegment seg, long index, MemoryAddress x) {
        _SECURITY_ATTRIBUTES.lpSecurityDescriptor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bInheritHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bInheritHandle"));
    public static VarHandle bInheritHandle$VH() {
        return _SECURITY_ATTRIBUTES.bInheritHandle$VH;
    }
    public static int bInheritHandle$get(MemorySegment seg) {
        return (int)_SECURITY_ATTRIBUTES.bInheritHandle$VH.get(seg);
    }
    public static void bInheritHandle$set( MemorySegment seg, int x) {
        _SECURITY_ATTRIBUTES.bInheritHandle$VH.set(seg, x);
    }
    public static int bInheritHandle$get(MemorySegment seg, long index) {
        return (int)_SECURITY_ATTRIBUTES.bInheritHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bInheritHandle$set(MemorySegment seg, long index, int x) {
        _SECURITY_ATTRIBUTES.bInheritHandle$VH.set(seg.asSlice(index*sizeof()), x);
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


