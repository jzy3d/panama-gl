// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMAXSHADERCOMPILERTHREADSKHRPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLMAXSHADERCOMPILERTHREADSKHRPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMAXSHADERCOMPILERTHREADSKHRPROC.class, fi, constants$406.PFNGLMAXSHADERCOMPILERTHREADSKHRPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLMAXSHADERCOMPILERTHREADSKHRPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMAXSHADERCOMPILERTHREADSKHRPROC.class, fi, constants$406.PFNGLMAXSHADERCOMPILERTHREADSKHRPROC$FUNC, "(I)V", scope);
    }
    static PFNGLMAXSHADERCOMPILERTHREADSKHRPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$406.PFNGLMAXSHADERCOMPILERTHREADSKHRPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

