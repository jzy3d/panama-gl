// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTITEXCOORD3SARBPROC {

    void apply(int x0, short x1, short x2, short x3);
    static MemoryAddress allocate(PFNGLMULTITEXCOORD3SARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD3SARBPROC.class, fi, constants$88.PFNGLMULTITEXCOORD3SARBPROC$FUNC, "(ISSS)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXCOORD3SARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD3SARBPROC.class, fi, constants$88.PFNGLMULTITEXCOORD3SARBPROC$FUNC, "(ISSS)V", scope);
    }
    static PFNGLMULTITEXCOORD3SARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, short x1, short x2, short x3) -> {
            try {
                constants$88.PFNGLMULTITEXCOORD3SARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


