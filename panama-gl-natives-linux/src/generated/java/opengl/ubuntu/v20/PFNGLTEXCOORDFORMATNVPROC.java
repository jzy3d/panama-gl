// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXCOORDFORMATNVPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLTEXCOORDFORMATNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORDFORMATNVPROC.class, fi, constants$847.PFNGLTEXCOORDFORMATNVPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLTEXCOORDFORMATNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORDFORMATNVPROC.class, fi, constants$847.PFNGLTEXCOORDFORMATNVPROC$FUNC, "(III)V", scope);
    }
    static PFNGLTEXCOORDFORMATNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$847.PFNGLTEXCOORDFORMATNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

