// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIB1FVARBPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB1FVARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB1FVARBPROC.class, fi, constants$471.PFNGLVERTEXATTRIB1FVARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB1FVARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB1FVARBPROC.class, fi, constants$471.PFNGLVERTEXATTRIB1FVARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLVERTEXATTRIB1FVARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$471.PFNGLVERTEXATTRIB1FVARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


