// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXSTREAM3FVATIPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLVERTEXSTREAM3FVATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM3FVATIPROC.class, fi, constants$507.PFNGLVERTEXSTREAM3FVATIPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXSTREAM3FVATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM3FVATIPROC.class, fi, constants$507.PFNGLVERTEXSTREAM3FVATIPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLVERTEXSTREAM3FVATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$507.PFNGLVERTEXSTREAM3FVATIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


