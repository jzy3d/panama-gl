// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMEMORYBARRIERBYREGIONPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLMEMORYBARRIERBYREGIONPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMEMORYBARRIERBYREGIONPROC.class, fi, constants$303.PFNGLMEMORYBARRIERBYREGIONPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLMEMORYBARRIERBYREGIONPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMEMORYBARRIERBYREGIONPROC.class, fi, constants$303.PFNGLMEMORYBARRIERBYREGIONPROC$FUNC, "(I)V", scope);
    }
    static PFNGLMEMORYBARRIERBYREGIONPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$303.PFNGLMEMORYBARRIERBYREGIONPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

