// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMPARAMETERIPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLPROGRAMPARAMETERIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMPARAMETERIPROC.class, fi, constants$307.PFNGLPROGRAMPARAMETERIPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMPARAMETERIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMPARAMETERIPROC.class, fi, constants$307.PFNGLPROGRAMPARAMETERIPROC$FUNC, "(III)V", scope);
    }
    static PFNGLPROGRAMPARAMETERIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$307.PFNGLPROGRAMPARAMETERIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


