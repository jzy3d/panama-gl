// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETINTEGER64I_VPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETINTEGER64I_VPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETINTEGER64I_VPROC.class, fi, constants$267.PFNGLGETINTEGER64I_VPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETINTEGER64I_VPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETINTEGER64I_VPROC.class, fi, constants$267.PFNGLGETINTEGER64I_VPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETINTEGER64I_VPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$267.PFNGLGETINTEGER64I_VPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


