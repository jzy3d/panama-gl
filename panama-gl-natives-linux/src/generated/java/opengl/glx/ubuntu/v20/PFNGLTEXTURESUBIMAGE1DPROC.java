// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXTURESUBIMAGE1DPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6);
    static MemoryAddress allocate(PFNGLTEXTURESUBIMAGE1DPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESUBIMAGE1DPROC.class, fi, constants$373.PFNGLTEXTURESUBIMAGE1DPROC$FUNC, "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLTEXTURESUBIMAGE1DPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESUBIMAGE1DPROC.class, fi, constants$373.PFNGLTEXTURESUBIMAGE1DPROC$FUNC, "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLTEXTURESUBIMAGE1DPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6) -> {
            try {
                constants$373.PFNGLTEXTURESUBIMAGE1DPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


