// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class __crt_locale_data_public {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("_locale_pctype"),
        Constants$root.C_LONG$LAYOUT.withName("_locale_mb_cur_max"),
        Constants$root.C_LONG$LAYOUT.withName("_locale_lc_codepage")
    ).withName("__crt_locale_data_public");
    public static MemoryLayout $LAYOUT() {
        return __crt_locale_data_public.$struct$LAYOUT;
    }
    static final VarHandle _locale_pctype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_locale_pctype"));
    public static VarHandle _locale_pctype$VH() {
        return __crt_locale_data_public._locale_pctype$VH;
    }
    public static MemoryAddress _locale_pctype$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__crt_locale_data_public._locale_pctype$VH.get(seg);
    }
    public static void _locale_pctype$set( MemorySegment seg, MemoryAddress x) {
        __crt_locale_data_public._locale_pctype$VH.set(seg, x);
    }
    public static MemoryAddress _locale_pctype$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__crt_locale_data_public._locale_pctype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _locale_pctype$set(MemorySegment seg, long index, MemoryAddress x) {
        __crt_locale_data_public._locale_pctype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _locale_mb_cur_max$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_locale_mb_cur_max"));
    public static VarHandle _locale_mb_cur_max$VH() {
        return __crt_locale_data_public._locale_mb_cur_max$VH;
    }
    public static int _locale_mb_cur_max$get(MemorySegment seg) {
        return (int)__crt_locale_data_public._locale_mb_cur_max$VH.get(seg);
    }
    public static void _locale_mb_cur_max$set( MemorySegment seg, int x) {
        __crt_locale_data_public._locale_mb_cur_max$VH.set(seg, x);
    }
    public static int _locale_mb_cur_max$get(MemorySegment seg, long index) {
        return (int)__crt_locale_data_public._locale_mb_cur_max$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _locale_mb_cur_max$set(MemorySegment seg, long index, int x) {
        __crt_locale_data_public._locale_mb_cur_max$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _locale_lc_codepage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_locale_lc_codepage"));
    public static VarHandle _locale_lc_codepage$VH() {
        return __crt_locale_data_public._locale_lc_codepage$VH;
    }
    public static int _locale_lc_codepage$get(MemorySegment seg) {
        return (int)__crt_locale_data_public._locale_lc_codepage$VH.get(seg);
    }
    public static void _locale_lc_codepage$set( MemorySegment seg, int x) {
        __crt_locale_data_public._locale_lc_codepage$VH.set(seg, x);
    }
    public static int _locale_lc_codepage$get(MemorySegment seg, long index) {
        return (int)__crt_locale_data_public._locale_lc_codepage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _locale_lc_codepage$set(MemorySegment seg, long index, int x) {
        __crt_locale_data_public._locale_lc_codepage$VH.set(seg.asSlice(index*sizeof()), x);
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


