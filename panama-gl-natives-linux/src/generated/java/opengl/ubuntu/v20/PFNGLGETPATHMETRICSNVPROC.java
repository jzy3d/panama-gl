// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETPATHMETRICSNVPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6);
    static MemoryAddress allocate(PFNGLGETPATHMETRICSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHMETRICSNVPROC.class, fi, constants$798.PFNGLGETPATHMETRICSNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETPATHMETRICSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHMETRICSNVPROC.class, fi, constants$798.PFNGLGETPATHMETRICSNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETPATHMETRICSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6) -> {
            try {
                constants$798.PFNGLGETPATHMETRICSNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


