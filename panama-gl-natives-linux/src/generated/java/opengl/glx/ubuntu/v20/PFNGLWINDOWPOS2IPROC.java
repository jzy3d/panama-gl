// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLWINDOWPOS2IPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLWINDOWPOS2IPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2IPROC.class, fi, constants$187.PFNGLWINDOWPOS2IPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWPOS2IPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2IPROC.class, fi, constants$187.PFNGLWINDOWPOS2IPROC$FUNC, "(II)V", scope);
    }
    static PFNGLWINDOWPOS2IPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$187.PFNGLWINDOWPOS2IPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


