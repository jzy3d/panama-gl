// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXCOORD4BOESPROC {

    void apply(byte x0, byte x1, byte x2, byte x3);
    static MemoryAddress allocate(PFNGLTEXCOORD4BOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD4BOESPROC.class, fi, constants$496.PFNGLTEXCOORD4BOESPROC$FUNC, "(BBBB)V");
    }
    static MemoryAddress allocate(PFNGLTEXCOORD4BOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD4BOESPROC.class, fi, constants$496.PFNGLTEXCOORD4BOESPROC$FUNC, "(BBBB)V", scope);
    }
    static PFNGLTEXCOORD4BOESPROC ofAddress(MemoryAddress addr) {
        return (byte x0, byte x1, byte x2, byte x3) -> {
            try {
                constants$496.PFNGLTEXCOORD4BOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


