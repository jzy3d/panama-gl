// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXDESTROYWINDOWPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, long x1);
    static MemoryAddress allocate(PFNGLXDESTROYWINDOWPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXDESTROYWINDOWPROC.class, fi, constants$1023.PFNGLXDESTROYWINDOWPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)V");
    }
    static MemoryAddress allocate(PFNGLXDESTROYWINDOWPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXDESTROYWINDOWPROC.class, fi, constants$1023.PFNGLXDESTROYWINDOWPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)V", scope);
    }
    static PFNGLXDESTROYWINDOWPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1) -> {
            try {
                constants$1023.PFNGLXDESTROYWINDOWPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


