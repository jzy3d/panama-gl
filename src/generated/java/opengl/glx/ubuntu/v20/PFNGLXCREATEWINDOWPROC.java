// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLXCREATEWINDOWPROC {

    long apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, long x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLXCREATEWINDOWPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXCREATEWINDOWPROC.class, fi, constants$1022.PFNGLXCREATEWINDOWPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)J");
    }
    static MemoryAddress allocate(PFNGLXCREATEWINDOWPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXCREATEWINDOWPROC.class, fi, constants$1022.PFNGLXCREATEWINDOWPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)J", scope);
    }
    static PFNGLXCREATEWINDOWPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, long x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                return (long)constants$1023.PFNGLXCREATEWINDOWPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


