// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMATRIXTRANSLATEFEXTPROC {

    void apply(int x0, float x1, float x2, float x3);
    static MemoryAddress allocate(PFNGLMATRIXTRANSLATEFEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXTRANSLATEFEXTPROC.class, fi, constants$624.PFNGLMATRIXTRANSLATEFEXTPROC$FUNC, "(IFFF)V");
    }
    static MemoryAddress allocate(PFNGLMATRIXTRANSLATEFEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXTRANSLATEFEXTPROC.class, fi, constants$624.PFNGLMATRIXTRANSLATEFEXTPROC$FUNC, "(IFFF)V", scope);
    }
    static PFNGLMATRIXTRANSLATEFEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2, float x3) -> {
            try {
                constants$624.PFNGLMATRIXTRANSLATEFEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


