// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOLOR4XOESPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLCOLOR4XOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOLOR4XOESPROC.class, fi, constants$500.PFNGLCOLOR4XOESPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLCOLOR4XOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOLOR4XOESPROC.class, fi, constants$500.PFNGLCOLOR4XOESPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLCOLOR4XOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$500.PFNGLCOLOR4XOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


