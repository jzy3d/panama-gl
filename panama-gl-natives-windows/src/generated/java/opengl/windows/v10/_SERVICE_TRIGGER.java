// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _SERVICE_TRIGGER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwTriggerType"),
        Constants$root.C_LONG$LAYOUT.withName("dwAction"),
        Constants$root.C_POINTER$LAYOUT.withName("pTriggerSubtype"),
        Constants$root.C_LONG$LAYOUT.withName("cDataItems"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pDataItems")
    ).withName("_SERVICE_TRIGGER");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_TRIGGER.$struct$LAYOUT;
    }
    static final VarHandle dwTriggerType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTriggerType"));
    public static VarHandle dwTriggerType$VH() {
        return _SERVICE_TRIGGER.dwTriggerType$VH;
    }
    public static int dwTriggerType$get(MemorySegment seg) {
        return (int)_SERVICE_TRIGGER.dwTriggerType$VH.get(seg);
    }
    public static void dwTriggerType$set( MemorySegment seg, int x) {
        _SERVICE_TRIGGER.dwTriggerType$VH.set(seg, x);
    }
    public static int dwTriggerType$get(MemorySegment seg, long index) {
        return (int)_SERVICE_TRIGGER.dwTriggerType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTriggerType$set(MemorySegment seg, long index, int x) {
        _SERVICE_TRIGGER.dwTriggerType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAction"));
    public static VarHandle dwAction$VH() {
        return _SERVICE_TRIGGER.dwAction$VH;
    }
    public static int dwAction$get(MemorySegment seg) {
        return (int)_SERVICE_TRIGGER.dwAction$VH.get(seg);
    }
    public static void dwAction$set( MemorySegment seg, int x) {
        _SERVICE_TRIGGER.dwAction$VH.set(seg, x);
    }
    public static int dwAction$get(MemorySegment seg, long index) {
        return (int)_SERVICE_TRIGGER.dwAction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAction$set(MemorySegment seg, long index, int x) {
        _SERVICE_TRIGGER.dwAction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pTriggerSubtype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pTriggerSubtype"));
    public static VarHandle pTriggerSubtype$VH() {
        return _SERVICE_TRIGGER.pTriggerSubtype$VH;
    }
    public static MemoryAddress pTriggerSubtype$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SERVICE_TRIGGER.pTriggerSubtype$VH.get(seg);
    }
    public static void pTriggerSubtype$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_TRIGGER.pTriggerSubtype$VH.set(seg, x);
    }
    public static MemoryAddress pTriggerSubtype$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SERVICE_TRIGGER.pTriggerSubtype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pTriggerSubtype$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_TRIGGER.pTriggerSubtype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cDataItems$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cDataItems"));
    public static VarHandle cDataItems$VH() {
        return _SERVICE_TRIGGER.cDataItems$VH;
    }
    public static int cDataItems$get(MemorySegment seg) {
        return (int)_SERVICE_TRIGGER.cDataItems$VH.get(seg);
    }
    public static void cDataItems$set( MemorySegment seg, int x) {
        _SERVICE_TRIGGER.cDataItems$VH.set(seg, x);
    }
    public static int cDataItems$get(MemorySegment seg, long index) {
        return (int)_SERVICE_TRIGGER.cDataItems$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cDataItems$set(MemorySegment seg, long index, int x) {
        _SERVICE_TRIGGER.cDataItems$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDataItems$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDataItems"));
    public static VarHandle pDataItems$VH() {
        return _SERVICE_TRIGGER.pDataItems$VH;
    }
    public static MemoryAddress pDataItems$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SERVICE_TRIGGER.pDataItems$VH.get(seg);
    }
    public static void pDataItems$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_TRIGGER.pDataItems$VH.set(seg, x);
    }
    public static MemoryAddress pDataItems$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SERVICE_TRIGGER.pDataItems$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDataItems$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_TRIGGER.pDataItems$VH.set(seg.asSlice(index*sizeof()), x);
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


