// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOVERAGEMODULATIONNVPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLCOVERAGEMODULATIONNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOVERAGEMODULATIONNVPROC.class, fi, constants$837.PFNGLCOVERAGEMODULATIONNVPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLCOVERAGEMODULATIONNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOVERAGEMODULATIONNVPROC.class, fi, constants$837.PFNGLCOVERAGEMODULATIONNVPROC$FUNC, "(I)V", scope);
    }
    static PFNGLCOVERAGEMODULATIONNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$837.PFNGLCOVERAGEMODULATIONNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


