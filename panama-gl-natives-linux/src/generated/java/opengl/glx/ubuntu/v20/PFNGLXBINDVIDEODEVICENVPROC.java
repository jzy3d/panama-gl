// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXBINDVIDEODEVICENVPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLXBINDVIDEODEVICENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXBINDVIDEODEVICENVPROC.class, fi, constants$1039.PFNGLXBINDVIDEODEVICENVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLXBINDVIDEODEVICENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXBINDVIDEODEVICENVPROC.class, fi, constants$1039.PFNGLXBINDVIDEODEVICENVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLXBINDVIDEODEVICENVPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                return (int)constants$1040.PFNGLXBINDVIDEODEVICENVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


