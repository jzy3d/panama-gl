// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPOLLINSTRUMENTSSGIXPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLPOLLINSTRUMENTSSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPOLLINSTRUMENTSSGIXPROC.class, fi, constants$900.PFNGLPOLLINSTRUMENTSSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLPOLLINSTRUMENTSSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPOLLINSTRUMENTSSGIXPROC.class, fi, constants$900.PFNGLPOLLINSTRUMENTSSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLPOLLINSTRUMENTSSGIXPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                return (int)constants$900.PFNGLPOLLINSTRUMENTSSGIXPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

