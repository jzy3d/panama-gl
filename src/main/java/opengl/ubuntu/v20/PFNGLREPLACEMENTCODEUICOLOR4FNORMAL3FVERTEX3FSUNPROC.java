// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FSUNPROC {

    void apply(int x0, float x1, float x2, float x3, float x4, float x5, float x6, float x7, float x8, float x9, float x10);
    static MemoryAddress allocate(PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FSUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FSUNPROC.class, fi, constants$926.PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FSUNPROC$FUNC, "(IFFFFFFFFFF)V");
    }
    static MemoryAddress allocate(PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FSUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FSUNPROC.class, fi, constants$926.PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FSUNPROC$FUNC, "(IFFFFFFFFFF)V", scope);
    }
    static PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FSUNPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2, float x3, float x4, float x5, float x6, float x7, float x8, float x9, float x10) -> {
            try {
                constants$926.PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FSUNPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


