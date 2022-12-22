// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class __pthread_internal_list {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("__prev"),
        C_POINTER.withName("__next")
    ).withName("__pthread_internal_list");
    public static MemoryLayout $LAYOUT() {
        return __pthread_internal_list.$struct$LAYOUT;
    }
    static final VarHandle __prev$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("__prev")));
    public static VarHandle __prev$VH() {
        return __pthread_internal_list.__prev$VH;
    }
    public static MemoryAddress __prev$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__pthread_internal_list.__prev$VH.get(seg);
    }
    public static void __prev$set( MemorySegment seg, MemoryAddress x) {
        __pthread_internal_list.__prev$VH.set(seg, x);
    }
    public static MemoryAddress __prev$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__pthread_internal_list.__prev$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __prev$set(MemorySegment seg, long index, MemoryAddress x) {
        __pthread_internal_list.__prev$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __next$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("__next")));
    public static VarHandle __next$VH() {
        return __pthread_internal_list.__next$VH;
    }
    public static MemoryAddress __next$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__pthread_internal_list.__next$VH.get(seg);
    }
    public static void __next$set( MemorySegment seg, MemoryAddress x) {
        __pthread_internal_list.__next$VH.set(seg, x);
    }
    public static MemoryAddress __next$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__pthread_internal_list.__next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __next$set(MemorySegment seg, long index, MemoryAddress x) {
        __pthread_internal_list.__next$VH.set(seg.asSlice(index*sizeof()), x);
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


