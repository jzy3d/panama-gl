// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIB2SNVPROC {

    void apply(int x0, short x1, short x2);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB2SNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB2SNVPROC.class, fi, constants$946.PFNGLVERTEXATTRIB2SNVPROC$FUNC, "(ISS)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB2SNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB2SNVPROC.class, fi, constants$946.PFNGLVERTEXATTRIB2SNVPROC$FUNC, "(ISS)V", scope);
    }
    static PFNGLVERTEXATTRIB2SNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, short x1, short x2) -> {
            try {
                constants$946.PFNGLVERTEXATTRIB2SNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


