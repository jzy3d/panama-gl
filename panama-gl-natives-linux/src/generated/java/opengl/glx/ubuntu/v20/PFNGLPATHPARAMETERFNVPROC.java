// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPATHPARAMETERFNVPROC {

    void apply(int x0, int x1, float x2);
    static MemoryAddress allocate(PFNGLPATHPARAMETERFNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPATHPARAMETERFNVPROC.class, fi, constants$877.PFNGLPATHPARAMETERFNVPROC$FUNC, "(IIF)V");
    }
    static MemoryAddress allocate(PFNGLPATHPARAMETERFNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPATHPARAMETERFNVPROC.class, fi, constants$877.PFNGLPATHPARAMETERFNVPROC$FUNC, "(IIF)V", scope);
    }
    static PFNGLPATHPARAMETERFNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, float x2) -> {
            try {
                constants$877.PFNGLPATHPARAMETERFNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

