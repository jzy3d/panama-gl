// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLWINDOWPOS2DPROC {

    void apply(double x0, double x1);
    static MemoryAddress allocate(PFNGLWINDOWPOS2DPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2DPROC.class, fi, constants$186.PFNGLWINDOWPOS2DPROC$FUNC, "(DD)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWPOS2DPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2DPROC.class, fi, constants$186.PFNGLWINDOWPOS2DPROC$FUNC, "(DD)V", scope);
    }
    static PFNGLWINDOWPOS2DPROC ofAddress(MemoryAddress addr) {
        return (double x0, double x1) -> {
            try {
                constants$186.PFNGLWINDOWPOS2DPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


