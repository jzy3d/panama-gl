// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPROGRAMPARAMETER4DNVPROC {

    void apply(int x0, int x1, double x2, double x3, double x4, double x5);
    static MemoryAddress allocate(PFNGLPROGRAMPARAMETER4DNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMPARAMETER4DNVPROC.class, fi, constants$855.PFNGLPROGRAMPARAMETER4DNVPROC$FUNC, "(IIDDDD)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMPARAMETER4DNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMPARAMETER4DNVPROC.class, fi, constants$855.PFNGLPROGRAMPARAMETER4DNVPROC$FUNC, "(IIDDDD)V", scope);
    }
    static PFNGLPROGRAMPARAMETER4DNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, double x2, double x3, double x4, double x5) -> {
            try {
                constants$855.PFNGLPROGRAMPARAMETER4DNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

