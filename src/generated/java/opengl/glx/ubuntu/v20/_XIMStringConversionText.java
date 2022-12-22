// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _XIMStringConversionText {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_SHORT.withName("length"),
        MemoryLayout.paddingLayout(48),
        C_POINTER.withName("feedback"),
        C_INT.withName("encoding_is_wchar"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            C_POINTER.withName("mbs"),
            C_POINTER.withName("wcs")
        ).withName("string")
    ).withName("_XIMStringConversionText");
    public static MemoryLayout $LAYOUT() {
        return _XIMStringConversionText.$struct$LAYOUT;
    }
    static final VarHandle length$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("length"));
    public static VarHandle length$VH() {
        return _XIMStringConversionText.length$VH;
    }
    public static short length$get(MemorySegment seg) {
        return (short)_XIMStringConversionText.length$VH.get(seg);
    }
    public static void length$set( MemorySegment seg, short x) {
        _XIMStringConversionText.length$VH.set(seg, x);
    }
    public static short length$get(MemorySegment seg, long index) {
        return (short)_XIMStringConversionText.length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, short x) {
        _XIMStringConversionText.length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle feedback$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("feedback")));
    public static VarHandle feedback$VH() {
        return _XIMStringConversionText.feedback$VH;
    }
    public static MemoryAddress feedback$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_XIMStringConversionText.feedback$VH.get(seg);
    }
    public static void feedback$set( MemorySegment seg, MemoryAddress x) {
        _XIMStringConversionText.feedback$VH.set(seg, x);
    }
    public static MemoryAddress feedback$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_XIMStringConversionText.feedback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void feedback$set(MemorySegment seg, long index, MemoryAddress x) {
        _XIMStringConversionText.feedback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle encoding_is_wchar$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("encoding_is_wchar"));
    public static VarHandle encoding_is_wchar$VH() {
        return _XIMStringConversionText.encoding_is_wchar$VH;
    }
    public static int encoding_is_wchar$get(MemorySegment seg) {
        return (int)_XIMStringConversionText.encoding_is_wchar$VH.get(seg);
    }
    public static void encoding_is_wchar$set( MemorySegment seg, int x) {
        _XIMStringConversionText.encoding_is_wchar$VH.set(seg, x);
    }
    public static int encoding_is_wchar$get(MemorySegment seg, long index) {
        return (int)_XIMStringConversionText.encoding_is_wchar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void encoding_is_wchar$set(MemorySegment seg, long index, int x) {
        _XIMStringConversionText.encoding_is_wchar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class string {

        static final MemoryLayout string$union$LAYOUT = MemoryLayout.unionLayout(
            C_POINTER.withName("mbs"),
            C_POINTER.withName("wcs")
        );
        public static MemoryLayout $LAYOUT() {
            return string.string$union$LAYOUT;
        }
        static final VarHandle mbs$VH = MemoryHandles.asAddressVarHandle(string$union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("mbs")));
        public static VarHandle mbs$VH() {
            return string.mbs$VH;
        }
        public static MemoryAddress mbs$get(MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)string.mbs$VH.get(seg);
        }
        public static void mbs$set( MemorySegment seg, MemoryAddress x) {
            string.mbs$VH.set(seg, x);
        }
        public static MemoryAddress mbs$get(MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)string.mbs$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void mbs$set(MemorySegment seg, long index, MemoryAddress x) {
            string.mbs$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle wcs$VH = MemoryHandles.asAddressVarHandle(string$union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("wcs")));
        public static VarHandle wcs$VH() {
            return string.wcs$VH;
        }
        public static MemoryAddress wcs$get(MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)string.wcs$VH.get(seg);
        }
        public static void wcs$set( MemorySegment seg, MemoryAddress x) {
            string.wcs$VH.set(seg, x);
        }
        public static MemoryAddress wcs$get(MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)string.wcs$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void wcs$set(MemorySegment seg, long index, MemoryAddress x) {
            string.wcs$VH.set(seg.asSlice(index*sizeof()), x);
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

    public static MemorySegment string$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
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


