// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETINTERNALFORMATSAMPLEIVNVPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, jdk.incubator.foreign.MemoryAddress x5);
    static MemoryAddress allocate(PFNGLGETINTERNALFORMATSAMPLEIVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETINTERNALFORMATSAMPLEIVNVPROC.class, fi, constants$864.PFNGLGETINTERNALFORMATSAMPLEIVNVPROC$FUNC, "(IIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETINTERNALFORMATSAMPLEIVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETINTERNALFORMATSAMPLEIVNVPROC.class, fi, constants$864.PFNGLGETINTERNALFORMATSAMPLEIVNVPROC$FUNC, "(IIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETINTERNALFORMATSAMPLEIVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, jdk.incubator.foreign.MemoryAddress x5) -> {
            try {
                constants$864.PFNGLGETINTERNALFORMATSAMPLEIVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


