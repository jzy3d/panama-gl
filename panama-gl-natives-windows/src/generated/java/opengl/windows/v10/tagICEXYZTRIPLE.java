// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class tagICEXYZTRIPLE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("ciexyzX"),
            Constants$root.C_LONG$LAYOUT.withName("ciexyzY"),
            Constants$root.C_LONG$LAYOUT.withName("ciexyzZ")
        ).withName("ciexyzRed"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("ciexyzX"),
            Constants$root.C_LONG$LAYOUT.withName("ciexyzY"),
            Constants$root.C_LONG$LAYOUT.withName("ciexyzZ")
        ).withName("ciexyzGreen"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("ciexyzX"),
            Constants$root.C_LONG$LAYOUT.withName("ciexyzY"),
            Constants$root.C_LONG$LAYOUT.withName("ciexyzZ")
        ).withName("ciexyzBlue")
    ).withName("tagICEXYZTRIPLE");
    public static MemoryLayout $LAYOUT() {
        return tagICEXYZTRIPLE.$struct$LAYOUT;
    }
    public static MemorySegment ciexyzRed$slice(MemorySegment seg) {
        return seg.asSlice(0, 12);
    }
    public static MemorySegment ciexyzGreen$slice(MemorySegment seg) {
        return seg.asSlice(12, 12);
    }
    public static MemorySegment ciexyzBlue$slice(MemorySegment seg) {
        return seg.asSlice(24, 12);
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


