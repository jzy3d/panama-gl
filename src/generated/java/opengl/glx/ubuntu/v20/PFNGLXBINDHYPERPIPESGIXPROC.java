// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLXBINDHYPERPIPESGIXPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
    static MemoryAddress allocate(PFNGLXBINDHYPERPIPESGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXBINDHYPERPIPESGIXPROC.class, fi, constants$1051.PFNGLXBINDHYPERPIPESGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
    }
    static MemoryAddress allocate(PFNGLXBINDHYPERPIPESGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXBINDHYPERPIPESGIXPROC.class, fi, constants$1051.PFNGLXBINDHYPERPIPESGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
    }
    static PFNGLXBINDHYPERPIPESGIXPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
            try {
                return (int)constants$1052.PFNGLXBINDHYPERPIPESGIXPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


