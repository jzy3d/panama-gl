// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLWINDOWPOS4SMESAPROC {

    void apply(short x0, short x1, short x2, short x3);
    static MemoryAddress allocate(PFNGLWINDOWPOS4SMESAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS4SMESAPROC.class, fi, constants$804.PFNGLWINDOWPOS4SMESAPROC$FUNC, "(SSSS)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWPOS4SMESAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS4SMESAPROC.class, fi, constants$804.PFNGLWINDOWPOS4SMESAPROC$FUNC, "(SSSS)V", scope);
    }
    static PFNGLWINDOWPOS4SMESAPROC ofAddress(MemoryAddress addr) {
        return (short x0, short x1, short x2, short x3) -> {
            try {
                constants$804.PFNGLWINDOWPOS4SMESAPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


