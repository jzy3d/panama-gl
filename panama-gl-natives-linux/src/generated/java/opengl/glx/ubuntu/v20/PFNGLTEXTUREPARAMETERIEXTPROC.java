// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXTUREPARAMETERIEXTPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLTEXTUREPARAMETERIEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREPARAMETERIEXTPROC.class, fi, constants$627.PFNGLTEXTUREPARAMETERIEXTPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLTEXTUREPARAMETERIEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREPARAMETERIEXTPROC.class, fi, constants$627.PFNGLTEXTUREPARAMETERIEXTPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLTEXTUREPARAMETERIEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$627.PFNGLTEXTUREPARAMETERIEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


