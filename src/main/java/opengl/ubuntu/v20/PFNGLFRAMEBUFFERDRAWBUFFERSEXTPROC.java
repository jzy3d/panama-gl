// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLFRAMEBUFFERDRAWBUFFERSEXTPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLFRAMEBUFFERDRAWBUFFERSEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERDRAWBUFFERSEXTPROC.class, fi, constants$598.PFNGLFRAMEBUFFERDRAWBUFFERSEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLFRAMEBUFFERDRAWBUFFERSEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERDRAWBUFFERSEXTPROC.class, fi, constants$598.PFNGLFRAMEBUFFERDRAWBUFFERSEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLFRAMEBUFFERDRAWBUFFERSEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$598.PFNGLFRAMEBUFFERDRAWBUFFERSEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

