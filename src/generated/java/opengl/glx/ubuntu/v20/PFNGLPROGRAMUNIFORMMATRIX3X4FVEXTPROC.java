// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC {

    void apply(int x0, int x1, int x2, byte x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC.class, fi, constants$665.PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC$FUNC, "(IIIBLjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC.class, fi, constants$665.PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC$FUNC, "(IIIBLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, byte x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$665.PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


