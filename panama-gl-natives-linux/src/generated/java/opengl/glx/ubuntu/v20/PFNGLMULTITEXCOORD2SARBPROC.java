// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTITEXCOORD2SARBPROC {

    void apply(int x0, short x1, short x2);
    static MemoryAddress allocate(PFNGLMULTITEXCOORD2SARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD2SARBPROC.class, fi, constants$170.PFNGLMULTITEXCOORD2SARBPROC$FUNC, "(ISS)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXCOORD2SARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD2SARBPROC.class, fi, constants$170.PFNGLMULTITEXCOORD2SARBPROC$FUNC, "(ISS)V", scope);
    }
    static PFNGLMULTITEXCOORD2SARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, short x1, short x2) -> {
            try {
                constants$170.PFNGLMULTITEXCOORD2SARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


