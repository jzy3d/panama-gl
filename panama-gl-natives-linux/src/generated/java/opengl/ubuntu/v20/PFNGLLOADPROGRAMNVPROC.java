// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLLOADPROGRAMNVPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLLOADPROGRAMNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLLOADPROGRAMNVPROC.class, fi, constants$854.PFNGLLOADPROGRAMNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLLOADPROGRAMNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLLOADPROGRAMNVPROC.class, fi, constants$854.PFNGLLOADPROGRAMNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLLOADPROGRAMNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$854.PFNGLLOADPROGRAMNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


