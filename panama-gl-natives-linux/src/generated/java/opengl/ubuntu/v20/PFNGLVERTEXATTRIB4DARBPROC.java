// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIB4DARBPROC {

    void apply(int x0, double x1, double x2, double x3, double x4);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB4DARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4DARBPROC.class, fi, constants$393.PFNGLVERTEXATTRIB4DARBPROC$FUNC, "(IDDDD)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB4DARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4DARBPROC.class, fi, constants$393.PFNGLVERTEXATTRIB4DARBPROC$FUNC, "(IDDDD)V", scope);
    }
    static PFNGLVERTEXATTRIB4DARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, double x1, double x2, double x3, double x4) -> {
            try {
                constants$393.PFNGLVERTEXATTRIB4DARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


