// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFRUSTUMFOESPROC {

    void apply(float x0, float x1, float x2, float x3, float x4, float x5);
    static MemoryAddress allocate(PFNGLFRUSTUMFOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRUSTUMFOESPROC.class, fi, constants$534.PFNGLFRUSTUMFOESPROC$FUNC, "(FFFFFF)V");
    }
    static MemoryAddress allocate(PFNGLFRUSTUMFOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRUSTUMFOESPROC.class, fi, constants$534.PFNGLFRUSTUMFOESPROC$FUNC, "(FFFFFF)V", scope);
    }
    static PFNGLFRUSTUMFOESPROC ofAddress(MemoryAddress addr) {
        return (float x0, float x1, float x2, float x3, float x4, float x5) -> {
            try {
                constants$534.PFNGLFRUSTUMFOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


