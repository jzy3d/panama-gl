// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORM3UI64NVPROC {

    void apply(int x0, int x1, long x2, long x3, long x4);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM3UI64NVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3UI64NVPROC.class, fi, constants$550.PFNGLPROGRAMUNIFORM3UI64NVPROC$FUNC, "(IIJJJ)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM3UI64NVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3UI64NVPROC.class, fi, constants$550.PFNGLPROGRAMUNIFORM3UI64NVPROC$FUNC, "(IIJJJ)V", scope);
    }
    static PFNGLPROGRAMUNIFORM3UI64NVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, long x2, long x3, long x4) -> {
            try {
                constants$550.PFNGLPROGRAMUNIFORM3UI64NVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


