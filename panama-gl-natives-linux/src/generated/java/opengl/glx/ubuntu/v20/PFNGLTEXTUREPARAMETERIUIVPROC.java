// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXTUREPARAMETERIUIVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLTEXTUREPARAMETERIUIVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREPARAMETERIUIVPROC.class, fi, constants$377.PFNGLTEXTUREPARAMETERIUIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLTEXTUREPARAMETERIUIVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREPARAMETERIUIVPROC.class, fi, constants$377.PFNGLTEXTUREPARAMETERIUIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLTEXTUREPARAMETERIUIVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$377.PFNGLTEXTUREPARAMETERIUIVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


