// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPATHSTENCILFUNCNVPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLPATHSTENCILFUNCNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPATHSTENCILFUNCNVPROC.class, fi, constants$878.PFNGLPATHSTENCILFUNCNVPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLPATHSTENCILFUNCNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPATHSTENCILFUNCNVPROC.class, fi, constants$878.PFNGLPATHSTENCILFUNCNVPROC$FUNC, "(III)V", scope);
    }
    static PFNGLPATHSTENCILFUNCNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$878.PFNGLPATHSTENCILFUNCNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


