// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _REARRANGE_FILE_DATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("SourceStartingOffset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TargetOffset"),
        Constants$root.C_POINTER$LAYOUT.withName("SourceFileHandle"),
        Constants$root.C_LONG$LAYOUT.withName("Length"),
        Constants$root.C_LONG$LAYOUT.withName("Flags")
    ).withName("_REARRANGE_FILE_DATA");
    public static MemoryLayout $LAYOUT() {
        return _REARRANGE_FILE_DATA.$struct$LAYOUT;
    }
    static final VarHandle SourceStartingOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SourceStartingOffset"));
    public static VarHandle SourceStartingOffset$VH() {
        return _REARRANGE_FILE_DATA.SourceStartingOffset$VH;
    }
    public static long SourceStartingOffset$get(MemorySegment seg) {
        return (long)_REARRANGE_FILE_DATA.SourceStartingOffset$VH.get(seg);
    }
    public static void SourceStartingOffset$set( MemorySegment seg, long x) {
        _REARRANGE_FILE_DATA.SourceStartingOffset$VH.set(seg, x);
    }
    public static long SourceStartingOffset$get(MemorySegment seg, long index) {
        return (long)_REARRANGE_FILE_DATA.SourceStartingOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SourceStartingOffset$set(MemorySegment seg, long index, long x) {
        _REARRANGE_FILE_DATA.SourceStartingOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TargetOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TargetOffset"));
    public static VarHandle TargetOffset$VH() {
        return _REARRANGE_FILE_DATA.TargetOffset$VH;
    }
    public static long TargetOffset$get(MemorySegment seg) {
        return (long)_REARRANGE_FILE_DATA.TargetOffset$VH.get(seg);
    }
    public static void TargetOffset$set( MemorySegment seg, long x) {
        _REARRANGE_FILE_DATA.TargetOffset$VH.set(seg, x);
    }
    public static long TargetOffset$get(MemorySegment seg, long index) {
        return (long)_REARRANGE_FILE_DATA.TargetOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TargetOffset$set(MemorySegment seg, long index, long x) {
        _REARRANGE_FILE_DATA.TargetOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SourceFileHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SourceFileHandle"));
    public static VarHandle SourceFileHandle$VH() {
        return _REARRANGE_FILE_DATA.SourceFileHandle$VH;
    }
    public static MemoryAddress SourceFileHandle$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_REARRANGE_FILE_DATA.SourceFileHandle$VH.get(seg);
    }
    public static void SourceFileHandle$set( MemorySegment seg, MemoryAddress x) {
        _REARRANGE_FILE_DATA.SourceFileHandle$VH.set(seg, x);
    }
    public static MemoryAddress SourceFileHandle$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_REARRANGE_FILE_DATA.SourceFileHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SourceFileHandle$set(MemorySegment seg, long index, MemoryAddress x) {
        _REARRANGE_FILE_DATA.SourceFileHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _REARRANGE_FILE_DATA.Length$VH;
    }
    public static int Length$get(MemorySegment seg) {
        return (int)_REARRANGE_FILE_DATA.Length$VH.get(seg);
    }
    public static void Length$set( MemorySegment seg, int x) {
        _REARRANGE_FILE_DATA.Length$VH.set(seg, x);
    }
    public static int Length$get(MemorySegment seg, long index) {
        return (int)_REARRANGE_FILE_DATA.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, int x) {
        _REARRANGE_FILE_DATA.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _REARRANGE_FILE_DATA.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_REARRANGE_FILE_DATA.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _REARRANGE_FILE_DATA.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_REARRANGE_FILE_DATA.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _REARRANGE_FILE_DATA.Flags$VH.set(seg.asSlice(index*sizeof()), x);
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


