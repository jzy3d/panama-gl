// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXFREEMEMORYNVPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLXFREEMEMORYNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXFREEMEMORYNVPROC.class, fi, constants$1060.PFNGLXFREEMEMORYNVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLXFREEMEMORYNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXFREEMEMORYNVPROC.class, fi, constants$1060.PFNGLXFREEMEMORYNVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLXFREEMEMORYNVPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$1060.PFNGLXFREEMEMORYNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


