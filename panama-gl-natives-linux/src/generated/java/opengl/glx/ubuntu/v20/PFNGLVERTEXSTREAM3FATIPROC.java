// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXSTREAM3FATIPROC {

    void apply(int x0, float x1, float x2, float x3);
    static MemoryAddress allocate(PFNGLVERTEXSTREAM3FATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM3FATIPROC.class, fi, constants$592.PFNGLVERTEXSTREAM3FATIPROC$FUNC, "(IFFF)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXSTREAM3FATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM3FATIPROC.class, fi, constants$592.PFNGLVERTEXSTREAM3FATIPROC$FUNC, "(IFFF)V", scope);
    }
    static PFNGLVERTEXSTREAM3FATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2, float x3) -> {
            try {
                constants$592.PFNGLVERTEXSTREAM3FATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

