// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC {

    int apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC.class, fi, constants$368.PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC$FUNC, "(II)I");
    }
    static MemoryAddress allocate(PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC.class, fi, constants$368.PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC$FUNC, "(II)I", scope);
    }
    static PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                return (int)constants$368.PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


