// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMBUFFERPARAMETERSFVNVPROC {

    void apply(int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLPROGRAMBUFFERPARAMETERSFVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMBUFFERPARAMETERSFVNVPROC.class, fi, constants$870.PFNGLPROGRAMBUFFERPARAMETERSFVNVPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMBUFFERPARAMETERSFVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMBUFFERPARAMETERSFVNVPROC.class, fi, constants$870.PFNGLPROGRAMBUFFERPARAMETERSFVNVPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPROGRAMBUFFERPARAMETERSFVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$870.PFNGLPROGRAMBUFFERPARAMETERSFVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


