// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXSUBIMAGE1DEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6);
    static MemoryAddress allocate(PFNGLTEXSUBIMAGE1DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXSUBIMAGE1DEXTPROC.class, fi, constants$666.PFNGLTEXSUBIMAGE1DEXTPROC$FUNC, "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLTEXSUBIMAGE1DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXSUBIMAGE1DEXTPROC.class, fi, constants$666.PFNGLTEXSUBIMAGE1DEXTPROC$FUNC, "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLTEXSUBIMAGE1DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6) -> {
            try {
                constants$666.PFNGLTEXSUBIMAGE1DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

