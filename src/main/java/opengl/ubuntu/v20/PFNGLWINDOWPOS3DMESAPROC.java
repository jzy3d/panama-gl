// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLWINDOWPOS3DMESAPROC {

    void apply(double x0, double x1, double x2);
    static MemoryAddress allocate(PFNGLWINDOWPOS3DMESAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3DMESAPROC.class, fi, constants$714.PFNGLWINDOWPOS3DMESAPROC$FUNC, "(DDD)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWPOS3DMESAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3DMESAPROC.class, fi, constants$714.PFNGLWINDOWPOS3DMESAPROC$FUNC, "(DDD)V", scope);
    }
    static PFNGLWINDOWPOS3DMESAPROC ofAddress(MemoryAddress addr) {
        return (double x0, double x1, double x2) -> {
            try {
                constants$714.PFNGLWINDOWPOS3DMESAPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


