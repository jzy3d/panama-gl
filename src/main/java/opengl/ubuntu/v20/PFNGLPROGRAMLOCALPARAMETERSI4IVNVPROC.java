// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROC.class, fi, constants$758.PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROC.class, fi, constants$758.PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$758.PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

