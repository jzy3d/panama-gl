// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTITEXENVIEXTPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLMULTITEXENVIEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXENVIEXTPROC.class, fi, constants$635.PFNGLMULTITEXENVIEXTPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXENVIEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXENVIEXTPROC.class, fi, constants$635.PFNGLMULTITEXENVIEXTPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLMULTITEXENVIEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$635.PFNGLMULTITEXENVIEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


