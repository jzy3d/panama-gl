// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTITEXCOORD3IARBPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLMULTITEXCOORD3IARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD3IARBPROC.class, fi, constants$172.PFNGLMULTITEXCOORD3IARBPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXCOORD3IARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD3IARBPROC.class, fi, constants$172.PFNGLMULTITEXCOORD3IARBPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLMULTITEXCOORD3IARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$172.PFNGLMULTITEXCOORD3IARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


