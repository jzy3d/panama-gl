// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSTATECAPTURENVPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLSTATECAPTURENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSTATECAPTURENVPROC.class, fi, constants$818.PFNGLSTATECAPTURENVPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLSTATECAPTURENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSTATECAPTURENVPROC.class, fi, constants$818.PFNGLSTATECAPTURENVPROC$FUNC, "(II)V", scope);
    }
    static PFNGLSTATECAPTURENVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$818.PFNGLSTATECAPTURENVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

