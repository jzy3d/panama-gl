// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC {

    int apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC.class, fi, constants$595.PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC$FUNC, "(II)I");
    }
    static MemoryAddress allocate(PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC.class, fi, constants$595.PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC$FUNC, "(II)I", scope);
    }
    static PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                return (int)constants$595.PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


