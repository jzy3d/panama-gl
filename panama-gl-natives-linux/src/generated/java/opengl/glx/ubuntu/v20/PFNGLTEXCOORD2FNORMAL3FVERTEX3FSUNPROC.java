// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC {

    void apply(float x0, float x1, float x2, float x3, float x4, float x5, float x6, float x7);
    static MemoryAddress allocate(PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC.class, fi, constants$1006.PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC$FUNC, "(FFFFFFFF)V");
    }
    static MemoryAddress allocate(PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC.class, fi, constants$1006.PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC$FUNC, "(FFFFFFFF)V", scope);
    }
    static PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC ofAddress(MemoryAddress addr) {
        return (float x0, float x1, float x2, float x3, float x4, float x5, float x6, float x7) -> {
            try {
                constants$1006.PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


