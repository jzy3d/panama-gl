// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLUNIFORM2IARBPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLUNIFORM2IARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM2IARBPROC.class, fi, constants$448.PFNGLUNIFORM2IARBPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM2IARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM2IARBPROC.class, fi, constants$448.PFNGLUNIFORM2IARBPROC$FUNC, "(III)V", scope);
    }
    static PFNGLUNIFORM2IARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$448.PFNGLUNIFORM2IARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


