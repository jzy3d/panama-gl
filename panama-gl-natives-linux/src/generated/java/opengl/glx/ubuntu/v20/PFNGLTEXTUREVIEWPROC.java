// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXTUREVIEWPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7);
    static MemoryAddress allocate(PFNGLTEXTUREVIEWPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREVIEWPROC.class, fi, constants$347.PFNGLTEXTUREVIEWPROC$FUNC, "(IIIIIIII)V");
    }
    static MemoryAddress allocate(PFNGLTEXTUREVIEWPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREVIEWPROC.class, fi, constants$347.PFNGLTEXTUREVIEWPROC$FUNC, "(IIIIIIII)V", scope);
    }
    static PFNGLTEXTUREVIEWPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7) -> {
            try {
                constants$347.PFNGLTEXTUREVIEWPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


