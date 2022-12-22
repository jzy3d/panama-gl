// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPROGRAMUNIFORM2DPROC {

    void apply(int x0, int x1, double x2, double x3);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM2DPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2DPROC.class, fi, constants$314.PFNGLPROGRAMUNIFORM2DPROC$FUNC, "(IIDD)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM2DPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2DPROC.class, fi, constants$314.PFNGLPROGRAMUNIFORM2DPROC$FUNC, "(IIDD)V", scope);
    }
    static PFNGLPROGRAMUNIFORM2DPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, double x2, double x3) -> {
            try {
                constants$314.PFNGLPROGRAMUNIFORM2DPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


