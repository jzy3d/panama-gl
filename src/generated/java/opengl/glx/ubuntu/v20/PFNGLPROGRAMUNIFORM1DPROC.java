// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPROGRAMUNIFORM1DPROC {

    void apply(int x0, int x1, double x2);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM1DPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM1DPROC.class, fi, constants$311.PFNGLPROGRAMUNIFORM1DPROC$FUNC, "(IID)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM1DPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM1DPROC.class, fi, constants$311.PFNGLPROGRAMUNIFORM1DPROC$FUNC, "(IID)V", scope);
    }
    static PFNGLPROGRAMUNIFORM1DPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, double x2) -> {
            try {
                constants$311.PFNGLPROGRAMUNIFORM1DPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


