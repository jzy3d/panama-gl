// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLQUERYMATRIXXOESPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLQUERYMATRIXXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLQUERYMATRIXXOESPROC.class, fi, constants$448.PFNGLQUERYMATRIXXOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLQUERYMATRIXXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLQUERYMATRIXXOESPROC.class, fi, constants$448.PFNGLQUERYMATRIXXOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLQUERYMATRIXXOESPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (int)constants$448.PFNGLQUERYMATRIXXOESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

