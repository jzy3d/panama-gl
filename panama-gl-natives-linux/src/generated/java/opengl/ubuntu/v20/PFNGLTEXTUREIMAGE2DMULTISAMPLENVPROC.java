// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, byte x6);
    static MemoryAddress allocate(PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC.class, fi, constants$827.PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC$FUNC, "(IIIIIIB)V");
    }
    static MemoryAddress allocate(PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC.class, fi, constants$827.PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC$FUNC, "(IIIIIIB)V", scope);
    }
    static PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, byte x6) -> {
            try {
                constants$827.PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


