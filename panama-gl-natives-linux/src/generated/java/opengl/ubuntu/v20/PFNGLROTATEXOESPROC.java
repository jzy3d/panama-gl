// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLROTATEXOESPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLROTATEXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLROTATEXOESPROC.class, fi, constants$423.PFNGLROTATEXOESPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLROTATEXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLROTATEXOESPROC.class, fi, constants$423.PFNGLROTATEXOESPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLROTATEXOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$423.PFNGLROTATEXOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


