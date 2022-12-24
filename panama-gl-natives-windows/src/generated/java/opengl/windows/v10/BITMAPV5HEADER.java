// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class BITMAPV5HEADER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("bV5Size"),
        Constants$root.C_LONG$LAYOUT.withName("bV5Width"),
        Constants$root.C_LONG$LAYOUT.withName("bV5Height"),
        Constants$root.C_SHORT$LAYOUT.withName("bV5Planes"),
        Constants$root.C_SHORT$LAYOUT.withName("bV5BitCount"),
        Constants$root.C_LONG$LAYOUT.withName("bV5Compression"),
        Constants$root.C_LONG$LAYOUT.withName("bV5SizeImage"),
        Constants$root.C_LONG$LAYOUT.withName("bV5XPelsPerMeter"),
        Constants$root.C_LONG$LAYOUT.withName("bV5YPelsPerMeter"),
        Constants$root.C_LONG$LAYOUT.withName("bV5ClrUsed"),
        Constants$root.C_LONG$LAYOUT.withName("bV5ClrImportant"),
        Constants$root.C_LONG$LAYOUT.withName("bV5RedMask"),
        Constants$root.C_LONG$LAYOUT.withName("bV5GreenMask"),
        Constants$root.C_LONG$LAYOUT.withName("bV5BlueMask"),
        Constants$root.C_LONG$LAYOUT.withName("bV5AlphaMask"),
        Constants$root.C_LONG$LAYOUT.withName("bV5CSType"),
        MemoryLayout.structLayout(
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
        ).withName("bV5Endpoints"),
        Constants$root.C_LONG$LAYOUT.withName("bV5GammaRed"),
        Constants$root.C_LONG$LAYOUT.withName("bV5GammaGreen"),
        Constants$root.C_LONG$LAYOUT.withName("bV5GammaBlue"),
        Constants$root.C_LONG$LAYOUT.withName("bV5Intent"),
        Constants$root.C_LONG$LAYOUT.withName("bV5ProfileData"),
        Constants$root.C_LONG$LAYOUT.withName("bV5ProfileSize"),
        Constants$root.C_LONG$LAYOUT.withName("bV5Reserved")
    );
    public static MemoryLayout $LAYOUT() {
        return BITMAPV5HEADER.$struct$LAYOUT;
    }
    static final VarHandle bV5Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5Size"));
    public static VarHandle bV5Size$VH() {
        return BITMAPV5HEADER.bV5Size$VH;
    }
    public static int bV5Size$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5Size$VH.get(seg);
    }
    public static void bV5Size$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5Size$VH.set(seg, x);
    }
    public static int bV5Size$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5Size$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5Width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5Width"));
    public static VarHandle bV5Width$VH() {
        return BITMAPV5HEADER.bV5Width$VH;
    }
    public static int bV5Width$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5Width$VH.get(seg);
    }
    public static void bV5Width$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5Width$VH.set(seg, x);
    }
    public static int bV5Width$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5Width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5Width$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5Width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5Height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5Height"));
    public static VarHandle bV5Height$VH() {
        return BITMAPV5HEADER.bV5Height$VH;
    }
    public static int bV5Height$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5Height$VH.get(seg);
    }
    public static void bV5Height$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5Height$VH.set(seg, x);
    }
    public static int bV5Height$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5Height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5Height$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5Height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5Planes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5Planes"));
    public static VarHandle bV5Planes$VH() {
        return BITMAPV5HEADER.bV5Planes$VH;
    }
    public static short bV5Planes$get(MemorySegment seg) {
        return (short)BITMAPV5HEADER.bV5Planes$VH.get(seg);
    }
    public static void bV5Planes$set( MemorySegment seg, short x) {
        BITMAPV5HEADER.bV5Planes$VH.set(seg, x);
    }
    public static short bV5Planes$get(MemorySegment seg, long index) {
        return (short)BITMAPV5HEADER.bV5Planes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5Planes$set(MemorySegment seg, long index, short x) {
        BITMAPV5HEADER.bV5Planes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5BitCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5BitCount"));
    public static VarHandle bV5BitCount$VH() {
        return BITMAPV5HEADER.bV5BitCount$VH;
    }
    public static short bV5BitCount$get(MemorySegment seg) {
        return (short)BITMAPV5HEADER.bV5BitCount$VH.get(seg);
    }
    public static void bV5BitCount$set( MemorySegment seg, short x) {
        BITMAPV5HEADER.bV5BitCount$VH.set(seg, x);
    }
    public static short bV5BitCount$get(MemorySegment seg, long index) {
        return (short)BITMAPV5HEADER.bV5BitCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5BitCount$set(MemorySegment seg, long index, short x) {
        BITMAPV5HEADER.bV5BitCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5Compression$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5Compression"));
    public static VarHandle bV5Compression$VH() {
        return BITMAPV5HEADER.bV5Compression$VH;
    }
    public static int bV5Compression$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5Compression$VH.get(seg);
    }
    public static void bV5Compression$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5Compression$VH.set(seg, x);
    }
    public static int bV5Compression$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5Compression$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5Compression$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5Compression$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5SizeImage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5SizeImage"));
    public static VarHandle bV5SizeImage$VH() {
        return BITMAPV5HEADER.bV5SizeImage$VH;
    }
    public static int bV5SizeImage$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5SizeImage$VH.get(seg);
    }
    public static void bV5SizeImage$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5SizeImage$VH.set(seg, x);
    }
    public static int bV5SizeImage$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5SizeImage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5SizeImage$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5SizeImage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5XPelsPerMeter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5XPelsPerMeter"));
    public static VarHandle bV5XPelsPerMeter$VH() {
        return BITMAPV5HEADER.bV5XPelsPerMeter$VH;
    }
    public static int bV5XPelsPerMeter$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5XPelsPerMeter$VH.get(seg);
    }
    public static void bV5XPelsPerMeter$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5XPelsPerMeter$VH.set(seg, x);
    }
    public static int bV5XPelsPerMeter$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5XPelsPerMeter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5XPelsPerMeter$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5XPelsPerMeter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5YPelsPerMeter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5YPelsPerMeter"));
    public static VarHandle bV5YPelsPerMeter$VH() {
        return BITMAPV5HEADER.bV5YPelsPerMeter$VH;
    }
    public static int bV5YPelsPerMeter$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5YPelsPerMeter$VH.get(seg);
    }
    public static void bV5YPelsPerMeter$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5YPelsPerMeter$VH.set(seg, x);
    }
    public static int bV5YPelsPerMeter$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5YPelsPerMeter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5YPelsPerMeter$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5YPelsPerMeter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5ClrUsed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5ClrUsed"));
    public static VarHandle bV5ClrUsed$VH() {
        return BITMAPV5HEADER.bV5ClrUsed$VH;
    }
    public static int bV5ClrUsed$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5ClrUsed$VH.get(seg);
    }
    public static void bV5ClrUsed$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5ClrUsed$VH.set(seg, x);
    }
    public static int bV5ClrUsed$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5ClrUsed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5ClrUsed$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5ClrUsed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5ClrImportant$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5ClrImportant"));
    public static VarHandle bV5ClrImportant$VH() {
        return BITMAPV5HEADER.bV5ClrImportant$VH;
    }
    public static int bV5ClrImportant$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5ClrImportant$VH.get(seg);
    }
    public static void bV5ClrImportant$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5ClrImportant$VH.set(seg, x);
    }
    public static int bV5ClrImportant$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5ClrImportant$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5ClrImportant$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5ClrImportant$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5RedMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5RedMask"));
    public static VarHandle bV5RedMask$VH() {
        return BITMAPV5HEADER.bV5RedMask$VH;
    }
    public static int bV5RedMask$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5RedMask$VH.get(seg);
    }
    public static void bV5RedMask$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5RedMask$VH.set(seg, x);
    }
    public static int bV5RedMask$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5RedMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5RedMask$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5RedMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5GreenMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5GreenMask"));
    public static VarHandle bV5GreenMask$VH() {
        return BITMAPV5HEADER.bV5GreenMask$VH;
    }
    public static int bV5GreenMask$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5GreenMask$VH.get(seg);
    }
    public static void bV5GreenMask$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5GreenMask$VH.set(seg, x);
    }
    public static int bV5GreenMask$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5GreenMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5GreenMask$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5GreenMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5BlueMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5BlueMask"));
    public static VarHandle bV5BlueMask$VH() {
        return BITMAPV5HEADER.bV5BlueMask$VH;
    }
    public static int bV5BlueMask$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5BlueMask$VH.get(seg);
    }
    public static void bV5BlueMask$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5BlueMask$VH.set(seg, x);
    }
    public static int bV5BlueMask$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5BlueMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5BlueMask$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5BlueMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5AlphaMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5AlphaMask"));
    public static VarHandle bV5AlphaMask$VH() {
        return BITMAPV5HEADER.bV5AlphaMask$VH;
    }
    public static int bV5AlphaMask$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5AlphaMask$VH.get(seg);
    }
    public static void bV5AlphaMask$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5AlphaMask$VH.set(seg, x);
    }
    public static int bV5AlphaMask$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5AlphaMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5AlphaMask$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5AlphaMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5CSType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5CSType"));
    public static VarHandle bV5CSType$VH() {
        return BITMAPV5HEADER.bV5CSType$VH;
    }
    public static int bV5CSType$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5CSType$VH.get(seg);
    }
    public static void bV5CSType$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5CSType$VH.set(seg, x);
    }
    public static int bV5CSType$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5CSType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5CSType$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5CSType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment bV5Endpoints$slice(MemorySegment seg) {
        return seg.asSlice(60, 36);
    }
    static final VarHandle bV5GammaRed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5GammaRed"));
    public static VarHandle bV5GammaRed$VH() {
        return BITMAPV5HEADER.bV5GammaRed$VH;
    }
    public static int bV5GammaRed$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5GammaRed$VH.get(seg);
    }
    public static void bV5GammaRed$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5GammaRed$VH.set(seg, x);
    }
    public static int bV5GammaRed$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5GammaRed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5GammaRed$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5GammaRed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5GammaGreen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5GammaGreen"));
    public static VarHandle bV5GammaGreen$VH() {
        return BITMAPV5HEADER.bV5GammaGreen$VH;
    }
    public static int bV5GammaGreen$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5GammaGreen$VH.get(seg);
    }
    public static void bV5GammaGreen$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5GammaGreen$VH.set(seg, x);
    }
    public static int bV5GammaGreen$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5GammaGreen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5GammaGreen$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5GammaGreen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5GammaBlue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5GammaBlue"));
    public static VarHandle bV5GammaBlue$VH() {
        return BITMAPV5HEADER.bV5GammaBlue$VH;
    }
    public static int bV5GammaBlue$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5GammaBlue$VH.get(seg);
    }
    public static void bV5GammaBlue$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5GammaBlue$VH.set(seg, x);
    }
    public static int bV5GammaBlue$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5GammaBlue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5GammaBlue$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5GammaBlue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5Intent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5Intent"));
    public static VarHandle bV5Intent$VH() {
        return BITMAPV5HEADER.bV5Intent$VH;
    }
    public static int bV5Intent$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5Intent$VH.get(seg);
    }
    public static void bV5Intent$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5Intent$VH.set(seg, x);
    }
    public static int bV5Intent$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5Intent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5Intent$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5Intent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5ProfileData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5ProfileData"));
    public static VarHandle bV5ProfileData$VH() {
        return BITMAPV5HEADER.bV5ProfileData$VH;
    }
    public static int bV5ProfileData$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5ProfileData$VH.get(seg);
    }
    public static void bV5ProfileData$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5ProfileData$VH.set(seg, x);
    }
    public static int bV5ProfileData$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5ProfileData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5ProfileData$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5ProfileData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5ProfileSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5ProfileSize"));
    public static VarHandle bV5ProfileSize$VH() {
        return BITMAPV5HEADER.bV5ProfileSize$VH;
    }
    public static int bV5ProfileSize$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5ProfileSize$VH.get(seg);
    }
    public static void bV5ProfileSize$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5ProfileSize$VH.set(seg, x);
    }
    public static int bV5ProfileSize$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5ProfileSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5ProfileSize$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5ProfileSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV5Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bV5Reserved"));
    public static VarHandle bV5Reserved$VH() {
        return BITMAPV5HEADER.bV5Reserved$VH;
    }
    public static int bV5Reserved$get(MemorySegment seg) {
        return (int)BITMAPV5HEADER.bV5Reserved$VH.get(seg);
    }
    public static void bV5Reserved$set( MemorySegment seg, int x) {
        BITMAPV5HEADER.bV5Reserved$VH.set(seg, x);
    }
    public static int bV5Reserved$get(MemorySegment seg, long index) {
        return (int)BITMAPV5HEADER.bV5Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5Reserved$set(MemorySegment seg, long index, int x) {
        BITMAPV5HEADER.bV5Reserved$VH.set(seg.asSlice(index*sizeof()), x);
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


