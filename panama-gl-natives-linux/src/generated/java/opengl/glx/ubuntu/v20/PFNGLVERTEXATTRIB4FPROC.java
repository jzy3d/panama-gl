// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIB4FPROC {

    void apply(int x0, float x1, float x2, float x3, float x4);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB4FPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4FPROC.class, fi, constants$226.PFNGLVERTEXATTRIB4FPROC$FUNC, "(IFFFF)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB4FPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4FPROC.class, fi, constants$226.PFNGLVERTEXATTRIB4FPROC$FUNC, "(IFFFF)V", scope);
    }
    static PFNGLVERTEXATTRIB4FPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2, float x3, float x4) -> {
            try {
                constants$226.PFNGLVERTEXATTRIB4FPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


