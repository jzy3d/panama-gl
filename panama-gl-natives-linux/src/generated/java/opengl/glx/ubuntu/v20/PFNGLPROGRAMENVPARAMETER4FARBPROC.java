// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMENVPARAMETER4FARBPROC {

    void apply(int x0, int x1, float x2, float x3, float x4, float x5);
    static MemoryAddress allocate(PFNGLPROGRAMENVPARAMETER4FARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMENVPARAMETER4FARBPROC.class, fi, constants$410.PFNGLPROGRAMENVPARAMETER4FARBPROC$FUNC, "(IIFFFF)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMENVPARAMETER4FARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMENVPARAMETER4FARBPROC.class, fi, constants$410.PFNGLPROGRAMENVPARAMETER4FARBPROC$FUNC, "(IIFFFF)V", scope);
    }
    static PFNGLPROGRAMENVPARAMETER4FARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, float x2, float x3, float x4, float x5) -> {
            try {
                constants$410.PFNGLPROGRAMENVPARAMETER4FARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


