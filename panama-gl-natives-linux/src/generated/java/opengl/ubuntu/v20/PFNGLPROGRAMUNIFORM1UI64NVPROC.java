// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORM1UI64NVPROC {

    void apply(int x0, int x1, long x2);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM1UI64NVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM1UI64NVPROC.class, fi, constants$464.PFNGLPROGRAMUNIFORM1UI64NVPROC$FUNC, "(IIJ)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM1UI64NVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM1UI64NVPROC.class, fi, constants$464.PFNGLPROGRAMUNIFORM1UI64NVPROC$FUNC, "(IIJ)V", scope);
    }
    static PFNGLPROGRAMUNIFORM1UI64NVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, long x2) -> {
            try {
                constants$464.PFNGLPROGRAMUNIFORM1UI64NVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

