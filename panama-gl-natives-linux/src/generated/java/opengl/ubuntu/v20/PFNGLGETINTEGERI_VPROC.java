// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETINTEGERI_VPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETINTEGERI_VPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETINTEGERI_VPROC.class, fi, constants$147.PFNGLGETINTEGERI_VPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETINTEGERI_VPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETINTEGERI_VPROC.class, fi, constants$147.PFNGLGETINTEGERI_VPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETINTEGERI_VPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$147.PFNGLGETINTEGERI_VPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

