// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOPYIMAGESUBDATAPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, int x10, int x11, int x12, int x13, int x14);
    static MemoryAddress allocate(PFNGLCOPYIMAGESUBDATAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOPYIMAGESUBDATAPROC.class, fi, constants$339.PFNGLCOPYIMAGESUBDATAPROC$FUNC, "(IIIIIIIIIIIIIII)V");
    }
    static MemoryAddress allocate(PFNGLCOPYIMAGESUBDATAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOPYIMAGESUBDATAPROC.class, fi, constants$339.PFNGLCOPYIMAGESUBDATAPROC$FUNC, "(IIIIIIIIIIIIIII)V", scope);
    }
    static PFNGLCOPYIMAGESUBDATAPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, int x10, int x11, int x12, int x13, int x14) -> {
            try {
                constants$339.PFNGLCOPYIMAGESUBDATAPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


