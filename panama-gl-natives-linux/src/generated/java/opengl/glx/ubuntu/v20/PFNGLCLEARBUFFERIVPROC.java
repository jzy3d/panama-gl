// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCLEARBUFFERIVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLCLEARBUFFERIVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCLEARBUFFERIVPROC.class, fi, constants$249.PFNGLCLEARBUFFERIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCLEARBUFFERIVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCLEARBUFFERIVPROC.class, fi, constants$249.PFNGLCLEARBUFFERIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCLEARBUFFERIVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$249.PFNGLCLEARBUFFERIVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

