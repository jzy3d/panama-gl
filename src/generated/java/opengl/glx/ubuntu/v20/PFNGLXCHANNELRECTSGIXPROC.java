// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLXCHANNELRECTSGIXPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, int x3, int x4, int x5, int x6);
    static MemoryAddress allocate(PFNGLXCHANNELRECTSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXCHANNELRECTSGIXPROC.class, fi, constants$1056.PFNGLXCHANNELRECTSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IIIIII)I");
    }
    static MemoryAddress allocate(PFNGLXCHANNELRECTSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXCHANNELRECTSGIXPROC.class, fi, constants$1056.PFNGLXCHANNELRECTSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IIIIII)I", scope);
    }
    static PFNGLXCHANNELRECTSGIXPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, int x3, int x4, int x5, int x6) -> {
            try {
                return (int)constants$1056.PFNGLXCHANNELRECTSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


