// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIB3FPROC {

    void apply(int x0, float x1, float x2, float x3);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB3FPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB3FPROC.class, fi, constants$222.PFNGLVERTEXATTRIB3FPROC$FUNC, "(IFFF)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB3FPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB3FPROC.class, fi, constants$222.PFNGLVERTEXATTRIB3FPROC$FUNC, "(IFFF)V", scope);
    }
    static PFNGLVERTEXATTRIB3FPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2, float x3) -> {
            try {
                constants$222.PFNGLVERTEXATTRIB3FPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


