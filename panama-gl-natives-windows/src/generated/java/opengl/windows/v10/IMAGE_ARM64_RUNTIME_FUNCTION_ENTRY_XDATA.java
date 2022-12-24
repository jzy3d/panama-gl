// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA {

    static final  GroupLayout $union$LAYOUT = MemoryLayout.unionLayout(
        Constants$root.C_LONG$LAYOUT.withName("HeaderData"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(18).withName("FunctionLength"),
                MemoryLayout.paddingLayout(2).withName("Version"),
                MemoryLayout.paddingLayout(1).withName("ExceptionDataPresent"),
                MemoryLayout.paddingLayout(1).withName("EpilogInHeader"),
                MemoryLayout.paddingLayout(5).withName("EpilogCount"),
                MemoryLayout.paddingLayout(5).withName("CodeWords")
            )
        ).withName("$anon$0")
    ).withName("IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA");
    public static MemoryLayout $LAYOUT() {
        return IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA.$union$LAYOUT;
    }
    static final VarHandle HeaderData$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HeaderData"));
    public static VarHandle HeaderData$VH() {
        return IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA.HeaderData$VH;
    }
    public static int HeaderData$get(MemorySegment seg) {
        return (int)IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA.HeaderData$VH.get(seg);
    }
    public static void HeaderData$set( MemorySegment seg, int x) {
        IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA.HeaderData$VH.set(seg, x);
    }
    public static int HeaderData$get(MemorySegment seg, long index) {
        return (int)IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA.HeaderData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HeaderData$set(MemorySegment seg, long index, int x) {
        IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA.HeaderData$VH.set(seg.asSlice(index*sizeof()), x);
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


