// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMAPGRID1XOESPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLMAPGRID1XOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMAPGRID1XOESPROC.class, fi, constants$519.PFNGLMAPGRID1XOESPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLMAPGRID1XOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMAPGRID1XOESPROC.class, fi, constants$519.PFNGLMAPGRID1XOESPROC$FUNC, "(III)V", scope);
    }
    static PFNGLMAPGRID1XOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$519.PFNGLMAPGRID1XOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


