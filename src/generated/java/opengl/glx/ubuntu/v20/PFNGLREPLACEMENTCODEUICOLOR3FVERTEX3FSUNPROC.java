// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FSUNPROC {

    void apply(int x0, float x1, float x2, float x3, float x4, float x5, float x6);
    static MemoryAddress allocate(PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FSUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FSUNPROC.class, fi, constants$1010.PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FSUNPROC$FUNC, "(IFFFFFF)V");
    }
    static MemoryAddress allocate(PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FSUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FSUNPROC.class, fi, constants$1010.PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FSUNPROC$FUNC, "(IFFFFFF)V", scope);
    }
    static PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FSUNPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2, float x3, float x4, float x5, float x6) -> {
            try {
                constants$1010.PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FSUNPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


