// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPIXELTRANSFORMPARAMETERFVEXTPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLPIXELTRANSFORMPARAMETERFVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPIXELTRANSFORMPARAMETERFVEXTPROC.class, fi, constants$651.PFNGLPIXELTRANSFORMPARAMETERFVEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPIXELTRANSFORMPARAMETERFVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPIXELTRANSFORMPARAMETERFVEXTPROC.class, fi, constants$651.PFNGLPIXELTRANSFORMPARAMETERFVEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPIXELTRANSFORMPARAMETERFVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$651.PFNGLPIXELTRANSFORMPARAMETERFVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


