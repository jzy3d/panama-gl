// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPROGRAMUNIFORM4UI64NVPROC {

    void apply(int x0, int x1, long x2, long x3, long x4, long x5);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM4UI64NVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM4UI64NVPROC.class, fi, constants$550.PFNGLPROGRAMUNIFORM4UI64NVPROC$FUNC, "(IIJJJJ)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM4UI64NVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM4UI64NVPROC.class, fi, constants$550.PFNGLPROGRAMUNIFORM4UI64NVPROC$FUNC, "(IIJJJJ)V", scope);
    }
    static PFNGLPROGRAMUNIFORM4UI64NVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, long x2, long x3, long x4, long x5) -> {
            try {
                constants$550.PFNGLPROGRAMUNIFORM4UI64NVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


