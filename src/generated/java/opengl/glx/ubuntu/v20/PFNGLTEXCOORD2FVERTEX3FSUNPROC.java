// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTEXCOORD2FVERTEX3FSUNPROC {

    void apply(float x0, float x1, float x2, float x3, float x4);
    static MemoryAddress allocate(PFNGLTEXCOORD2FVERTEX3FSUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD2FVERTEX3FSUNPROC.class, fi, constants$1004.PFNGLTEXCOORD2FVERTEX3FSUNPROC$FUNC, "(FFFFF)V");
    }
    static MemoryAddress allocate(PFNGLTEXCOORD2FVERTEX3FSUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD2FVERTEX3FSUNPROC.class, fi, constants$1004.PFNGLTEXCOORD2FVERTEX3FSUNPROC$FUNC, "(FFFFF)V", scope);
    }
    static PFNGLTEXCOORD2FVERTEX3FSUNPROC ofAddress(MemoryAddress addr) {
        return (float x0, float x1, float x2, float x3, float x4) -> {
            try {
                constants$1004.PFNGLTEXCOORD2FVERTEX3FSUNPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


