// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXARRAYVERTEXOFFSETEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, long x5);
    static MemoryAddress allocate(PFNGLVERTEXARRAYVERTEXOFFSETEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYVERTEXOFFSETEXTPROC.class, fi, constants$687.PFNGLVERTEXARRAYVERTEXOFFSETEXTPROC$FUNC, "(IIIIIJ)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXARRAYVERTEXOFFSETEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYVERTEXOFFSETEXTPROC.class, fi, constants$687.PFNGLVERTEXARRAYVERTEXOFFSETEXTPROC$FUNC, "(IIIIIJ)V", scope);
    }
    static PFNGLVERTEXARRAYVERTEXOFFSETEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, long x5) -> {
            try {
                constants$687.PFNGLVERTEXARRAYVERTEXOFFSETEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


