// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORM2FEXTPROC {

    void apply(int x0, int x1, float x2, float x3);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM2FEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2FEXTPROC.class, fi, constants$658.PFNGLPROGRAMUNIFORM2FEXTPROC$FUNC, "(IIFF)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM2FEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2FEXTPROC.class, fi, constants$658.PFNGLPROGRAMUNIFORM2FEXTPROC$FUNC, "(IIFF)V", scope);
    }
    static PFNGLPROGRAMUNIFORM2FEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, float x2, float x3) -> {
            try {
                constants$658.PFNGLPROGRAMUNIFORM2FEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

