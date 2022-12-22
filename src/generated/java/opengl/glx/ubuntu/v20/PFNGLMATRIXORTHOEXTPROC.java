// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMATRIXORTHOEXTPROC {

    void apply(int x0, double x1, double x2, double x3, double x4, double x5, double x6);
    static MemoryAddress allocate(PFNGLMATRIXORTHOEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXORTHOEXTPROC.class, fi, constants$625.PFNGLMATRIXORTHOEXTPROC$FUNC, "(IDDDDDD)V");
    }
    static MemoryAddress allocate(PFNGLMATRIXORTHOEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXORTHOEXTPROC.class, fi, constants$625.PFNGLMATRIXORTHOEXTPROC$FUNC, "(IDDDDDD)V", scope);
    }
    static PFNGLMATRIXORTHOEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, double x1, double x2, double x3, double x4, double x5, double x6) -> {
            try {
                constants$625.PFNGLMATRIXORTHOEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


