// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORM2I64ARBPROC {

    void apply(int x0, int x1, long x2, long x3);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM2I64ARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2I64ARBPROC.class, fi, constants$338.PFNGLPROGRAMUNIFORM2I64ARBPROC$FUNC, "(IIJJ)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM2I64ARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2I64ARBPROC.class, fi, constants$338.PFNGLPROGRAMUNIFORM2I64ARBPROC$FUNC, "(IIJJ)V", scope);
    }
    static PFNGLPROGRAMUNIFORM2I64ARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, long x2, long x3) -> {
            try {
                constants$338.PFNGLPROGRAMUNIFORM2I64ARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


