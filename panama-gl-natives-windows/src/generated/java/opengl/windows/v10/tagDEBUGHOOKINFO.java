// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class tagDEBUGHOOKINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("idThread"),
        Constants$root.C_LONG$LAYOUT.withName("idThreadInstaller"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("lParam"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("wParam"),
        Constants$root.C_LONG$LAYOUT.withName("code"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagDEBUGHOOKINFO");
    public static MemoryLayout $LAYOUT() {
        return tagDEBUGHOOKINFO.$struct$LAYOUT;
    }
    static final VarHandle idThread$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("idThread"));
    public static VarHandle idThread$VH() {
        return tagDEBUGHOOKINFO.idThread$VH;
    }
    public static int idThread$get(MemorySegment seg) {
        return (int)tagDEBUGHOOKINFO.idThread$VH.get(seg);
    }
    public static void idThread$set( MemorySegment seg, int x) {
        tagDEBUGHOOKINFO.idThread$VH.set(seg, x);
    }
    public static int idThread$get(MemorySegment seg, long index) {
        return (int)tagDEBUGHOOKINFO.idThread$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void idThread$set(MemorySegment seg, long index, int x) {
        tagDEBUGHOOKINFO.idThread$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle idThreadInstaller$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("idThreadInstaller"));
    public static VarHandle idThreadInstaller$VH() {
        return tagDEBUGHOOKINFO.idThreadInstaller$VH;
    }
    public static int idThreadInstaller$get(MemorySegment seg) {
        return (int)tagDEBUGHOOKINFO.idThreadInstaller$VH.get(seg);
    }
    public static void idThreadInstaller$set( MemorySegment seg, int x) {
        tagDEBUGHOOKINFO.idThreadInstaller$VH.set(seg, x);
    }
    public static int idThreadInstaller$get(MemorySegment seg, long index) {
        return (int)tagDEBUGHOOKINFO.idThreadInstaller$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void idThreadInstaller$set(MemorySegment seg, long index, int x) {
        tagDEBUGHOOKINFO.idThreadInstaller$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lParam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lParam"));
    public static VarHandle lParam$VH() {
        return tagDEBUGHOOKINFO.lParam$VH;
    }
    public static long lParam$get(MemorySegment seg) {
        return (long)tagDEBUGHOOKINFO.lParam$VH.get(seg);
    }
    public static void lParam$set( MemorySegment seg, long x) {
        tagDEBUGHOOKINFO.lParam$VH.set(seg, x);
    }
    public static long lParam$get(MemorySegment seg, long index) {
        return (long)tagDEBUGHOOKINFO.lParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lParam$set(MemorySegment seg, long index, long x) {
        tagDEBUGHOOKINFO.lParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wParam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wParam"));
    public static VarHandle wParam$VH() {
        return tagDEBUGHOOKINFO.wParam$VH;
    }
    public static long wParam$get(MemorySegment seg) {
        return (long)tagDEBUGHOOKINFO.wParam$VH.get(seg);
    }
    public static void wParam$set( MemorySegment seg, long x) {
        tagDEBUGHOOKINFO.wParam$VH.set(seg, x);
    }
    public static long wParam$get(MemorySegment seg, long index) {
        return (long)tagDEBUGHOOKINFO.wParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wParam$set(MemorySegment seg, long index, long x) {
        tagDEBUGHOOKINFO.wParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle code$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("code"));
    public static VarHandle code$VH() {
        return tagDEBUGHOOKINFO.code$VH;
    }
    public static int code$get(MemorySegment seg) {
        return (int)tagDEBUGHOOKINFO.code$VH.get(seg);
    }
    public static void code$set( MemorySegment seg, int x) {
        tagDEBUGHOOKINFO.code$VH.set(seg, x);
    }
    public static int code$get(MemorySegment seg, long index) {
        return (int)tagDEBUGHOOKINFO.code$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void code$set(MemorySegment seg, long index, int x) {
        tagDEBUGHOOKINFO.code$VH.set(seg.asSlice(index*sizeof()), x);
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


