// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOLOR4HVNVPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLCOLOR4HVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOLOR4HVNVPROC.class, fi, constants$853.PFNGLCOLOR4HVNVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCOLOR4HVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOLOR4HVNVPROC.class, fi, constants$853.PFNGLCOLOR4HVNVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCOLOR4HVNVPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$853.PFNGLCOLOR4HVNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

