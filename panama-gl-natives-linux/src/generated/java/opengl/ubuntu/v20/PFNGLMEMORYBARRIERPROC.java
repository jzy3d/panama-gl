// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMEMORYBARRIERPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLMEMORYBARRIERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMEMORYBARRIERPROC.class, fi, constants$250.PFNGLMEMORYBARRIERPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLMEMORYBARRIERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMEMORYBARRIERPROC.class, fi, constants$250.PFNGLMEMORYBARRIERPROC$FUNC, "(I)V", scope);
    }
    static PFNGLMEMORYBARRIERPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$250.PFNGLMEMORYBARRIERPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


