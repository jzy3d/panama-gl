// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLXQUERYDRAWABLEPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, long x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLXQUERYDRAWABLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXQUERYDRAWABLEPROC.class, fi, constants$1024.PFNGLXQUERYDRAWABLEPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLXQUERYDRAWABLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXQUERYDRAWABLEPROC.class, fi, constants$1024.PFNGLXQUERYDRAWABLEPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLXQUERYDRAWABLEPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$1025.PFNGLXQUERYDRAWABLEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


