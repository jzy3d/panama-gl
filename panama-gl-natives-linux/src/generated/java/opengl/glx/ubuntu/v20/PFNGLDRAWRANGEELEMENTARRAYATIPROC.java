// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDRAWRANGEELEMENTARRAYATIPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLDRAWRANGEELEMENTARRAYATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDRAWRANGEELEMENTARRAYATIPROC.class, fi, constants$572.PFNGLDRAWRANGEELEMENTARRAYATIPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLDRAWRANGEELEMENTARRAYATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDRAWRANGEELEMENTARRAYATIPROC.class, fi, constants$572.PFNGLDRAWRANGEELEMENTARRAYATIPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLDRAWRANGEELEMENTARRAYATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$572.PFNGLDRAWRANGEELEMENTARRAYATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


