// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLRESIZEBUFFERSMESAPROC {

    void apply();
    static MemoryAddress allocate(PFNGLRESIZEBUFFERSMESAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLRESIZEBUFFERSMESAPROC.class, fi, constants$797.PFNGLRESIZEBUFFERSMESAPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLRESIZEBUFFERSMESAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLRESIZEBUFFERSMESAPROC.class, fi, constants$797.PFNGLRESIZEBUFFERSMESAPROC$FUNC, "()V", scope);
    }
    static PFNGLRESIZEBUFFERSMESAPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$797.PFNGLRESIZEBUFFERSMESAPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


