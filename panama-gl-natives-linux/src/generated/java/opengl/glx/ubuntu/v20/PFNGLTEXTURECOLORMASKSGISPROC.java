// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXTURECOLORMASKSGISPROC {

    void apply(byte x0, byte x1, byte x2, byte x3);
    static MemoryAddress allocate(PFNGLTEXTURECOLORMASKSGISPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURECOLORMASKSGISPROC.class, fi, constants$975.PFNGLTEXTURECOLORMASKSGISPROC$FUNC, "(BBBB)V");
    }
    static MemoryAddress allocate(PFNGLTEXTURECOLORMASKSGISPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURECOLORMASKSGISPROC.class, fi, constants$975.PFNGLTEXTURECOLORMASKSGISPROC$FUNC, "(BBBB)V", scope);
    }
    static PFNGLTEXTURECOLORMASKSGISPROC ofAddress(MemoryAddress addr) {
        return (byte x0, byte x1, byte x2, byte x3) -> {
            try {
                constants$975.PFNGLTEXTURECOLORMASKSGISPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


