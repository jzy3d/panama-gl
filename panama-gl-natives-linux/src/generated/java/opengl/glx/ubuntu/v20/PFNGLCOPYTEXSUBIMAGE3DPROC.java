// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOPYTEXSUBIMAGE3DPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8);
    static MemoryAddress allocate(PFNGLCOPYTEXSUBIMAGE3DPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOPYTEXSUBIMAGE3DPROC.class, fi, constants$143.PFNGLCOPYTEXSUBIMAGE3DPROC$FUNC, "(IIIIIIIII)V");
    }
    static MemoryAddress allocate(PFNGLCOPYTEXSUBIMAGE3DPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOPYTEXSUBIMAGE3DPROC.class, fi, constants$143.PFNGLCOPYTEXSUBIMAGE3DPROC$FUNC, "(IIIIIIIII)V", scope);
    }
    static PFNGLCOPYTEXSUBIMAGE3DPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8) -> {
            try {
                constants$143.PFNGLCOPYTEXSUBIMAGE3DPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


