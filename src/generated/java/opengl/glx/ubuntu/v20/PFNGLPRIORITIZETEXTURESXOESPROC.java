// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPRIORITIZETEXTURESXOESPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLPRIORITIZETEXTURESXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPRIORITIZETEXTURESXOESPROC.class, fi, constants$525.PFNGLPRIORITIZETEXTURESXOESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPRIORITIZETEXTURESXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPRIORITIZETEXTURESXOESPROC.class, fi, constants$525.PFNGLPRIORITIZETEXTURESXOESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPRIORITIZETEXTURESXOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$525.PFNGLPRIORITIZETEXTURESXOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


