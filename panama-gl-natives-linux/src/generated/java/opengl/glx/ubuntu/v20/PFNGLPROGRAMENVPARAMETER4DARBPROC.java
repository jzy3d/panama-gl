// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMENVPARAMETER4DARBPROC {

    void apply(int x0, int x1, double x2, double x3, double x4, double x5);
    static MemoryAddress allocate(PFNGLPROGRAMENVPARAMETER4DARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMENVPARAMETER4DARBPROC.class, fi, constants$409.PFNGLPROGRAMENVPARAMETER4DARBPROC$FUNC, "(IIDDDD)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMENVPARAMETER4DARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMENVPARAMETER4DARBPROC.class, fi, constants$409.PFNGLPROGRAMENVPARAMETER4DARBPROC$FUNC, "(IIDDDD)V", scope);
    }
    static PFNGLPROGRAMENVPARAMETER4DARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, double x2, double x3, double x4, double x5) -> {
            try {
                constants$409.PFNGLPROGRAMENVPARAMETER4DARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

