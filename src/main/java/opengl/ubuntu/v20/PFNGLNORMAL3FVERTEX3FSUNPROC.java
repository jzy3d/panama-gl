// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLNORMAL3FVERTEX3FSUNPROC {

    void apply(float x0, float x1, float x2, float x3, float x4, float x5);
    static MemoryAddress allocate(PFNGLNORMAL3FVERTEX3FSUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNORMAL3FVERTEX3FSUNPROC.class, fi, constants$917.PFNGLNORMAL3FVERTEX3FSUNPROC$FUNC, "(FFFFFF)V");
    }
    static MemoryAddress allocate(PFNGLNORMAL3FVERTEX3FSUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNORMAL3FVERTEX3FSUNPROC.class, fi, constants$917.PFNGLNORMAL3FVERTEX3FSUNPROC$FUNC, "(FFFFFF)V", scope);
    }
    static PFNGLNORMAL3FVERTEX3FSUNPROC ofAddress(MemoryAddress addr) {
        return (float x0, float x1, float x2, float x3, float x4, float x5) -> {
            try {
                constants$917.PFNGLNORMAL3FVERTEX3FSUNPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

