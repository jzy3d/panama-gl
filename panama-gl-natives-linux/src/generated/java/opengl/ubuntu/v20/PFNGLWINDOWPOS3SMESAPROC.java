// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLWINDOWPOS3SMESAPROC {

    void apply(short x0, short x1, short x2);
    static MemoryAddress allocate(PFNGLWINDOWPOS3SMESAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3SMESAPROC.class, fi, constants$716.PFNGLWINDOWPOS3SMESAPROC$FUNC, "(SSS)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWPOS3SMESAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3SMESAPROC.class, fi, constants$716.PFNGLWINDOWPOS3SMESAPROC$FUNC, "(SSS)V", scope);
    }
    static PFNGLWINDOWPOS3SMESAPROC ofAddress(MemoryAddress addr) {
        return (short x0, short x1, short x2) -> {
            try {
                constants$716.PFNGLWINDOWPOS3SMESAPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


