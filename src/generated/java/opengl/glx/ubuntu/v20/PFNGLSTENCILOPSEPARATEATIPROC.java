// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSTENCILOPSEPARATEATIPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLSTENCILOPSEPARATEATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILOPSEPARATEATIPROC.class, fi, constants$580.PFNGLSTENCILOPSEPARATEATIPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLSTENCILOPSEPARATEATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILOPSEPARATEATIPROC.class, fi, constants$580.PFNGLSTENCILOPSEPARATEATIPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLSTENCILOPSEPARATEATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$580.PFNGLSTENCILOPSEPARATEATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


