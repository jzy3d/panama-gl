// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _IMAGE_DATA_DIRECTORY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("VirtualAddress"),
        Constants$root.C_LONG$LAYOUT.withName("Size")
    ).withName("_IMAGE_DATA_DIRECTORY");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_DATA_DIRECTORY.$struct$LAYOUT;
    }
    static final VarHandle VirtualAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VirtualAddress"));
    public static VarHandle VirtualAddress$VH() {
        return _IMAGE_DATA_DIRECTORY.VirtualAddress$VH;
    }
    public static int VirtualAddress$get(MemorySegment seg) {
        return (int)_IMAGE_DATA_DIRECTORY.VirtualAddress$VH.get(seg);
    }
    public static void VirtualAddress$set( MemorySegment seg, int x) {
        _IMAGE_DATA_DIRECTORY.VirtualAddress$VH.set(seg, x);
    }
    public static int VirtualAddress$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DATA_DIRECTORY.VirtualAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VirtualAddress$set(MemorySegment seg, long index, int x) {
        _IMAGE_DATA_DIRECTORY.VirtualAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _IMAGE_DATA_DIRECTORY.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_IMAGE_DATA_DIRECTORY.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _IMAGE_DATA_DIRECTORY.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DATA_DIRECTORY.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _IMAGE_DATA_DIRECTORY.Size$VH.set(seg.asSlice(index*sizeof()), x);
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


