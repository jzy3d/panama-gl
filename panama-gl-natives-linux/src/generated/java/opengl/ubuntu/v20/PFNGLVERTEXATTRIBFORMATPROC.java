// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIBFORMATPROC {

    void apply(int x0, int x1, int x2, byte x3, int x4);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBFORMATPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBFORMATPROC.class, fi, constants$262.PFNGLVERTEXATTRIBFORMATPROC$FUNC, "(IIIBI)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBFORMATPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBFORMATPROC.class, fi, constants$262.PFNGLVERTEXATTRIBFORMATPROC$FUNC, "(IIIBI)V", scope);
    }
    static PFNGLVERTEXATTRIBFORMATPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, byte x3, int x4) -> {
            try {
                constants$262.PFNGLVERTEXATTRIBFORMATPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


