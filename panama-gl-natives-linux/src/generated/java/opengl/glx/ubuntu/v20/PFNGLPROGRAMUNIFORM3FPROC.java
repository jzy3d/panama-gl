// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORM3FPROC {

    void apply(int x0, int x1, float x2, float x3, float x4);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM3FPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3FPROC.class, fi, constants$316.PFNGLPROGRAMUNIFORM3FPROC$FUNC, "(IIFFF)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM3FPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3FPROC.class, fi, constants$316.PFNGLPROGRAMUNIFORM3FPROC$FUNC, "(IIFFF)V", scope);
    }
    static PFNGLPROGRAMUNIFORM3FPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, float x2, float x3, float x4) -> {
            try {
                constants$316.PFNGLPROGRAMUNIFORM3FPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


