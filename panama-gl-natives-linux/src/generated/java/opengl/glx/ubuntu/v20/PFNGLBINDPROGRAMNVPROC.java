// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBINDPROGRAMNVPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLBINDPROGRAMNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDPROGRAMNVPROC.class, fi, constants$935.PFNGLBINDPROGRAMNVPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLBINDPROGRAMNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDPROGRAMNVPROC.class, fi, constants$935.PFNGLBINDPROGRAMNVPROC$FUNC, "(II)V", scope);
    }
    static PFNGLBINDPROGRAMNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$935.PFNGLBINDPROGRAMNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


