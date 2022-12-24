// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class DLGITEMTEMPLATE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("style"),
        Constants$root.C_LONG$LAYOUT.withName("dwExtendedStyle"),
        Constants$root.C_SHORT$LAYOUT.withName("x"),
        Constants$root.C_SHORT$LAYOUT.withName("y"),
        Constants$root.C_SHORT$LAYOUT.withName("cx"),
        Constants$root.C_SHORT$LAYOUT.withName("cy"),
        Constants$root.C_SHORT$LAYOUT.withName("id")
    );
    public static MemoryLayout $LAYOUT() {
        return DLGITEMTEMPLATE.$struct$LAYOUT;
    }
    static final VarHandle style$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("style"));
    public static VarHandle style$VH() {
        return DLGITEMTEMPLATE.style$VH;
    }
    public static int style$get(MemorySegment seg) {
        return (int)DLGITEMTEMPLATE.style$VH.get(seg);
    }
    public static void style$set( MemorySegment seg, int x) {
        DLGITEMTEMPLATE.style$VH.set(seg, x);
    }
    public static int style$get(MemorySegment seg, long index) {
        return (int)DLGITEMTEMPLATE.style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void style$set(MemorySegment seg, long index, int x) {
        DLGITEMTEMPLATE.style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwExtendedStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwExtendedStyle"));
    public static VarHandle dwExtendedStyle$VH() {
        return DLGITEMTEMPLATE.dwExtendedStyle$VH;
    }
    public static int dwExtendedStyle$get(MemorySegment seg) {
        return (int)DLGITEMTEMPLATE.dwExtendedStyle$VH.get(seg);
    }
    public static void dwExtendedStyle$set( MemorySegment seg, int x) {
        DLGITEMTEMPLATE.dwExtendedStyle$VH.set(seg, x);
    }
    public static int dwExtendedStyle$get(MemorySegment seg, long index) {
        return (int)DLGITEMTEMPLATE.dwExtendedStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwExtendedStyle$set(MemorySegment seg, long index, int x) {
        DLGITEMTEMPLATE.dwExtendedStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return DLGITEMTEMPLATE.x$VH;
    }
    public static short x$get(MemorySegment seg) {
        return (short)DLGITEMTEMPLATE.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, short x) {
        DLGITEMTEMPLATE.x$VH.set(seg, x);
    }
    public static short x$get(MemorySegment seg, long index) {
        return (short)DLGITEMTEMPLATE.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, short x) {
        DLGITEMTEMPLATE.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return DLGITEMTEMPLATE.y$VH;
    }
    public static short y$get(MemorySegment seg) {
        return (short)DLGITEMTEMPLATE.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, short x) {
        DLGITEMTEMPLATE.y$VH.set(seg, x);
    }
    public static short y$get(MemorySegment seg, long index) {
        return (short)DLGITEMTEMPLATE.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, short x) {
        DLGITEMTEMPLATE.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cx"));
    public static VarHandle cx$VH() {
        return DLGITEMTEMPLATE.cx$VH;
    }
    public static short cx$get(MemorySegment seg) {
        return (short)DLGITEMTEMPLATE.cx$VH.get(seg);
    }
    public static void cx$set( MemorySegment seg, short x) {
        DLGITEMTEMPLATE.cx$VH.set(seg, x);
    }
    public static short cx$get(MemorySegment seg, long index) {
        return (short)DLGITEMTEMPLATE.cx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cx$set(MemorySegment seg, long index, short x) {
        DLGITEMTEMPLATE.cx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cy"));
    public static VarHandle cy$VH() {
        return DLGITEMTEMPLATE.cy$VH;
    }
    public static short cy$get(MemorySegment seg) {
        return (short)DLGITEMTEMPLATE.cy$VH.get(seg);
    }
    public static void cy$set( MemorySegment seg, short x) {
        DLGITEMTEMPLATE.cy$VH.set(seg, x);
    }
    public static short cy$get(MemorySegment seg, long index) {
        return (short)DLGITEMTEMPLATE.cy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cy$set(MemorySegment seg, long index, short x) {
        DLGITEMTEMPLATE.cy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("id"));
    public static VarHandle id$VH() {
        return DLGITEMTEMPLATE.id$VH;
    }
    public static short id$get(MemorySegment seg) {
        return (short)DLGITEMTEMPLATE.id$VH.get(seg);
    }
    public static void id$set( MemorySegment seg, short x) {
        DLGITEMTEMPLATE.id$VH.set(seg, x);
    }
    public static short id$get(MemorySegment seg, long index) {
        return (short)DLGITEMTEMPLATE.id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void id$set(MemorySegment seg, long index, short x) {
        DLGITEMTEMPLATE.id$VH.set(seg.asSlice(index*sizeof()), x);
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


