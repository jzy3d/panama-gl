// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLRASTERPOS2XVOESPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLRASTERPOS2XVOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLRASTERPOS2XVOESPROC.class, fi, constants$440.PFNGLRASTERPOS2XVOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLRASTERPOS2XVOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLRASTERPOS2XVOESPROC.class, fi, constants$440.PFNGLRASTERPOS2XVOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLRASTERPOS2XVOESPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$440.PFNGLRASTERPOS2XVOESPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

