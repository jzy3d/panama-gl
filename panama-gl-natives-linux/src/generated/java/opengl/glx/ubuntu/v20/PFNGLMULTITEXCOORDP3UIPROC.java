// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTITEXCOORDP3UIPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLMULTITEXCOORDP3UIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORDP3UIPROC.class, fi, constants$285.PFNGLMULTITEXCOORDP3UIPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXCOORDP3UIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORDP3UIPROC.class, fi, constants$285.PFNGLMULTITEXCOORDP3UIPROC$FUNC, "(III)V", scope);
    }
    static PFNGLMULTITEXCOORDP3UIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$285.PFNGLMULTITEXCOORDP3UIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


