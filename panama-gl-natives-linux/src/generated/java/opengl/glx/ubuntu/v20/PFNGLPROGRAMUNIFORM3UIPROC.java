// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORM3UIPROC {

    void apply(int x0, int x1, int x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM3UIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3UIPROC.class, fi, constants$317.PFNGLPROGRAMUNIFORM3UIPROC$FUNC, "(IIIII)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM3UIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3UIPROC.class, fi, constants$317.PFNGLPROGRAMUNIFORM3UIPROC$FUNC, "(IIIII)V", scope);
    }
    static PFNGLPROGRAMUNIFORM3UIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4) -> {
            try {
                constants$317.PFNGLPROGRAMUNIFORM3UIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


