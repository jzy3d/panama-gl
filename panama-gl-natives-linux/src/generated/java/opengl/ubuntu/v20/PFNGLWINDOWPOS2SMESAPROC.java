// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLWINDOWPOS2SMESAPROC {

    void apply(short x0, short x1);
    static MemoryAddress allocate(PFNGLWINDOWPOS2SMESAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2SMESAPROC.class, fi, constants$714.PFNGLWINDOWPOS2SMESAPROC$FUNC, "(SS)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWPOS2SMESAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2SMESAPROC.class, fi, constants$714.PFNGLWINDOWPOS2SMESAPROC$FUNC, "(SS)V", scope);
    }
    static PFNGLWINDOWPOS2SMESAPROC ofAddress(MemoryAddress addr) {
        return (short x0, short x1) -> {
            try {
                constants$714.PFNGLWINDOWPOS2SMESAPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


