// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMATRIXLOADTRANSPOSE3X3FNVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLMATRIXLOADTRANSPOSE3X3FNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXLOADTRANSPOSE3X3FNVPROC.class, fi, constants$801.PFNGLMATRIXLOADTRANSPOSE3X3FNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLMATRIXLOADTRANSPOSE3X3FNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXLOADTRANSPOSE3X3FNVPROC.class, fi, constants$801.PFNGLMATRIXLOADTRANSPOSE3X3FNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLMATRIXLOADTRANSPOSE3X3FNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$801.PFNGLMATRIXLOADTRANSPOSE3X3FNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

