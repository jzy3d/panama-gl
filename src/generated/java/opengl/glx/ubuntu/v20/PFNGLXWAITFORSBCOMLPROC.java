// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLXWAITFORSBCOMLPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, long x1, long x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5);
    static MemoryAddress allocate(PFNGLXWAITFORSBCOMLPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXWAITFORSBCOMLPROC.class, fi, constants$1048.PFNGLXWAITFORSBCOMLPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLXWAITFORSBCOMLPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXWAITFORSBCOMLPROC.class, fi, constants$1048.PFNGLXWAITFORSBCOMLPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLXWAITFORSBCOMLPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1, long x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5) -> {
            try {
                return (int)constants$1048.PFNGLXWAITFORSBCOMLPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


