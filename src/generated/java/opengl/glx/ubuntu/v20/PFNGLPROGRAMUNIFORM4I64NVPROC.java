// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPROGRAMUNIFORM4I64NVPROC {

    void apply(int x0, int x1, long x2, long x3, long x4, long x5);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM4I64NVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM4I64NVPROC.class, fi, constants$548.PFNGLPROGRAMUNIFORM4I64NVPROC$FUNC, "(IIJJJJ)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM4I64NVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM4I64NVPROC.class, fi, constants$548.PFNGLPROGRAMUNIFORM4I64NVPROC$FUNC, "(IIJJJJ)V", scope);
    }
    static PFNGLPROGRAMUNIFORM4I64NVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, long x2, long x3, long x4, long x5) -> {
            try {
                constants$548.PFNGLPROGRAMUNIFORM4I64NVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


