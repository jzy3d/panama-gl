// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLLOADMATRIXXOESPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLLOADMATRIXXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLLOADMATRIXXOESPROC.class, fi, constants$505.PFNGLLOADMATRIXXOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLLOADMATRIXXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLLOADMATRIXXOESPROC.class, fi, constants$505.PFNGLLOADMATRIXXOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLLOADMATRIXXOESPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$505.PFNGLLOADMATRIXXOESPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


