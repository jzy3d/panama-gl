// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORMMATRIX2DVEXTPROC {

    void apply(int x0, int x1, int x2, byte x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORMMATRIX2DVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORMMATRIX2DVEXTPROC.class, fi, constants$698.PFNGLPROGRAMUNIFORMMATRIX2DVEXTPROC$FUNC, "(IIIBLjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORMMATRIX2DVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORMMATRIX2DVEXTPROC.class, fi, constants$698.PFNGLPROGRAMUNIFORMMATRIX2DVEXTPROC$FUNC, "(IIIBLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPROGRAMUNIFORMMATRIX2DVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, byte x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$698.PFNGLPROGRAMUNIFORMMATRIX2DVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


