// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLUNIFORM4FARBPROC {

    void apply(int x0, float x1, float x2, float x3, float x4);
    static MemoryAddress allocate(PFNGLUNIFORM4FARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM4FARBPROC.class, fi, constants$447.PFNGLUNIFORM4FARBPROC$FUNC, "(IFFFF)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM4FARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM4FARBPROC.class, fi, constants$447.PFNGLUNIFORM4FARBPROC$FUNC, "(IFFFF)V", scope);
    }
    static PFNGLUNIFORM4FARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2, float x3, float x4) -> {
            try {
                constants$447.PFNGLUNIFORM4FARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


