// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLUNIFORMMATRIX2X3FVPROC {

    void apply(int x0, int x1, byte x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLUNIFORMMATRIX2X3FVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORMMATRIX2X3FVPROC.class, fi, constants$144.PFNGLUNIFORMMATRIX2X3FVPROC$FUNC, "(IIBLjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORMMATRIX2X3FVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORMMATRIX2X3FVPROC.class, fi, constants$144.PFNGLUNIFORMMATRIX2X3FVPROC$FUNC, "(IIBLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLUNIFORMMATRIX2X3FVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, byte x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$144.PFNGLUNIFORMMATRIX2X3FVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


