// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMLOCALPARAMETERSI4UIVNVPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLPROGRAMLOCALPARAMETERSI4UIVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMLOCALPARAMETERSI4UIVNVPROC.class, fi, constants$759.PFNGLPROGRAMLOCALPARAMETERSI4UIVNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMLOCALPARAMETERSI4UIVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMLOCALPARAMETERSI4UIVNVPROC.class, fi, constants$759.PFNGLPROGRAMLOCALPARAMETERSI4UIVNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPROGRAMLOCALPARAMETERSI4UIVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$759.PFNGLPROGRAMLOCALPARAMETERSI4UIVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

