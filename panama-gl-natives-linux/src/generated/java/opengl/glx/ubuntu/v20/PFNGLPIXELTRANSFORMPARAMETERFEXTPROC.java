// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPIXELTRANSFORMPARAMETERFEXTPROC {

    void apply(int x0, int x1, float x2);
    static MemoryAddress allocate(PFNGLPIXELTRANSFORMPARAMETERFEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPIXELTRANSFORMPARAMETERFEXTPROC.class, fi, constants$736.PFNGLPIXELTRANSFORMPARAMETERFEXTPROC$FUNC, "(IIF)V");
    }
    static MemoryAddress allocate(PFNGLPIXELTRANSFORMPARAMETERFEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPIXELTRANSFORMPARAMETERFEXTPROC.class, fi, constants$736.PFNGLPIXELTRANSFORMPARAMETERFEXTPROC$FUNC, "(IIF)V", scope);
    }
    static PFNGLPIXELTRANSFORMPARAMETERFEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, float x2) -> {
            try {
                constants$736.PFNGLPIXELTRANSFORMPARAMETERFEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

