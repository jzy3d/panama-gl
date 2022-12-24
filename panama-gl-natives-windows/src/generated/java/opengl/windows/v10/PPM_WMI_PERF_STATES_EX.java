// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class PPM_WMI_PERF_STATES_EX {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Count"),
        Constants$root.C_LONG$LAYOUT.withName("MaxFrequency"),
        Constants$root.C_LONG$LAYOUT.withName("CurrentState"),
        Constants$root.C_LONG$LAYOUT.withName("MaxPerfState"),
        Constants$root.C_LONG$LAYOUT.withName("MinPerfState"),
        Constants$root.C_LONG$LAYOUT.withName("LowestPerfState"),
        Constants$root.C_LONG$LAYOUT.withName("ThermalConstraint"),
        Constants$root.C_CHAR$LAYOUT.withName("BusyAdjThreshold"),
        Constants$root.C_CHAR$LAYOUT.withName("PolicyType"),
        Constants$root.C_CHAR$LAYOUT.withName("Type"),
        Constants$root.C_CHAR$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG$LAYOUT.withName("TimerInterval"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("TargetProcessors"),
        Constants$root.C_LONG$LAYOUT.withName("PStateHandler"),
        Constants$root.C_LONG$LAYOUT.withName("PStateContext"),
        Constants$root.C_LONG$LAYOUT.withName("TStateHandler"),
        Constants$root.C_LONG$LAYOUT.withName("TStateContext"),
        Constants$root.C_LONG$LAYOUT.withName("FeedbackHandler"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved1"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Reserved2"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Frequency"),
            Constants$root.C_LONG$LAYOUT.withName("Power"),
            Constants$root.C_CHAR$LAYOUT.withName("PercentFrequency"),
            Constants$root.C_CHAR$LAYOUT.withName("IncreaseLevel"),
            Constants$root.C_CHAR$LAYOUT.withName("DecreaseLevel"),
            Constants$root.C_CHAR$LAYOUT.withName("Type"),
            Constants$root.C_LONG$LAYOUT.withName("IncreaseTime"),
            Constants$root.C_LONG$LAYOUT.withName("DecreaseTime"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Control"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Status"),
            Constants$root.C_LONG$LAYOUT.withName("HitCount"),
            Constants$root.C_LONG$LAYOUT.withName("Reserved1"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Reserved2"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Reserved3")
        )).withName("State")
    );
    public static MemoryLayout $LAYOUT() {
        return PPM_WMI_PERF_STATES_EX.$struct$LAYOUT;
    }
    static final VarHandle Count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    public static VarHandle Count$VH() {
        return PPM_WMI_PERF_STATES_EX.Count$VH;
    }
    public static int Count$get(MemorySegment seg) {
        return (int)PPM_WMI_PERF_STATES_EX.Count$VH.get(seg);
    }
    public static void Count$set( MemorySegment seg, int x) {
        PPM_WMI_PERF_STATES_EX.Count$VH.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_PERF_STATES_EX.Count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        PPM_WMI_PERF_STATES_EX.Count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxFrequency$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxFrequency"));
    public static VarHandle MaxFrequency$VH() {
        return PPM_WMI_PERF_STATES_EX.MaxFrequency$VH;
    }
    public static int MaxFrequency$get(MemorySegment seg) {
        return (int)PPM_WMI_PERF_STATES_EX.MaxFrequency$VH.get(seg);
    }
    public static void MaxFrequency$set( MemorySegment seg, int x) {
        PPM_WMI_PERF_STATES_EX.MaxFrequency$VH.set(seg, x);
    }
    public static int MaxFrequency$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_PERF_STATES_EX.MaxFrequency$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxFrequency$set(MemorySegment seg, long index, int x) {
        PPM_WMI_PERF_STATES_EX.MaxFrequency$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CurrentState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CurrentState"));
    public static VarHandle CurrentState$VH() {
        return PPM_WMI_PERF_STATES_EX.CurrentState$VH;
    }
    public static int CurrentState$get(MemorySegment seg) {
        return (int)PPM_WMI_PERF_STATES_EX.CurrentState$VH.get(seg);
    }
    public static void CurrentState$set( MemorySegment seg, int x) {
        PPM_WMI_PERF_STATES_EX.CurrentState$VH.set(seg, x);
    }
    public static int CurrentState$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_PERF_STATES_EX.CurrentState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CurrentState$set(MemorySegment seg, long index, int x) {
        PPM_WMI_PERF_STATES_EX.CurrentState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxPerfState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxPerfState"));
    public static VarHandle MaxPerfState$VH() {
        return PPM_WMI_PERF_STATES_EX.MaxPerfState$VH;
    }
    public static int MaxPerfState$get(MemorySegment seg) {
        return (int)PPM_WMI_PERF_STATES_EX.MaxPerfState$VH.get(seg);
    }
    public static void MaxPerfState$set( MemorySegment seg, int x) {
        PPM_WMI_PERF_STATES_EX.MaxPerfState$VH.set(seg, x);
    }
    public static int MaxPerfState$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_PERF_STATES_EX.MaxPerfState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxPerfState$set(MemorySegment seg, long index, int x) {
        PPM_WMI_PERF_STATES_EX.MaxPerfState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinPerfState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinPerfState"));
    public static VarHandle MinPerfState$VH() {
        return PPM_WMI_PERF_STATES_EX.MinPerfState$VH;
    }
    public static int MinPerfState$get(MemorySegment seg) {
        return (int)PPM_WMI_PERF_STATES_EX.MinPerfState$VH.get(seg);
    }
    public static void MinPerfState$set( MemorySegment seg, int x) {
        PPM_WMI_PERF_STATES_EX.MinPerfState$VH.set(seg, x);
    }
    public static int MinPerfState$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_PERF_STATES_EX.MinPerfState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinPerfState$set(MemorySegment seg, long index, int x) {
        PPM_WMI_PERF_STATES_EX.MinPerfState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LowestPerfState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LowestPerfState"));
    public static VarHandle LowestPerfState$VH() {
        return PPM_WMI_PERF_STATES_EX.LowestPerfState$VH;
    }
    public static int LowestPerfState$get(MemorySegment seg) {
        return (int)PPM_WMI_PERF_STATES_EX.LowestPerfState$VH.get(seg);
    }
    public static void LowestPerfState$set( MemorySegment seg, int x) {
        PPM_WMI_PERF_STATES_EX.LowestPerfState$VH.set(seg, x);
    }
    public static int LowestPerfState$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_PERF_STATES_EX.LowestPerfState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LowestPerfState$set(MemorySegment seg, long index, int x) {
        PPM_WMI_PERF_STATES_EX.LowestPerfState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ThermalConstraint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ThermalConstraint"));
    public static VarHandle ThermalConstraint$VH() {
        return PPM_WMI_PERF_STATES_EX.ThermalConstraint$VH;
    }
    public static int ThermalConstraint$get(MemorySegment seg) {
        return (int)PPM_WMI_PERF_STATES_EX.ThermalConstraint$VH.get(seg);
    }
    public static void ThermalConstraint$set( MemorySegment seg, int x) {
        PPM_WMI_PERF_STATES_EX.ThermalConstraint$VH.set(seg, x);
    }
    public static int ThermalConstraint$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_PERF_STATES_EX.ThermalConstraint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ThermalConstraint$set(MemorySegment seg, long index, int x) {
        PPM_WMI_PERF_STATES_EX.ThermalConstraint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BusyAdjThreshold$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BusyAdjThreshold"));
    public static VarHandle BusyAdjThreshold$VH() {
        return PPM_WMI_PERF_STATES_EX.BusyAdjThreshold$VH;
    }
    public static byte BusyAdjThreshold$get(MemorySegment seg) {
        return (byte)PPM_WMI_PERF_STATES_EX.BusyAdjThreshold$VH.get(seg);
    }
    public static void BusyAdjThreshold$set( MemorySegment seg, byte x) {
        PPM_WMI_PERF_STATES_EX.BusyAdjThreshold$VH.set(seg, x);
    }
    public static byte BusyAdjThreshold$get(MemorySegment seg, long index) {
        return (byte)PPM_WMI_PERF_STATES_EX.BusyAdjThreshold$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BusyAdjThreshold$set(MemorySegment seg, long index, byte x) {
        PPM_WMI_PERF_STATES_EX.BusyAdjThreshold$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PolicyType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PolicyType"));
    public static VarHandle PolicyType$VH() {
        return PPM_WMI_PERF_STATES_EX.PolicyType$VH;
    }
    public static byte PolicyType$get(MemorySegment seg) {
        return (byte)PPM_WMI_PERF_STATES_EX.PolicyType$VH.get(seg);
    }
    public static void PolicyType$set( MemorySegment seg, byte x) {
        PPM_WMI_PERF_STATES_EX.PolicyType$VH.set(seg, x);
    }
    public static byte PolicyType$get(MemorySegment seg, long index) {
        return (byte)PPM_WMI_PERF_STATES_EX.PolicyType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PolicyType$set(MemorySegment seg, long index, byte x) {
        PPM_WMI_PERF_STATES_EX.PolicyType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return PPM_WMI_PERF_STATES_EX.Type$VH;
    }
    public static byte Type$get(MemorySegment seg) {
        return (byte)PPM_WMI_PERF_STATES_EX.Type$VH.get(seg);
    }
    public static void Type$set( MemorySegment seg, byte x) {
        PPM_WMI_PERF_STATES_EX.Type$VH.set(seg, x);
    }
    public static byte Type$get(MemorySegment seg, long index) {
        return (byte)PPM_WMI_PERF_STATES_EX.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, byte x) {
        PPM_WMI_PERF_STATES_EX.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return PPM_WMI_PERF_STATES_EX.Reserved$VH;
    }
    public static byte Reserved$get(MemorySegment seg) {
        return (byte)PPM_WMI_PERF_STATES_EX.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, byte x) {
        PPM_WMI_PERF_STATES_EX.Reserved$VH.set(seg, x);
    }
    public static byte Reserved$get(MemorySegment seg, long index) {
        return (byte)PPM_WMI_PERF_STATES_EX.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, byte x) {
        PPM_WMI_PERF_STATES_EX.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TimerInterval$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TimerInterval"));
    public static VarHandle TimerInterval$VH() {
        return PPM_WMI_PERF_STATES_EX.TimerInterval$VH;
    }
    public static int TimerInterval$get(MemorySegment seg) {
        return (int)PPM_WMI_PERF_STATES_EX.TimerInterval$VH.get(seg);
    }
    public static void TimerInterval$set( MemorySegment seg, int x) {
        PPM_WMI_PERF_STATES_EX.TimerInterval$VH.set(seg, x);
    }
    public static int TimerInterval$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_PERF_STATES_EX.TimerInterval$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimerInterval$set(MemorySegment seg, long index, int x) {
        PPM_WMI_PERF_STATES_EX.TimerInterval$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TargetProcessors$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TargetProcessors"));
    public static VarHandle TargetProcessors$VH() {
        return PPM_WMI_PERF_STATES_EX.TargetProcessors$VH;
    }
    public static MemoryAddress TargetProcessors$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)PPM_WMI_PERF_STATES_EX.TargetProcessors$VH.get(seg);
    }
    public static void TargetProcessors$set( MemorySegment seg, MemoryAddress x) {
        PPM_WMI_PERF_STATES_EX.TargetProcessors$VH.set(seg, x);
    }
    public static MemoryAddress TargetProcessors$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)PPM_WMI_PERF_STATES_EX.TargetProcessors$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TargetProcessors$set(MemorySegment seg, long index, MemoryAddress x) {
        PPM_WMI_PERF_STATES_EX.TargetProcessors$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PStateHandler$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PStateHandler"));
    public static VarHandle PStateHandler$VH() {
        return PPM_WMI_PERF_STATES_EX.PStateHandler$VH;
    }
    public static int PStateHandler$get(MemorySegment seg) {
        return (int)PPM_WMI_PERF_STATES_EX.PStateHandler$VH.get(seg);
    }
    public static void PStateHandler$set( MemorySegment seg, int x) {
        PPM_WMI_PERF_STATES_EX.PStateHandler$VH.set(seg, x);
    }
    public static int PStateHandler$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_PERF_STATES_EX.PStateHandler$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PStateHandler$set(MemorySegment seg, long index, int x) {
        PPM_WMI_PERF_STATES_EX.PStateHandler$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PStateContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PStateContext"));
    public static VarHandle PStateContext$VH() {
        return PPM_WMI_PERF_STATES_EX.PStateContext$VH;
    }
    public static int PStateContext$get(MemorySegment seg) {
        return (int)PPM_WMI_PERF_STATES_EX.PStateContext$VH.get(seg);
    }
    public static void PStateContext$set( MemorySegment seg, int x) {
        PPM_WMI_PERF_STATES_EX.PStateContext$VH.set(seg, x);
    }
    public static int PStateContext$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_PERF_STATES_EX.PStateContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PStateContext$set(MemorySegment seg, long index, int x) {
        PPM_WMI_PERF_STATES_EX.PStateContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TStateHandler$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TStateHandler"));
    public static VarHandle TStateHandler$VH() {
        return PPM_WMI_PERF_STATES_EX.TStateHandler$VH;
    }
    public static int TStateHandler$get(MemorySegment seg) {
        return (int)PPM_WMI_PERF_STATES_EX.TStateHandler$VH.get(seg);
    }
    public static void TStateHandler$set( MemorySegment seg, int x) {
        PPM_WMI_PERF_STATES_EX.TStateHandler$VH.set(seg, x);
    }
    public static int TStateHandler$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_PERF_STATES_EX.TStateHandler$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TStateHandler$set(MemorySegment seg, long index, int x) {
        PPM_WMI_PERF_STATES_EX.TStateHandler$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TStateContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TStateContext"));
    public static VarHandle TStateContext$VH() {
        return PPM_WMI_PERF_STATES_EX.TStateContext$VH;
    }
    public static int TStateContext$get(MemorySegment seg) {
        return (int)PPM_WMI_PERF_STATES_EX.TStateContext$VH.get(seg);
    }
    public static void TStateContext$set( MemorySegment seg, int x) {
        PPM_WMI_PERF_STATES_EX.TStateContext$VH.set(seg, x);
    }
    public static int TStateContext$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_PERF_STATES_EX.TStateContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TStateContext$set(MemorySegment seg, long index, int x) {
        PPM_WMI_PERF_STATES_EX.TStateContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FeedbackHandler$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FeedbackHandler"));
    public static VarHandle FeedbackHandler$VH() {
        return PPM_WMI_PERF_STATES_EX.FeedbackHandler$VH;
    }
    public static int FeedbackHandler$get(MemorySegment seg) {
        return (int)PPM_WMI_PERF_STATES_EX.FeedbackHandler$VH.get(seg);
    }
    public static void FeedbackHandler$set( MemorySegment seg, int x) {
        PPM_WMI_PERF_STATES_EX.FeedbackHandler$VH.set(seg, x);
    }
    public static int FeedbackHandler$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_PERF_STATES_EX.FeedbackHandler$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FeedbackHandler$set(MemorySegment seg, long index, int x) {
        PPM_WMI_PERF_STATES_EX.FeedbackHandler$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved1"));
    public static VarHandle Reserved1$VH() {
        return PPM_WMI_PERF_STATES_EX.Reserved1$VH;
    }
    public static int Reserved1$get(MemorySegment seg) {
        return (int)PPM_WMI_PERF_STATES_EX.Reserved1$VH.get(seg);
    }
    public static void Reserved1$set( MemorySegment seg, int x) {
        PPM_WMI_PERF_STATES_EX.Reserved1$VH.set(seg, x);
    }
    public static int Reserved1$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_PERF_STATES_EX.Reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved1$set(MemorySegment seg, long index, int x) {
        PPM_WMI_PERF_STATES_EX.Reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved2"));
    public static VarHandle Reserved2$VH() {
        return PPM_WMI_PERF_STATES_EX.Reserved2$VH;
    }
    public static long Reserved2$get(MemorySegment seg) {
        return (long)PPM_WMI_PERF_STATES_EX.Reserved2$VH.get(seg);
    }
    public static void Reserved2$set( MemorySegment seg, long x) {
        PPM_WMI_PERF_STATES_EX.Reserved2$VH.set(seg, x);
    }
    public static long Reserved2$get(MemorySegment seg, long index) {
        return (long)PPM_WMI_PERF_STATES_EX.Reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved2$set(MemorySegment seg, long index, long x) {
        PPM_WMI_PERF_STATES_EX.Reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment State$slice(MemorySegment seg) {
        return seg.asSlice(80, 64);
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


