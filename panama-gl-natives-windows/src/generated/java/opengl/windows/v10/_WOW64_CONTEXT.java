// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _WOW64_CONTEXT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ContextFlags"),
        Constants$root.C_LONG$LAYOUT.withName("Dr0"),
        Constants$root.C_LONG$LAYOUT.withName("Dr1"),
        Constants$root.C_LONG$LAYOUT.withName("Dr2"),
        Constants$root.C_LONG$LAYOUT.withName("Dr3"),
        Constants$root.C_LONG$LAYOUT.withName("Dr6"),
        Constants$root.C_LONG$LAYOUT.withName("Dr7"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("ControlWord"),
            Constants$root.C_LONG$LAYOUT.withName("StatusWord"),
            Constants$root.C_LONG$LAYOUT.withName("TagWord"),
            Constants$root.C_LONG$LAYOUT.withName("ErrorOffset"),
            Constants$root.C_LONG$LAYOUT.withName("ErrorSelector"),
            Constants$root.C_LONG$LAYOUT.withName("DataOffset"),
            Constants$root.C_LONG$LAYOUT.withName("DataSelector"),
            MemoryLayout.sequenceLayout(80, Constants$root.C_CHAR$LAYOUT).withName("RegisterArea"),
            Constants$root.C_LONG$LAYOUT.withName("Cr0NpxState")
        ).withName("FloatSave"),
        Constants$root.C_LONG$LAYOUT.withName("SegGs"),
        Constants$root.C_LONG$LAYOUT.withName("SegFs"),
        Constants$root.C_LONG$LAYOUT.withName("SegEs"),
        Constants$root.C_LONG$LAYOUT.withName("SegDs"),
        Constants$root.C_LONG$LAYOUT.withName("Edi"),
        Constants$root.C_LONG$LAYOUT.withName("Esi"),
        Constants$root.C_LONG$LAYOUT.withName("Ebx"),
        Constants$root.C_LONG$LAYOUT.withName("Edx"),
        Constants$root.C_LONG$LAYOUT.withName("Ecx"),
        Constants$root.C_LONG$LAYOUT.withName("Eax"),
        Constants$root.C_LONG$LAYOUT.withName("Ebp"),
        Constants$root.C_LONG$LAYOUT.withName("Eip"),
        Constants$root.C_LONG$LAYOUT.withName("SegCs"),
        Constants$root.C_LONG$LAYOUT.withName("EFlags"),
        Constants$root.C_LONG$LAYOUT.withName("Esp"),
        Constants$root.C_LONG$LAYOUT.withName("SegSs"),
        MemoryLayout.sequenceLayout(512, Constants$root.C_CHAR$LAYOUT).withName("ExtendedRegisters")
    ).withName("_WOW64_CONTEXT");
    public static MemoryLayout $LAYOUT() {
        return _WOW64_CONTEXT.$struct$LAYOUT;
    }
    static final VarHandle ContextFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ContextFlags"));
    public static VarHandle ContextFlags$VH() {
        return _WOW64_CONTEXT.ContextFlags$VH;
    }
    public static int ContextFlags$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.ContextFlags$VH.get(seg);
    }
    public static void ContextFlags$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.ContextFlags$VH.set(seg, x);
    }
    public static int ContextFlags$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.ContextFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ContextFlags$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.ContextFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Dr0$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Dr0"));
    public static VarHandle Dr0$VH() {
        return _WOW64_CONTEXT.Dr0$VH;
    }
    public static int Dr0$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.Dr0$VH.get(seg);
    }
    public static void Dr0$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.Dr0$VH.set(seg, x);
    }
    public static int Dr0$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.Dr0$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Dr0$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.Dr0$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Dr1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Dr1"));
    public static VarHandle Dr1$VH() {
        return _WOW64_CONTEXT.Dr1$VH;
    }
    public static int Dr1$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.Dr1$VH.get(seg);
    }
    public static void Dr1$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.Dr1$VH.set(seg, x);
    }
    public static int Dr1$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.Dr1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Dr1$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.Dr1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Dr2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Dr2"));
    public static VarHandle Dr2$VH() {
        return _WOW64_CONTEXT.Dr2$VH;
    }
    public static int Dr2$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.Dr2$VH.get(seg);
    }
    public static void Dr2$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.Dr2$VH.set(seg, x);
    }
    public static int Dr2$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.Dr2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Dr2$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.Dr2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Dr3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Dr3"));
    public static VarHandle Dr3$VH() {
        return _WOW64_CONTEXT.Dr3$VH;
    }
    public static int Dr3$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.Dr3$VH.get(seg);
    }
    public static void Dr3$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.Dr3$VH.set(seg, x);
    }
    public static int Dr3$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.Dr3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Dr3$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.Dr3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Dr6$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Dr6"));
    public static VarHandle Dr6$VH() {
        return _WOW64_CONTEXT.Dr6$VH;
    }
    public static int Dr6$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.Dr6$VH.get(seg);
    }
    public static void Dr6$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.Dr6$VH.set(seg, x);
    }
    public static int Dr6$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.Dr6$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Dr6$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.Dr6$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Dr7$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Dr7"));
    public static VarHandle Dr7$VH() {
        return _WOW64_CONTEXT.Dr7$VH;
    }
    public static int Dr7$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.Dr7$VH.get(seg);
    }
    public static void Dr7$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.Dr7$VH.set(seg, x);
    }
    public static int Dr7$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.Dr7$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Dr7$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.Dr7$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FloatSave$slice(MemorySegment seg) {
        return seg.asSlice(28, 112);
    }
    static final VarHandle SegGs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SegGs"));
    public static VarHandle SegGs$VH() {
        return _WOW64_CONTEXT.SegGs$VH;
    }
    public static int SegGs$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.SegGs$VH.get(seg);
    }
    public static void SegGs$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.SegGs$VH.set(seg, x);
    }
    public static int SegGs$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.SegGs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SegGs$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.SegGs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SegFs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SegFs"));
    public static VarHandle SegFs$VH() {
        return _WOW64_CONTEXT.SegFs$VH;
    }
    public static int SegFs$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.SegFs$VH.get(seg);
    }
    public static void SegFs$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.SegFs$VH.set(seg, x);
    }
    public static int SegFs$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.SegFs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SegFs$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.SegFs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SegEs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SegEs"));
    public static VarHandle SegEs$VH() {
        return _WOW64_CONTEXT.SegEs$VH;
    }
    public static int SegEs$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.SegEs$VH.get(seg);
    }
    public static void SegEs$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.SegEs$VH.set(seg, x);
    }
    public static int SegEs$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.SegEs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SegEs$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.SegEs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SegDs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SegDs"));
    public static VarHandle SegDs$VH() {
        return _WOW64_CONTEXT.SegDs$VH;
    }
    public static int SegDs$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.SegDs$VH.get(seg);
    }
    public static void SegDs$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.SegDs$VH.set(seg, x);
    }
    public static int SegDs$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.SegDs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SegDs$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.SegDs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Edi$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Edi"));
    public static VarHandle Edi$VH() {
        return _WOW64_CONTEXT.Edi$VH;
    }
    public static int Edi$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.Edi$VH.get(seg);
    }
    public static void Edi$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.Edi$VH.set(seg, x);
    }
    public static int Edi$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.Edi$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Edi$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.Edi$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Esi$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Esi"));
    public static VarHandle Esi$VH() {
        return _WOW64_CONTEXT.Esi$VH;
    }
    public static int Esi$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.Esi$VH.get(seg);
    }
    public static void Esi$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.Esi$VH.set(seg, x);
    }
    public static int Esi$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.Esi$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Esi$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.Esi$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Ebx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Ebx"));
    public static VarHandle Ebx$VH() {
        return _WOW64_CONTEXT.Ebx$VH;
    }
    public static int Ebx$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.Ebx$VH.get(seg);
    }
    public static void Ebx$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.Ebx$VH.set(seg, x);
    }
    public static int Ebx$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.Ebx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Ebx$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.Ebx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Edx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Edx"));
    public static VarHandle Edx$VH() {
        return _WOW64_CONTEXT.Edx$VH;
    }
    public static int Edx$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.Edx$VH.get(seg);
    }
    public static void Edx$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.Edx$VH.set(seg, x);
    }
    public static int Edx$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.Edx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Edx$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.Edx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Ecx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Ecx"));
    public static VarHandle Ecx$VH() {
        return _WOW64_CONTEXT.Ecx$VH;
    }
    public static int Ecx$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.Ecx$VH.get(seg);
    }
    public static void Ecx$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.Ecx$VH.set(seg, x);
    }
    public static int Ecx$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.Ecx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Ecx$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.Ecx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Eax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Eax"));
    public static VarHandle Eax$VH() {
        return _WOW64_CONTEXT.Eax$VH;
    }
    public static int Eax$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.Eax$VH.get(seg);
    }
    public static void Eax$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.Eax$VH.set(seg, x);
    }
    public static int Eax$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.Eax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Eax$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.Eax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Ebp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Ebp"));
    public static VarHandle Ebp$VH() {
        return _WOW64_CONTEXT.Ebp$VH;
    }
    public static int Ebp$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.Ebp$VH.get(seg);
    }
    public static void Ebp$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.Ebp$VH.set(seg, x);
    }
    public static int Ebp$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.Ebp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Ebp$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.Ebp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Eip$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Eip"));
    public static VarHandle Eip$VH() {
        return _WOW64_CONTEXT.Eip$VH;
    }
    public static int Eip$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.Eip$VH.get(seg);
    }
    public static void Eip$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.Eip$VH.set(seg, x);
    }
    public static int Eip$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.Eip$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Eip$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.Eip$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SegCs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SegCs"));
    public static VarHandle SegCs$VH() {
        return _WOW64_CONTEXT.SegCs$VH;
    }
    public static int SegCs$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.SegCs$VH.get(seg);
    }
    public static void SegCs$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.SegCs$VH.set(seg, x);
    }
    public static int SegCs$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.SegCs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SegCs$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.SegCs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EFlags"));
    public static VarHandle EFlags$VH() {
        return _WOW64_CONTEXT.EFlags$VH;
    }
    public static int EFlags$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.EFlags$VH.get(seg);
    }
    public static void EFlags$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.EFlags$VH.set(seg, x);
    }
    public static int EFlags$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.EFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EFlags$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.EFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Esp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Esp"));
    public static VarHandle Esp$VH() {
        return _WOW64_CONTEXT.Esp$VH;
    }
    public static int Esp$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.Esp$VH.get(seg);
    }
    public static void Esp$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.Esp$VH.set(seg, x);
    }
    public static int Esp$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.Esp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Esp$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.Esp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SegSs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SegSs"));
    public static VarHandle SegSs$VH() {
        return _WOW64_CONTEXT.SegSs$VH;
    }
    public static int SegSs$get(MemorySegment seg) {
        return (int)_WOW64_CONTEXT.SegSs$VH.get(seg);
    }
    public static void SegSs$set( MemorySegment seg, int x) {
        _WOW64_CONTEXT.SegSs$VH.set(seg, x);
    }
    public static int SegSs$get(MemorySegment seg, long index) {
        return (int)_WOW64_CONTEXT.SegSs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SegSs$set(MemorySegment seg, long index, int x) {
        _WOW64_CONTEXT.SegSs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ExtendedRegisters$slice(MemorySegment seg) {
        return seg.asSlice(204, 512);
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


