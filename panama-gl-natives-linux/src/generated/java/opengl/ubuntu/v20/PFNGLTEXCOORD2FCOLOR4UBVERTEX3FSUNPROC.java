// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC {

    void apply(float x0, float x1, byte x2, byte x3, byte x4, byte x5, float x6, float x7, float x8);
    static MemoryAddress allocate(PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC.class, fi, constants$920.PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC$FUNC, "(FFBBBBFFF)V");
    }
    static MemoryAddress allocate(PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC.class, fi, constants$920.PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC$FUNC, "(FFBBBBFFF)V", scope);
    }
    static PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC ofAddress(MemoryAddress addr) {
        return (float x0, float x1, byte x2, byte x3, byte x4, byte x5, float x6, float x7, float x8) -> {
            try {
                constants$920.PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


