// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXSTREAM1SVATIPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLVERTEXSTREAM1SVATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM1SVATIPROC.class, fi, constants$586.PFNGLVERTEXSTREAM1SVATIPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXSTREAM1SVATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM1SVATIPROC.class, fi, constants$586.PFNGLVERTEXSTREAM1SVATIPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLVERTEXSTREAM1SVATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$586.PFNGLVERTEXSTREAM1SVATIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


