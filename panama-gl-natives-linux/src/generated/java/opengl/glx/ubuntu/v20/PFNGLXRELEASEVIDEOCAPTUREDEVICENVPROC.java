// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXRELEASEVIDEOCAPTUREDEVICENVPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, long x1);
    static MemoryAddress allocate(PFNGLXRELEASEVIDEOCAPTUREDEVICENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXRELEASEVIDEOCAPTUREDEVICENVPROC.class, fi, constants$1043.PFNGLXRELEASEVIDEOCAPTUREDEVICENVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)V");
    }
    static MemoryAddress allocate(PFNGLXRELEASEVIDEOCAPTUREDEVICENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXRELEASEVIDEOCAPTUREDEVICENVPROC.class, fi, constants$1043.PFNGLXRELEASEVIDEOCAPTUREDEVICENVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)V", scope);
    }
    static PFNGLXRELEASEVIDEOCAPTUREDEVICENVPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1) -> {
            try {
                constants$1043.PFNGLXRELEASEVIDEOCAPTUREDEVICENVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


