// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXIMAGE2DMULTISAMPLECOVERAGENVPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, byte x6);
    static MemoryAddress allocate(PFNGLTEXIMAGE2DMULTISAMPLECOVERAGENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXIMAGE2DMULTISAMPLECOVERAGENVPROC.class, fi, constants$826.PFNGLTEXIMAGE2DMULTISAMPLECOVERAGENVPROC$FUNC, "(IIIIIIB)V");
    }
    static MemoryAddress allocate(PFNGLTEXIMAGE2DMULTISAMPLECOVERAGENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXIMAGE2DMULTISAMPLECOVERAGENVPROC.class, fi, constants$826.PFNGLTEXIMAGE2DMULTISAMPLECOVERAGENVPROC$FUNC, "(IIIIIIB)V", scope);
    }
    static PFNGLTEXIMAGE2DMULTISAMPLECOVERAGENVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, byte x6) -> {
            try {
                constants$826.PFNGLTEXIMAGE2DMULTISAMPLECOVERAGENVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


