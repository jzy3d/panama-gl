// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLXWAITFORMSCOMLPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, long x1, long x2, long x3, long x4, jdk.incubator.foreign.MemoryAddress x5, jdk.incubator.foreign.MemoryAddress x6, jdk.incubator.foreign.MemoryAddress x7);
    static MemoryAddress allocate(PFNGLXWAITFORMSCOMLPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXWAITFORMSCOMLPROC.class, fi, constants$1047.PFNGLXWAITFORMSCOMLPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JJJJLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLXWAITFORMSCOMLPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXWAITFORMSCOMLPROC.class, fi, constants$1047.PFNGLXWAITFORMSCOMLPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JJJJLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLXWAITFORMSCOMLPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1, long x2, long x3, long x4, jdk.incubator.foreign.MemoryAddress x5, jdk.incubator.foreign.MemoryAddress x6, jdk.incubator.foreign.MemoryAddress x7) -> {
            try {
                return (int)constants$1048.PFNGLXWAITFORMSCOMLPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


