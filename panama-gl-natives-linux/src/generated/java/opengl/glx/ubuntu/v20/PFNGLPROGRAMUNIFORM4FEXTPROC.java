// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORM4FEXTPROC {

    void apply(int x0, int x1, float x2, float x3, float x4, float x5);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM4FEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM4FEXTPROC.class, fi, constants$658.PFNGLPROGRAMUNIFORM4FEXTPROC$FUNC, "(IIFFFF)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM4FEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM4FEXTPROC.class, fi, constants$658.PFNGLPROGRAMUNIFORM4FEXTPROC$FUNC, "(IIFFFF)V", scope);
    }
    static PFNGLPROGRAMUNIFORM4FEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, float x2, float x3, float x4, float x5) -> {
            try {
                constants$658.PFNGLPROGRAMUNIFORM4FEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


