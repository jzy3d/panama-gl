// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXARRAYINDEXOFFSETEXTPROC {

    void apply(int x0, int x1, int x2, int x3, long x4);
    static MemoryAddress allocate(PFNGLVERTEXARRAYINDEXOFFSETEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYINDEXOFFSETEXTPROC.class, fi, constants$602.PFNGLVERTEXARRAYINDEXOFFSETEXTPROC$FUNC, "(IIIIJ)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXARRAYINDEXOFFSETEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYINDEXOFFSETEXTPROC.class, fi, constants$602.PFNGLVERTEXARRAYINDEXOFFSETEXTPROC$FUNC, "(IIIIJ)V", scope);
    }
    static PFNGLVERTEXARRAYINDEXOFFSETEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, long x4) -> {
            try {
                constants$602.PFNGLVERTEXARRAYINDEXOFFSETEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

