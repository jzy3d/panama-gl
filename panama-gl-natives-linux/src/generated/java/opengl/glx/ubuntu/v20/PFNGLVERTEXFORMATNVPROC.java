// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXFORMATNVPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLVERTEXFORMATNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXFORMATNVPROC.class, fi, constants$931.PFNGLVERTEXFORMATNVPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXFORMATNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXFORMATNVPROC.class, fi, constants$931.PFNGLVERTEXFORMATNVPROC$FUNC, "(III)V", scope);
    }
    static PFNGLVERTEXFORMATNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$931.PFNGLVERTEXFORMATNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


