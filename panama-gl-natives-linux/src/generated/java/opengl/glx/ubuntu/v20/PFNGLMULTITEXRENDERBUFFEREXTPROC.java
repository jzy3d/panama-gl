// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTITEXRENDERBUFFEREXTPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLMULTITEXRENDERBUFFEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXRENDERBUFFEREXTPROC.class, fi, constants$686.PFNGLMULTITEXRENDERBUFFEREXTPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXRENDERBUFFEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXRENDERBUFFEREXTPROC.class, fi, constants$686.PFNGLMULTITEXRENDERBUFFEREXTPROC$FUNC, "(III)V", scope);
    }
    static PFNGLMULTITEXRENDERBUFFEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$686.PFNGLMULTITEXRENDERBUFFEREXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


