// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPOINTPARAMETERFVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLPOINTPARAMETERFVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPOINTPARAMETERFVPROC.class, fi, constants$92.PFNGLPOINTPARAMETERFVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPOINTPARAMETERFVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPOINTPARAMETERFVPROC.class, fi, constants$92.PFNGLPOINTPARAMETERFVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPOINTPARAMETERFVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$92.PFNGLPOINTPARAMETERFVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


