// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, jdk.incubator.foreign.MemoryAddress x10);
    static MemoryAddress allocate(PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC.class, fi, constants$374.PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC$FUNC, "(IIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC.class, fi, constants$374.PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC$FUNC, "(IIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, jdk.incubator.foreign.MemoryAddress x10) -> {
            try {
                constants$374.PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


