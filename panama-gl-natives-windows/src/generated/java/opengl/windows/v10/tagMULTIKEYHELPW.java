// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class tagMULTIKEYHELPW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("mkSize"),
        Constants$root.C_SHORT$LAYOUT.withName("mkKeylist"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("szKeyphrase")
    ).withName("tagMULTIKEYHELPW");
    public static MemoryLayout $LAYOUT() {
        return tagMULTIKEYHELPW.$struct$LAYOUT;
    }
    static final VarHandle mkSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mkSize"));
    public static VarHandle mkSize$VH() {
        return tagMULTIKEYHELPW.mkSize$VH;
    }
    public static int mkSize$get(MemorySegment seg) {
        return (int)tagMULTIKEYHELPW.mkSize$VH.get(seg);
    }
    public static void mkSize$set( MemorySegment seg, int x) {
        tagMULTIKEYHELPW.mkSize$VH.set(seg, x);
    }
    public static int mkSize$get(MemorySegment seg, long index) {
        return (int)tagMULTIKEYHELPW.mkSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mkSize$set(MemorySegment seg, long index, int x) {
        tagMULTIKEYHELPW.mkSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mkKeylist$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mkKeylist"));
    public static VarHandle mkKeylist$VH() {
        return tagMULTIKEYHELPW.mkKeylist$VH;
    }
    public static short mkKeylist$get(MemorySegment seg) {
        return (short)tagMULTIKEYHELPW.mkKeylist$VH.get(seg);
    }
    public static void mkKeylist$set( MemorySegment seg, short x) {
        tagMULTIKEYHELPW.mkKeylist$VH.set(seg, x);
    }
    public static short mkKeylist$get(MemorySegment seg, long index) {
        return (short)tagMULTIKEYHELPW.mkKeylist$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mkKeylist$set(MemorySegment seg, long index, short x) {
        tagMULTIKEYHELPW.mkKeylist$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szKeyphrase$slice(MemorySegment seg) {
        return seg.asSlice(6, 2);
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


