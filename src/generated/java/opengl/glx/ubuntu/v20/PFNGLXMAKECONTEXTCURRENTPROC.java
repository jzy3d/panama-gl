// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLXMAKECONTEXTCURRENTPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, long x1, long x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLXMAKECONTEXTCURRENTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXMAKECONTEXTCURRENTPROC.class, fi, constants$1025.PFNGLXMAKECONTEXTCURRENTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLXMAKECONTEXTCURRENTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXMAKECONTEXTCURRENTPROC.class, fi, constants$1025.PFNGLXMAKECONTEXTCURRENTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLXMAKECONTEXTCURRENTPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1, long x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                return (int)constants$1025.PFNGLXMAKECONTEXTCURRENTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


