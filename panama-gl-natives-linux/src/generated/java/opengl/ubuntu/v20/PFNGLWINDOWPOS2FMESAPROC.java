// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLWINDOWPOS2FMESAPROC {

    void apply(float x0, float x1);
    static MemoryAddress allocate(PFNGLWINDOWPOS2FMESAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2FMESAPROC.class, fi, constants$712.PFNGLWINDOWPOS2FMESAPROC$FUNC, "(FF)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWPOS2FMESAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2FMESAPROC.class, fi, constants$712.PFNGLWINDOWPOS2FMESAPROC$FUNC, "(FF)V", scope);
    }
    static PFNGLWINDOWPOS2FMESAPROC ofAddress(MemoryAddress addr) {
        return (float x0, float x1) -> {
            try {
                constants$712.PFNGLWINDOWPOS2FMESAPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

