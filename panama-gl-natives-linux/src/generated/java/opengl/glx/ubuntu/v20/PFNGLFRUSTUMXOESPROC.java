// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFRUSTUMXOESPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5);
    static MemoryAddress allocate(PFNGLFRUSTUMXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRUSTUMXOESPROC.class, fi, constants$501.PFNGLFRUSTUMXOESPROC$FUNC, "(IIIIII)V");
    }
    static MemoryAddress allocate(PFNGLFRUSTUMXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRUSTUMXOESPROC.class, fi, constants$501.PFNGLFRUSTUMXOESPROC$FUNC, "(IIIIII)V", scope);
    }
    static PFNGLFRUSTUMXOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5) -> {
            try {
                constants$501.PFNGLFRUSTUMXOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


