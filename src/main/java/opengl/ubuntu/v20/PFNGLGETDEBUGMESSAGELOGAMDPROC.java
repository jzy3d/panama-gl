// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETDEBUGMESSAGELOGAMDPROC {

    int apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5, jdk.incubator.foreign.MemoryAddress x6);
    static MemoryAddress allocate(PFNGLGETDEBUGMESSAGELOGAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETDEBUGMESSAGELOGAMDPROC.class, fi, constants$452.PFNGLGETDEBUGMESSAGELOGAMDPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLGETDEBUGMESSAGELOGAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETDEBUGMESSAGELOGAMDPROC.class, fi, constants$452.PFNGLGETDEBUGMESSAGELOGAMDPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLGETDEBUGMESSAGELOGAMDPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5, jdk.incubator.foreign.MemoryAddress x6) -> {
            try {
                return (int)constants$452.PFNGLGETDEBUGMESSAGELOGAMDPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


