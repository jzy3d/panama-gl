// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPROGRAMUNIFORM3DEXTPROC {

    void apply(int x0, int x1, double x2, double x3, double x4);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM3DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3DEXTPROC.class, fi, constants$696.PFNGLPROGRAMUNIFORM3DEXTPROC$FUNC, "(IIDDD)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM3DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3DEXTPROC.class, fi, constants$696.PFNGLPROGRAMUNIFORM3DEXTPROC$FUNC, "(IIDDD)V", scope);
    }
    static PFNGLPROGRAMUNIFORM3DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, double x2, double x3, double x4) -> {
            try {
                constants$696.PFNGLPROGRAMUNIFORM3DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


