// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPIXELTRANSFORMPARAMETERIEXTPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLPIXELTRANSFORMPARAMETERIEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPIXELTRANSFORMPARAMETERIEXTPROC.class, fi, constants$736.PFNGLPIXELTRANSFORMPARAMETERIEXTPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLPIXELTRANSFORMPARAMETERIEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPIXELTRANSFORMPARAMETERIEXTPROC.class, fi, constants$736.PFNGLPIXELTRANSFORMPARAMETERIEXTPROC$FUNC, "(III)V", scope);
    }
    static PFNGLPIXELTRANSFORMPARAMETERIEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$736.PFNGLPIXELTRANSFORMPARAMETERIEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


