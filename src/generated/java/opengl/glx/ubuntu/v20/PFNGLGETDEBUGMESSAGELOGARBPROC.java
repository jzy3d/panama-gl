// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETDEBUGMESSAGELOGARBPROC {

    int apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5, jdk.incubator.foreign.MemoryAddress x6, jdk.incubator.foreign.MemoryAddress x7);
    static MemoryAddress allocate(PFNGLGETDEBUGMESSAGELOGARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETDEBUGMESSAGELOGARBPROC.class, fi, constants$405.PFNGLGETDEBUGMESSAGELOGARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLGETDEBUGMESSAGELOGARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETDEBUGMESSAGELOGARBPROC.class, fi, constants$405.PFNGLGETDEBUGMESSAGELOGARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLGETDEBUGMESSAGELOGARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5, jdk.incubator.foreign.MemoryAddress x6, jdk.incubator.foreign.MemoryAddress x7) -> {
            try {
                return (int)constants$405.PFNGLGETDEBUGMESSAGELOGARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


