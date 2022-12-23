// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
public class XWindowAttributes {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("x"),
        C_INT.withName("y"),
        C_INT.withName("width"),
        C_INT.withName("height"),
        C_INT.withName("border_width"),
        C_INT.withName("depth"),
        C_POINTER.withName("visual"),
        C_LONG.withName("root"),
        C_INT.withName("class"),
        C_INT.withName("bit_gravity"),
        C_INT.withName("win_gravity"),
        C_INT.withName("backing_store"),
        C_LONG.withName("backing_planes"),
        C_LONG.withName("backing_pixel"),
        C_INT.withName("save_under"),
        MemoryLayout.paddingLayout(32),
        C_LONG.withName("colormap"),
        C_INT.withName("map_installed"),
        C_INT.withName("map_state"),
        C_LONG.withName("all_event_masks"),
        C_LONG.withName("your_event_mask"),
        C_LONG.withName("do_not_propagate_mask"),
        C_INT.withName("override_redirect"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("screen")
    );
    public static MemoryLayout $LAYOUT() {
        return XWindowAttributes.$struct$LAYOUT;
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return XWindowAttributes.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)XWindowAttributes.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        XWindowAttributes.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)XWindowAttributes.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        XWindowAttributes.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return XWindowAttributes.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)XWindowAttributes.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        XWindowAttributes.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)XWindowAttributes.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        XWindowAttributes.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return XWindowAttributes.width$VH;
    }
    public static int width$get(MemorySegment seg) {
        return (int)XWindowAttributes.width$VH.get(seg);
    }
    public static void width$set( MemorySegment seg, int x) {
        XWindowAttributes.width$VH.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)XWindowAttributes.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        XWindowAttributes.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return XWindowAttributes.height$VH;
    }
    public static int height$get(MemorySegment seg) {
        return (int)XWindowAttributes.height$VH.get(seg);
    }
    public static void height$set( MemorySegment seg, int x) {
        XWindowAttributes.height$VH.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)XWindowAttributes.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        XWindowAttributes.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle border_width$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("border_width"));
    public static VarHandle border_width$VH() {
        return XWindowAttributes.border_width$VH;
    }
    public static int border_width$get(MemorySegment seg) {
        return (int)XWindowAttributes.border_width$VH.get(seg);
    }
    public static void border_width$set( MemorySegment seg, int x) {
        XWindowAttributes.border_width$VH.set(seg, x);
    }
    public static int border_width$get(MemorySegment seg, long index) {
        return (int)XWindowAttributes.border_width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void border_width$set(MemorySegment seg, long index, int x) {
        XWindowAttributes.border_width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle depth$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("depth"));
    public static VarHandle depth$VH() {
        return XWindowAttributes.depth$VH;
    }
    public static int depth$get(MemorySegment seg) {
        return (int)XWindowAttributes.depth$VH.get(seg);
    }
    public static void depth$set( MemorySegment seg, int x) {
        XWindowAttributes.depth$VH.set(seg, x);
    }
    public static int depth$get(MemorySegment seg, long index) {
        return (int)XWindowAttributes.depth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void depth$set(MemorySegment seg, long index, int x) {
        XWindowAttributes.depth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle visual$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("visual")));
    public static VarHandle visual$VH() {
        return XWindowAttributes.visual$VH;
    }
    public static MemoryAddress visual$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XWindowAttributes.visual$VH.get(seg);
    }
    public static void visual$set( MemorySegment seg, MemoryAddress x) {
        XWindowAttributes.visual$VH.set(seg, x);
    }
    public static MemoryAddress visual$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XWindowAttributes.visual$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void visual$set(MemorySegment seg, long index, MemoryAddress x) {
        XWindowAttributes.visual$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle root$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("root"));
    public static VarHandle root$VH() {
        return XWindowAttributes.root$VH;
    }
    public static long root$get(MemorySegment seg) {
        return (long)XWindowAttributes.root$VH.get(seg);
    }
    public static void root$set( MemorySegment seg, long x) {
        XWindowAttributes.root$VH.set(seg, x);
    }
    public static long root$get(MemorySegment seg, long index) {
        return (long)XWindowAttributes.root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void root$set(MemorySegment seg, long index, long x) {
        XWindowAttributes.root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle class_$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("class"));
    public static VarHandle class_$VH() {
        return XWindowAttributes.class_$VH;
    }
    public static int class_$get(MemorySegment seg) {
        return (int)XWindowAttributes.class_$VH.get(seg);
    }
    public static void class_$set( MemorySegment seg, int x) {
        XWindowAttributes.class_$VH.set(seg, x);
    }
    public static int class_$get(MemorySegment seg, long index) {
        return (int)XWindowAttributes.class_$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void class_$set(MemorySegment seg, long index, int x) {
        XWindowAttributes.class_$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bit_gravity$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bit_gravity"));
    public static VarHandle bit_gravity$VH() {
        return XWindowAttributes.bit_gravity$VH;
    }
    public static int bit_gravity$get(MemorySegment seg) {
        return (int)XWindowAttributes.bit_gravity$VH.get(seg);
    }
    public static void bit_gravity$set( MemorySegment seg, int x) {
        XWindowAttributes.bit_gravity$VH.set(seg, x);
    }
    public static int bit_gravity$get(MemorySegment seg, long index) {
        return (int)XWindowAttributes.bit_gravity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bit_gravity$set(MemorySegment seg, long index, int x) {
        XWindowAttributes.bit_gravity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle win_gravity$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("win_gravity"));
    public static VarHandle win_gravity$VH() {
        return XWindowAttributes.win_gravity$VH;
    }
    public static int win_gravity$get(MemorySegment seg) {
        return (int)XWindowAttributes.win_gravity$VH.get(seg);
    }
    public static void win_gravity$set( MemorySegment seg, int x) {
        XWindowAttributes.win_gravity$VH.set(seg, x);
    }
    public static int win_gravity$get(MemorySegment seg, long index) {
        return (int)XWindowAttributes.win_gravity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void win_gravity$set(MemorySegment seg, long index, int x) {
        XWindowAttributes.win_gravity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle backing_store$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("backing_store"));
    public static VarHandle backing_store$VH() {
        return XWindowAttributes.backing_store$VH;
    }
    public static int backing_store$get(MemorySegment seg) {
        return (int)XWindowAttributes.backing_store$VH.get(seg);
    }
    public static void backing_store$set( MemorySegment seg, int x) {
        XWindowAttributes.backing_store$VH.set(seg, x);
    }
    public static int backing_store$get(MemorySegment seg, long index) {
        return (int)XWindowAttributes.backing_store$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void backing_store$set(MemorySegment seg, long index, int x) {
        XWindowAttributes.backing_store$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle backing_planes$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("backing_planes"));
    public static VarHandle backing_planes$VH() {
        return XWindowAttributes.backing_planes$VH;
    }
    public static long backing_planes$get(MemorySegment seg) {
        return (long)XWindowAttributes.backing_planes$VH.get(seg);
    }
    public static void backing_planes$set( MemorySegment seg, long x) {
        XWindowAttributes.backing_planes$VH.set(seg, x);
    }
    public static long backing_planes$get(MemorySegment seg, long index) {
        return (long)XWindowAttributes.backing_planes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void backing_planes$set(MemorySegment seg, long index, long x) {
        XWindowAttributes.backing_planes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle backing_pixel$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("backing_pixel"));
    public static VarHandle backing_pixel$VH() {
        return XWindowAttributes.backing_pixel$VH;
    }
    public static long backing_pixel$get(MemorySegment seg) {
        return (long)XWindowAttributes.backing_pixel$VH.get(seg);
    }
    public static void backing_pixel$set( MemorySegment seg, long x) {
        XWindowAttributes.backing_pixel$VH.set(seg, x);
    }
    public static long backing_pixel$get(MemorySegment seg, long index) {
        return (long)XWindowAttributes.backing_pixel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void backing_pixel$set(MemorySegment seg, long index, long x) {
        XWindowAttributes.backing_pixel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle save_under$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("save_under"));
    public static VarHandle save_under$VH() {
        return XWindowAttributes.save_under$VH;
    }
    public static int save_under$get(MemorySegment seg) {
        return (int)XWindowAttributes.save_under$VH.get(seg);
    }
    public static void save_under$set( MemorySegment seg, int x) {
        XWindowAttributes.save_under$VH.set(seg, x);
    }
    public static int save_under$get(MemorySegment seg, long index) {
        return (int)XWindowAttributes.save_under$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void save_under$set(MemorySegment seg, long index, int x) {
        XWindowAttributes.save_under$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle colormap$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("colormap"));
    public static VarHandle colormap$VH() {
        return XWindowAttributes.colormap$VH;
    }
    public static long colormap$get(MemorySegment seg) {
        return (long)XWindowAttributes.colormap$VH.get(seg);
    }
    public static void colormap$set( MemorySegment seg, long x) {
        XWindowAttributes.colormap$VH.set(seg, x);
    }
    public static long colormap$get(MemorySegment seg, long index) {
        return (long)XWindowAttributes.colormap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void colormap$set(MemorySegment seg, long index, long x) {
        XWindowAttributes.colormap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle map_installed$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("map_installed"));
    public static VarHandle map_installed$VH() {
        return XWindowAttributes.map_installed$VH;
    }
    public static int map_installed$get(MemorySegment seg) {
        return (int)XWindowAttributes.map_installed$VH.get(seg);
    }
    public static void map_installed$set( MemorySegment seg, int x) {
        XWindowAttributes.map_installed$VH.set(seg, x);
    }
    public static int map_installed$get(MemorySegment seg, long index) {
        return (int)XWindowAttributes.map_installed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void map_installed$set(MemorySegment seg, long index, int x) {
        XWindowAttributes.map_installed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle map_state$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("map_state"));
    public static VarHandle map_state$VH() {
        return XWindowAttributes.map_state$VH;
    }
    public static int map_state$get(MemorySegment seg) {
        return (int)XWindowAttributes.map_state$VH.get(seg);
    }
    public static void map_state$set( MemorySegment seg, int x) {
        XWindowAttributes.map_state$VH.set(seg, x);
    }
    public static int map_state$get(MemorySegment seg, long index) {
        return (int)XWindowAttributes.map_state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void map_state$set(MemorySegment seg, long index, int x) {
        XWindowAttributes.map_state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle all_event_masks$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("all_event_masks"));
    public static VarHandle all_event_masks$VH() {
        return XWindowAttributes.all_event_masks$VH;
    }
    public static long all_event_masks$get(MemorySegment seg) {
        return (long)XWindowAttributes.all_event_masks$VH.get(seg);
    }
    public static void all_event_masks$set( MemorySegment seg, long x) {
        XWindowAttributes.all_event_masks$VH.set(seg, x);
    }
    public static long all_event_masks$get(MemorySegment seg, long index) {
        return (long)XWindowAttributes.all_event_masks$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void all_event_masks$set(MemorySegment seg, long index, long x) {
        XWindowAttributes.all_event_masks$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle your_event_mask$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("your_event_mask"));
    public static VarHandle your_event_mask$VH() {
        return XWindowAttributes.your_event_mask$VH;
    }
    public static long your_event_mask$get(MemorySegment seg) {
        return (long)XWindowAttributes.your_event_mask$VH.get(seg);
    }
    public static void your_event_mask$set( MemorySegment seg, long x) {
        XWindowAttributes.your_event_mask$VH.set(seg, x);
    }
    public static long your_event_mask$get(MemorySegment seg, long index) {
        return (long)XWindowAttributes.your_event_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void your_event_mask$set(MemorySegment seg, long index, long x) {
        XWindowAttributes.your_event_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle do_not_propagate_mask$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("do_not_propagate_mask"));
    public static VarHandle do_not_propagate_mask$VH() {
        return XWindowAttributes.do_not_propagate_mask$VH;
    }
    public static long do_not_propagate_mask$get(MemorySegment seg) {
        return (long)XWindowAttributes.do_not_propagate_mask$VH.get(seg);
    }
    public static void do_not_propagate_mask$set( MemorySegment seg, long x) {
        XWindowAttributes.do_not_propagate_mask$VH.set(seg, x);
    }
    public static long do_not_propagate_mask$get(MemorySegment seg, long index) {
        return (long)XWindowAttributes.do_not_propagate_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void do_not_propagate_mask$set(MemorySegment seg, long index, long x) {
        XWindowAttributes.do_not_propagate_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle override_redirect$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("override_redirect"));
    public static VarHandle override_redirect$VH() {
        return XWindowAttributes.override_redirect$VH;
    }
    public static int override_redirect$get(MemorySegment seg) {
        return (int)XWindowAttributes.override_redirect$VH.get(seg);
    }
    public static void override_redirect$set( MemorySegment seg, int x) {
        XWindowAttributes.override_redirect$VH.set(seg, x);
    }
    public static int override_redirect$get(MemorySegment seg, long index) {
        return (int)XWindowAttributes.override_redirect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void override_redirect$set(MemorySegment seg, long index, int x) {
        XWindowAttributes.override_redirect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle screen$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("screen")));
    public static VarHandle screen$VH() {
        return XWindowAttributes.screen$VH;
    }
    public static MemoryAddress screen$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XWindowAttributes.screen$VH.get(seg);
    }
    public static void screen$set( MemorySegment seg, MemoryAddress x) {
        XWindowAttributes.screen$VH.set(seg, x);
    }
    public static MemoryAddress screen$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XWindowAttributes.screen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void screen$set(MemorySegment seg, long index, MemoryAddress x) {
        XWindowAttributes.screen$VH.set(seg.asSlice(index*sizeof()), x);
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


