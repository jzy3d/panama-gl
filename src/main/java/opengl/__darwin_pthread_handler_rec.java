// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class __darwin_pthread_handler_rec {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("__routine"),
        C_POINTER.withName("__arg"),
        C_POINTER.withName("__next")
    ).withName("__darwin_pthread_handler_rec");
    public static MemoryLayout $LAYOUT() {
        return __darwin_pthread_handler_rec.$struct$LAYOUT;
    }
    static final FunctionDescriptor __routine$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle __routine$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        __darwin_pthread_handler_rec.__routine$FUNC, false
    );
    public interface __routine {

        void apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(__routine fi) {
            return RuntimeHelper.upcallStub(__routine.class, fi, __darwin_pthread_handler_rec.__routine$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
        }
        static MemoryAddress allocate(__routine fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(__routine.class, fi, __darwin_pthread_handler_rec.__routine$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static __routine ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    __darwin_pthread_handler_rec.__routine$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle __routine$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("__routine")));
    public static VarHandle __routine$VH() {
        return __darwin_pthread_handler_rec.__routine$VH;
    }
    public static MemoryAddress __routine$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__darwin_pthread_handler_rec.__routine$VH.get(seg);
    }
    public static void __routine$set( MemorySegment seg, MemoryAddress x) {
        __darwin_pthread_handler_rec.__routine$VH.set(seg, x);
    }
    public static MemoryAddress __routine$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__darwin_pthread_handler_rec.__routine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __routine$set(MemorySegment seg, long index, MemoryAddress x) {
        __darwin_pthread_handler_rec.__routine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static __routine __routine (MemorySegment segment) {
        return __routine.ofAddress(__routine$get(segment));
    }
    static final VarHandle __arg$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("__arg")));
    public static VarHandle __arg$VH() {
        return __darwin_pthread_handler_rec.__arg$VH;
    }
    public static MemoryAddress __arg$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__darwin_pthread_handler_rec.__arg$VH.get(seg);
    }
    public static void __arg$set( MemorySegment seg, MemoryAddress x) {
        __darwin_pthread_handler_rec.__arg$VH.set(seg, x);
    }
    public static MemoryAddress __arg$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__darwin_pthread_handler_rec.__arg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __arg$set(MemorySegment seg, long index, MemoryAddress x) {
        __darwin_pthread_handler_rec.__arg$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __next$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("__next")));
    public static VarHandle __next$VH() {
        return __darwin_pthread_handler_rec.__next$VH;
    }
    public static MemoryAddress __next$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__darwin_pthread_handler_rec.__next$VH.get(seg);
    }
    public static void __next$set( MemorySegment seg, MemoryAddress x) {
        __darwin_pthread_handler_rec.__next$VH.set(seg, x);
    }
    public static MemoryAddress __next$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__darwin_pthread_handler_rec.__next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __next$set(MemorySegment seg, long index, MemoryAddress x) {
        __darwin_pthread_handler_rec.__next$VH.set(seg.asSlice(index*sizeof()), x);
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


