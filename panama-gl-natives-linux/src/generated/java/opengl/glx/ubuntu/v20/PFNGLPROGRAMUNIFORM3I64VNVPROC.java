// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORM3I64VNVPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM3I64VNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3I64VNVPROC.class, fi, constants$549.PFNGLPROGRAMUNIFORM3I64VNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM3I64VNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3I64VNVPROC.class, fi, constants$549.PFNGLPROGRAMUNIFORM3I64VNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPROGRAMUNIFORM3I64VNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$549.PFNGLPROGRAMUNIFORM3I64VNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

