// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLUPLOADGPUMASKNVXPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLUPLOADGPUMASKNVXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUPLOADGPUMASKNVXPROC.class, fi, constants$720.PFNGLUPLOADGPUMASKNVXPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLUPLOADGPUMASKNVXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUPLOADGPUMASKNVXPROC.class, fi, constants$720.PFNGLUPLOADGPUMASKNVXPROC$FUNC, "(I)V", scope);
    }
    static PFNGLUPLOADGPUMASKNVXPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$720.PFNGLUPLOADGPUMASKNVXPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

