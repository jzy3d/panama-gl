// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIB1SNVPROC {

    void apply(int x0, short x1);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB1SNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB1SNVPROC.class, fi, constants$944.PFNGLVERTEXATTRIB1SNVPROC$FUNC, "(IS)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB1SNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB1SNVPROC.class, fi, constants$944.PFNGLVERTEXATTRIB1SNVPROC$FUNC, "(IS)V", scope);
    }
    static PFNGLVERTEXATTRIB1SNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, short x1) -> {
            try {
                constants$944.PFNGLVERTEXATTRIB1SNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


