// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIBLFORMATPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBLFORMATPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBLFORMATPROC.class, fi, constants$263.PFNGLVERTEXATTRIBLFORMATPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBLFORMATPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBLFORMATPROC.class, fi, constants$263.PFNGLVERTEXATTRIBLFORMATPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLVERTEXATTRIBLFORMATPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$263.PFNGLVERTEXATTRIBLFORMATPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


