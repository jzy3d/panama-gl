// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLWINDOWPOS3IPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLWINDOWPOS3IPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3IPROC.class, fi, constants$190.PFNGLWINDOWPOS3IPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWPOS3IPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3IPROC.class, fi, constants$190.PFNGLWINDOWPOS3IPROC$FUNC, "(III)V", scope);
    }
    static PFNGLWINDOWPOS3IPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$190.PFNGLWINDOWPOS3IPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


