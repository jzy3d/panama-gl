// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORM1IEXTPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM1IEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM1IEXTPROC.class, fi, constants$573.PFNGLPROGRAMUNIFORM1IEXTPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM1IEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM1IEXTPROC.class, fi, constants$573.PFNGLPROGRAMUNIFORM1IEXTPROC$FUNC, "(III)V", scope);
    }
    static PFNGLPROGRAMUNIFORM1IEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$573.PFNGLPROGRAMUNIFORM1IEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


