// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXBLITCONTEXTFRAMEBUFFERAMDPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, int x10);
    static MemoryAddress allocate(PFNGLXBLITCONTEXTFRAMEBUFFERAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXBLITCONTEXTFRAMEBUFFERAMDPROC.class, fi, constants$1031.PFNGLXBLITCONTEXTFRAMEBUFFERAMDPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IIIIIIIIII)V");
    }
    static MemoryAddress allocate(PFNGLXBLITCONTEXTFRAMEBUFFERAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXBLITCONTEXTFRAMEBUFFERAMDPROC.class, fi, constants$1031.PFNGLXBLITCONTEXTFRAMEBUFFERAMDPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IIIIIIIIII)V", scope);
    }
    static PFNGLXBLITCONTEXTFRAMEBUFFERAMDPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, int x10) -> {
            try {
                constants$1031.PFNGLXBLITCONTEXTFRAMEBUFFERAMDPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

