// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLLOADTRANSPOSEMATRIXXOESPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLLOADTRANSPOSEMATRIXXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLLOADTRANSPOSEMATRIXXOESPROC.class, fi, constants$433.PFNGLLOADTRANSPOSEMATRIXXOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLLOADTRANSPOSEMATRIXXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLLOADTRANSPOSEMATRIXXOESPROC.class, fi, constants$433.PFNGLLOADTRANSPOSEMATRIXXOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLLOADTRANSPOSEMATRIXXOESPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$433.PFNGLLOADTRANSPOSEMATRIXXOESPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

