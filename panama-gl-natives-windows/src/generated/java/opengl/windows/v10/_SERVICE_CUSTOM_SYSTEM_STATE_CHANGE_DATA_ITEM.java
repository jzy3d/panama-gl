// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(2, Constants$root.C_LONG$LAYOUT).withName("Data")
            ).withName("CustomStateId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("DataOffset"),
                MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Data"),
                MemoryLayout.paddingLayout(24)
            ).withName("s")
        ).withName("u")
    ).withName("_SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM.$struct$LAYOUT;
    }
    public static class u {

        static final  GroupLayout u$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(2, Constants$root.C_LONG$LAYOUT).withName("Data")
            ).withName("CustomStateId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("DataOffset"),
                MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Data"),
                MemoryLayout.paddingLayout(24)
            ).withName("s")
        );
        public static MemoryLayout $LAYOUT() {
            return u.u$union$LAYOUT;
        }
        public static MemorySegment CustomStateId$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
        }
        public static class s {

            static final  GroupLayout u$s$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("DataOffset"),
                MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Data"),
                MemoryLayout.paddingLayout(24)
            );
            public static MemoryLayout $LAYOUT() {
                return s.u$s$struct$LAYOUT;
            }
            static final VarHandle DataOffset$VH = u$s$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataOffset"));
            public static VarHandle DataOffset$VH() {
                return s.DataOffset$VH;
            }
            public static int DataOffset$get(MemorySegment seg) {
                return (int)s.DataOffset$VH.get(seg);
            }
            public static void DataOffset$set( MemorySegment seg, int x) {
                s.DataOffset$VH.set(seg, x);
            }
            public static int DataOffset$get(MemorySegment seg, long index) {
                return (int)s.DataOffset$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void DataOffset$set(MemorySegment seg, long index, int x) {
                s.DataOffset$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment Data$slice(MemorySegment seg) {
                return seg.asSlice(4, 1);
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

        public static MemorySegment s$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
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

    public static MemorySegment u$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
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


