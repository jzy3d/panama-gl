// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXQUERYVIDEOCAPTUREDEVICENVPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, long x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLXQUERYVIDEOCAPTUREDEVICENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXQUERYVIDEOCAPTUREDEVICENVPROC.class, fi, constants$1043.PFNGLXQUERYVIDEOCAPTUREDEVICENVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLXQUERYVIDEOCAPTUREDEVICENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXQUERYVIDEOCAPTUREDEVICENVPROC.class, fi, constants$1043.PFNGLXQUERYVIDEOCAPTUREDEVICENVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLXQUERYVIDEOCAPTUREDEVICENVPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                return (int)constants$1043.PFNGLXQUERYVIDEOCAPTUREDEVICENVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


