// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIB2DARBPROC {

    void apply(int x0, double x1, double x2);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB2DARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB2DARBPROC.class, fi, constants$472.PFNGLVERTEXATTRIB2DARBPROC$FUNC, "(IDD)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB2DARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB2DARBPROC.class, fi, constants$472.PFNGLVERTEXATTRIB2DARBPROC$FUNC, "(IDD)V", scope);
    }
    static PFNGLVERTEXATTRIB2DARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, double x1, double x2) -> {
            try {
                constants$472.PFNGLVERTEXATTRIB2DARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


