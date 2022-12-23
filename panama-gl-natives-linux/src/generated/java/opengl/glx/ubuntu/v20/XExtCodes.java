// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
public class XExtCodes {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("extension"),
        C_INT.withName("major_opcode"),
        C_INT.withName("first_event"),
        C_INT.withName("first_error")
    );
    public static MemoryLayout $LAYOUT() {
        return XExtCodes.$struct$LAYOUT;
    }
    static final VarHandle extension$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("extension"));
    public static VarHandle extension$VH() {
        return XExtCodes.extension$VH;
    }
    public static int extension$get(MemorySegment seg) {
        return (int)XExtCodes.extension$VH.get(seg);
    }
    public static void extension$set( MemorySegment seg, int x) {
        XExtCodes.extension$VH.set(seg, x);
    }
    public static int extension$get(MemorySegment seg, long index) {
        return (int)XExtCodes.extension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void extension$set(MemorySegment seg, long index, int x) {
        XExtCodes.extension$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle major_opcode$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("major_opcode"));
    public static VarHandle major_opcode$VH() {
        return XExtCodes.major_opcode$VH;
    }
    public static int major_opcode$get(MemorySegment seg) {
        return (int)XExtCodes.major_opcode$VH.get(seg);
    }
    public static void major_opcode$set( MemorySegment seg, int x) {
        XExtCodes.major_opcode$VH.set(seg, x);
    }
    public static int major_opcode$get(MemorySegment seg, long index) {
        return (int)XExtCodes.major_opcode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void major_opcode$set(MemorySegment seg, long index, int x) {
        XExtCodes.major_opcode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle first_event$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("first_event"));
    public static VarHandle first_event$VH() {
        return XExtCodes.first_event$VH;
    }
    public static int first_event$get(MemorySegment seg) {
        return (int)XExtCodes.first_event$VH.get(seg);
    }
    public static void first_event$set( MemorySegment seg, int x) {
        XExtCodes.first_event$VH.set(seg, x);
    }
    public static int first_event$get(MemorySegment seg, long index) {
        return (int)XExtCodes.first_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void first_event$set(MemorySegment seg, long index, int x) {
        XExtCodes.first_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle first_error$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("first_error"));
    public static VarHandle first_error$VH() {
        return XExtCodes.first_error$VH;
    }
    public static int first_error$get(MemorySegment seg) {
        return (int)XExtCodes.first_error$VH.get(seg);
    }
    public static void first_error$set( MemorySegment seg, int x) {
        XExtCodes.first_error$VH.set(seg, x);
    }
    public static int first_error$get(MemorySegment seg, long index) {
        return (int)XExtCodes.first_error$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void first_error$set(MemorySegment seg, long index, int x) {
        XExtCodes.first_error$VH.set(seg.asSlice(index*sizeof()), x);
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


