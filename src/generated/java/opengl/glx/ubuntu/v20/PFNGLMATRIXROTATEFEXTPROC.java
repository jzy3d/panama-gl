// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMATRIXROTATEFEXTPROC {

    void apply(int x0, float x1, float x2, float x3, float x4);
    static MemoryAddress allocate(PFNGLMATRIXROTATEFEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXROTATEFEXTPROC.class, fi, constants$623.PFNGLMATRIXROTATEFEXTPROC$FUNC, "(IFFFF)V");
    }
    static MemoryAddress allocate(PFNGLMATRIXROTATEFEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXROTATEFEXTPROC.class, fi, constants$623.PFNGLMATRIXROTATEFEXTPROC$FUNC, "(IFFFF)V", scope);
    }
    static PFNGLMATRIXROTATEFEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2, float x3, float x4) -> {
            try {
                constants$623.PFNGLMATRIXROTATEFEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


