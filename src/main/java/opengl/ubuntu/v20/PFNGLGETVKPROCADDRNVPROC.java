// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETVKPROCADDRNVPROC {

    jdk.incubator.foreign.MemoryAddress apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLGETVKPROCADDRNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETVKPROCADDRNVPROC.class, fi, constants$741.PFNGLGETVKPROCADDRNVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(PFNGLGETVKPROCADDRNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETVKPROCADDRNVPROC.class, fi, constants$741.PFNGLGETVKPROCADDRNVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static PFNGLGETVKPROCADDRNVPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                return (jdk.incubator.foreign.MemoryAddress)constants$741.PFNGLGETVKPROCADDRNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


