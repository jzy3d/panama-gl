// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMBINARYPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3);
    static MemoryAddress allocate(PFNGLPROGRAMBINARYPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMBINARYPROC.class, fi, constants$306.PFNGLPROGRAMBINARYPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMBINARYPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMBINARYPROC.class, fi, constants$306.PFNGLPROGRAMBINARYPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PFNGLPROGRAMBINARYPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3) -> {
            try {
                constants$306.PFNGLPROGRAMBINARYPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


