// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class pthread_rwlock_t {

    static final MemoryLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            C_INT.withName("__readers"),
            C_INT.withName("__writers"),
            C_INT.withName("__wrphase_futex"),
            C_INT.withName("__writers_futex"),
            C_INT.withName("__pad3"),
            C_INT.withName("__pad4"),
            C_INT.withName("__cur_writer"),
            C_INT.withName("__shared"),
            C_CHAR.withName("__rwelision"),
            MemoryLayout.sequenceLayout(7, C_CHAR).withName("__pad1"),
            C_LONG.withName("__pad2"),
            C_INT.withName("__flags"),
            MemoryLayout.paddingLayout(32)
        ).withName("__data"),
        MemoryLayout.sequenceLayout(56, C_CHAR).withName("__size"),
        C_LONG.withName("__align")
    );
    public static MemoryLayout $LAYOUT() {
        return pthread_rwlock_t.$union$LAYOUT;
    }
    public static MemorySegment __data$slice(MemorySegment seg) {
        return seg.asSlice(0, 56);
    }
    public static MemorySegment __size$slice(MemorySegment seg) {
        return seg.asSlice(0, 56);
    }
    static final VarHandle __align$VH = $union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("__align"));
    public static VarHandle __align$VH() {
        return pthread_rwlock_t.__align$VH;
    }
    public static long __align$get(MemorySegment seg) {
        return (long)pthread_rwlock_t.__align$VH.get(seg);
    }
    public static void __align$set( MemorySegment seg, long x) {
        pthread_rwlock_t.__align$VH.set(seg, x);
    }
    public static long __align$get(MemorySegment seg, long index) {
        return (long)pthread_rwlock_t.__align$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __align$set(MemorySegment seg, long index, long x) {
        pthread_rwlock_t.__align$VH.set(seg.asSlice(index*sizeof()), x);
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


