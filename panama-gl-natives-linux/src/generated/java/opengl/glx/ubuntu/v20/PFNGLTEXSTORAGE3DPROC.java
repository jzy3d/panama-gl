// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXSTORAGE3DPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5);
    static MemoryAddress allocate(PFNGLTEXSTORAGE3DPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXSTORAGE3DPROC.class, fi, constants$337.PFNGLTEXSTORAGE3DPROC$FUNC, "(IIIIII)V");
    }
    static MemoryAddress allocate(PFNGLTEXSTORAGE3DPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXSTORAGE3DPROC.class, fi, constants$337.PFNGLTEXSTORAGE3DPROC$FUNC, "(IIIIII)V", scope);
    }
    static PFNGLTEXSTORAGE3DPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5) -> {
            try {
                constants$337.PFNGLTEXSTORAGE3DPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


