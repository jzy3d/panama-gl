// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMAXSHADERCOMPILERTHREADSARBPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLMAXSHADERCOMPILERTHREADSARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMAXSHADERCOMPILERTHREADSARBPROC.class, fi, constants$348.PFNGLMAXSHADERCOMPILERTHREADSARBPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLMAXSHADERCOMPILERTHREADSARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMAXSHADERCOMPILERTHREADSARBPROC.class, fi, constants$348.PFNGLMAXSHADERCOMPILERTHREADSARBPROC$FUNC, "(I)V", scope);
    }
    static PFNGLMAXSHADERCOMPILERTHREADSARBPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$348.PFNGLMAXSHADERCOMPILERTHREADSARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


