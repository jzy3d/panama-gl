// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSAMPLECOVERAGEPROC {

    void apply(float x0, byte x1);
    static MemoryAddress allocate(PFNGLSAMPLECOVERAGEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSAMPLECOVERAGEPROC.class, fi, constants$157.PFNGLSAMPLECOVERAGEPROC$FUNC, "(FB)V");
    }
    static MemoryAddress allocate(PFNGLSAMPLECOVERAGEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSAMPLECOVERAGEPROC.class, fi, constants$157.PFNGLSAMPLECOVERAGEPROC$FUNC, "(FB)V", scope);
    }
    static PFNGLSAMPLECOVERAGEPROC ofAddress(MemoryAddress addr) {
        return (float x0, byte x1) -> {
            try {
                constants$157.PFNGLSAMPLECOVERAGEPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


