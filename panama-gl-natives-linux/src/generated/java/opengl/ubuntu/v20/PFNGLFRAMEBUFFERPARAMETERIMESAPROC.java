// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFRAMEBUFFERPARAMETERIMESAPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLFRAMEBUFFERPARAMETERIMESAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERPARAMETERIMESAPROC.class, fi, constants$711.PFNGLFRAMEBUFFERPARAMETERIMESAPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLFRAMEBUFFERPARAMETERIMESAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERPARAMETERIMESAPROC.class, fi, constants$711.PFNGLFRAMEBUFFERPARAMETERIMESAPROC$FUNC, "(III)V", scope);
    }
    static PFNGLFRAMEBUFFERPARAMETERIMESAPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$711.PFNGLFRAMEBUFFERPARAMETERIMESAPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


