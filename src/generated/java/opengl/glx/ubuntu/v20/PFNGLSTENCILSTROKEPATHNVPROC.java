// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSTENCILSTROKEPATHNVPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLSTENCILSTROKEPATHNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILSTROKEPATHNVPROC.class, fi, constants$879.PFNGLSTENCILSTROKEPATHNVPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLSTENCILSTROKEPATHNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILSTROKEPATHNVPROC.class, fi, constants$879.PFNGLSTENCILSTROKEPATHNVPROC$FUNC, "(III)V", scope);
    }
    static PFNGLSTENCILSTROKEPATHNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$879.PFNGLSTENCILSTROKEPATHNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


