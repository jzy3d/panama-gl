// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLWINDOWPOS4IMESAPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLWINDOWPOS4IMESAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS4IMESAPROC.class, fi, constants$804.PFNGLWINDOWPOS4IMESAPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWPOS4IMESAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS4IMESAPROC.class, fi, constants$804.PFNGLWINDOWPOS4IMESAPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLWINDOWPOS4IMESAPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$804.PFNGLWINDOWPOS4IMESAPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


