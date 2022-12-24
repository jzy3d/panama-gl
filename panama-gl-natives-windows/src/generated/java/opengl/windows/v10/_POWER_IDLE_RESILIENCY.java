// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _POWER_IDLE_RESILIENCY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("CoalescingTimeout"),
        Constants$root.C_LONG$LAYOUT.withName("IdleResiliencyPeriod")
    ).withName("_POWER_IDLE_RESILIENCY");
    public static MemoryLayout $LAYOUT() {
        return _POWER_IDLE_RESILIENCY.$struct$LAYOUT;
    }
    static final VarHandle CoalescingTimeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CoalescingTimeout"));
    public static VarHandle CoalescingTimeout$VH() {
        return _POWER_IDLE_RESILIENCY.CoalescingTimeout$VH;
    }
    public static int CoalescingTimeout$get(MemorySegment seg) {
        return (int)_POWER_IDLE_RESILIENCY.CoalescingTimeout$VH.get(seg);
    }
    public static void CoalescingTimeout$set( MemorySegment seg, int x) {
        _POWER_IDLE_RESILIENCY.CoalescingTimeout$VH.set(seg, x);
    }
    public static int CoalescingTimeout$get(MemorySegment seg, long index) {
        return (int)_POWER_IDLE_RESILIENCY.CoalescingTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CoalescingTimeout$set(MemorySegment seg, long index, int x) {
        _POWER_IDLE_RESILIENCY.CoalescingTimeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IdleResiliencyPeriod$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IdleResiliencyPeriod"));
    public static VarHandle IdleResiliencyPeriod$VH() {
        return _POWER_IDLE_RESILIENCY.IdleResiliencyPeriod$VH;
    }
    public static int IdleResiliencyPeriod$get(MemorySegment seg) {
        return (int)_POWER_IDLE_RESILIENCY.IdleResiliencyPeriod$VH.get(seg);
    }
    public static void IdleResiliencyPeriod$set( MemorySegment seg, int x) {
        _POWER_IDLE_RESILIENCY.IdleResiliencyPeriod$VH.set(seg, x);
    }
    public static int IdleResiliencyPeriod$get(MemorySegment seg, long index) {
        return (int)_POWER_IDLE_RESILIENCY.IdleResiliencyPeriod$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IdleResiliencyPeriod$set(MemorySegment seg, long index, int x) {
        _POWER_IDLE_RESILIENCY.IdleResiliencyPeriod$VH.set(seg.asSlice(index*sizeof()), x);
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


