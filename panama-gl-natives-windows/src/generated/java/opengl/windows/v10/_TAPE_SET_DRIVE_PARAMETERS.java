// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _TAPE_SET_DRIVE_PARAMETERS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("ECC"),
        Constants$root.C_CHAR$LAYOUT.withName("Compression"),
        Constants$root.C_CHAR$LAYOUT.withName("DataPadding"),
        Constants$root.C_CHAR$LAYOUT.withName("ReportSetmarks"),
        Constants$root.C_LONG$LAYOUT.withName("EOTWarningZoneSize")
    ).withName("_TAPE_SET_DRIVE_PARAMETERS");
    public static MemoryLayout $LAYOUT() {
        return _TAPE_SET_DRIVE_PARAMETERS.$struct$LAYOUT;
    }
    static final VarHandle ECC$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ECC"));
    public static VarHandle ECC$VH() {
        return _TAPE_SET_DRIVE_PARAMETERS.ECC$VH;
    }
    public static byte ECC$get(MemorySegment seg) {
        return (byte)_TAPE_SET_DRIVE_PARAMETERS.ECC$VH.get(seg);
    }
    public static void ECC$set( MemorySegment seg, byte x) {
        _TAPE_SET_DRIVE_PARAMETERS.ECC$VH.set(seg, x);
    }
    public static byte ECC$get(MemorySegment seg, long index) {
        return (byte)_TAPE_SET_DRIVE_PARAMETERS.ECC$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ECC$set(MemorySegment seg, long index, byte x) {
        _TAPE_SET_DRIVE_PARAMETERS.ECC$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Compression$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Compression"));
    public static VarHandle Compression$VH() {
        return _TAPE_SET_DRIVE_PARAMETERS.Compression$VH;
    }
    public static byte Compression$get(MemorySegment seg) {
        return (byte)_TAPE_SET_DRIVE_PARAMETERS.Compression$VH.get(seg);
    }
    public static void Compression$set( MemorySegment seg, byte x) {
        _TAPE_SET_DRIVE_PARAMETERS.Compression$VH.set(seg, x);
    }
    public static byte Compression$get(MemorySegment seg, long index) {
        return (byte)_TAPE_SET_DRIVE_PARAMETERS.Compression$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Compression$set(MemorySegment seg, long index, byte x) {
        _TAPE_SET_DRIVE_PARAMETERS.Compression$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataPadding$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataPadding"));
    public static VarHandle DataPadding$VH() {
        return _TAPE_SET_DRIVE_PARAMETERS.DataPadding$VH;
    }
    public static byte DataPadding$get(MemorySegment seg) {
        return (byte)_TAPE_SET_DRIVE_PARAMETERS.DataPadding$VH.get(seg);
    }
    public static void DataPadding$set( MemorySegment seg, byte x) {
        _TAPE_SET_DRIVE_PARAMETERS.DataPadding$VH.set(seg, x);
    }
    public static byte DataPadding$get(MemorySegment seg, long index) {
        return (byte)_TAPE_SET_DRIVE_PARAMETERS.DataPadding$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataPadding$set(MemorySegment seg, long index, byte x) {
        _TAPE_SET_DRIVE_PARAMETERS.DataPadding$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReportSetmarks$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReportSetmarks"));
    public static VarHandle ReportSetmarks$VH() {
        return _TAPE_SET_DRIVE_PARAMETERS.ReportSetmarks$VH;
    }
    public static byte ReportSetmarks$get(MemorySegment seg) {
        return (byte)_TAPE_SET_DRIVE_PARAMETERS.ReportSetmarks$VH.get(seg);
    }
    public static void ReportSetmarks$set( MemorySegment seg, byte x) {
        _TAPE_SET_DRIVE_PARAMETERS.ReportSetmarks$VH.set(seg, x);
    }
    public static byte ReportSetmarks$get(MemorySegment seg, long index) {
        return (byte)_TAPE_SET_DRIVE_PARAMETERS.ReportSetmarks$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReportSetmarks$set(MemorySegment seg, long index, byte x) {
        _TAPE_SET_DRIVE_PARAMETERS.ReportSetmarks$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EOTWarningZoneSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EOTWarningZoneSize"));
    public static VarHandle EOTWarningZoneSize$VH() {
        return _TAPE_SET_DRIVE_PARAMETERS.EOTWarningZoneSize$VH;
    }
    public static int EOTWarningZoneSize$get(MemorySegment seg) {
        return (int)_TAPE_SET_DRIVE_PARAMETERS.EOTWarningZoneSize$VH.get(seg);
    }
    public static void EOTWarningZoneSize$set( MemorySegment seg, int x) {
        _TAPE_SET_DRIVE_PARAMETERS.EOTWarningZoneSize$VH.set(seg, x);
    }
    public static int EOTWarningZoneSize$get(MemorySegment seg, long index) {
        return (int)_TAPE_SET_DRIVE_PARAMETERS.EOTWarningZoneSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EOTWarningZoneSize$set(MemorySegment seg, long index, int x) {
        _TAPE_SET_DRIVE_PARAMETERS.EOTWarningZoneSize$VH.set(seg.asSlice(index*sizeof()), x);
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


