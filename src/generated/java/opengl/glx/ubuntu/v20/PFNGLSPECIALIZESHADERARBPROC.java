// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSPECIALIZESHADERARBPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLSPECIALIZESHADERARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSPECIALIZESHADERARBPROC.class, fi, constants$416.PFNGLSPECIALIZESHADERARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLSPECIALIZESHADERARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSPECIALIZESHADERARBPROC.class, fi, constants$416.PFNGLSPECIALIZESHADERARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLSPECIALIZESHADERARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$416.PFNGLSPECIALIZESHADERARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


