// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIBP3UIPROC {

    void apply(int x0, int x1, byte x2, int x3);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBP3UIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBP3UIPROC.class, fi, constants$192.PFNGLVERTEXATTRIBP3UIPROC$FUNC, "(IIBI)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBP3UIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBP3UIPROC.class, fi, constants$192.PFNGLVERTEXATTRIBP3UIPROC$FUNC, "(IIBI)V", scope);
    }
    static PFNGLVERTEXATTRIBP3UIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, byte x2, int x3) -> {
            try {
                constants$192.PFNGLVERTEXATTRIBP3UIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

