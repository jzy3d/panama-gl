// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCLEARDEPTHDNVPROC {

    void apply(double x0);
    static MemoryAddress allocate(PFNGLCLEARDEPTHDNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCLEARDEPTHDNVPROC.class, fi, constants$825.PFNGLCLEARDEPTHDNVPROC$FUNC, "(D)V");
    }
    static MemoryAddress allocate(PFNGLCLEARDEPTHDNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCLEARDEPTHDNVPROC.class, fi, constants$825.PFNGLCLEARDEPTHDNVPROC$FUNC, "(D)V", scope);
    }
    static PFNGLCLEARDEPTHDNVPROC ofAddress(MemoryAddress addr) {
        return (double x0) -> {
            try {
                constants$825.PFNGLCLEARDEPTHDNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


