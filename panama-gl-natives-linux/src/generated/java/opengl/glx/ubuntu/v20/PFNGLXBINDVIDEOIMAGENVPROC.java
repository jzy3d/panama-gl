// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXBINDVIDEOIMAGENVPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, long x2, int x3);
    static MemoryAddress allocate(PFNGLXBINDVIDEOIMAGENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXBINDVIDEOIMAGENVPROC.class, fi, constants$1044.PFNGLXBINDVIDEOIMAGENVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IJI)I");
    }
    static MemoryAddress allocate(PFNGLXBINDVIDEOIMAGENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXBINDVIDEOIMAGENVPROC.class, fi, constants$1044.PFNGLXBINDVIDEOIMAGENVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IJI)I", scope);
    }
    static PFNGLXBINDVIDEOIMAGENVPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, long x2, int x3) -> {
            try {
                return (int)constants$1044.PFNGLXBINDVIDEOIMAGENVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


