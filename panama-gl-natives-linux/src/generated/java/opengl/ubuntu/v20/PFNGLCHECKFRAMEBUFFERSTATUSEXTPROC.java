// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC {

    int apply(int x0);
    static MemoryAddress allocate(PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC.class, fi, constants$628.PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC$FUNC, "(I)I");
    }
    static MemoryAddress allocate(PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC.class, fi, constants$628.PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC$FUNC, "(I)I", scope);
    }
    static PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (int)constants$628.PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


