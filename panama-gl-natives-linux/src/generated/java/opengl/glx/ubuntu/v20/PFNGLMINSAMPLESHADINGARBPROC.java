// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMINSAMPLESHADINGARBPROC {

    void apply(float x0);
    static MemoryAddress allocate(PFNGLMINSAMPLESHADINGARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMINSAMPLESHADINGARBPROC.class, fi, constants$442.PFNGLMINSAMPLESHADINGARBPROC$FUNC, "(F)V");
    }
    static MemoryAddress allocate(PFNGLMINSAMPLESHADINGARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMINSAMPLESHADINGARBPROC.class, fi, constants$442.PFNGLMINSAMPLESHADINGARBPROC$FUNC, "(F)V", scope);
    }
    static PFNGLMINSAMPLESHADINGARBPROC ofAddress(MemoryAddress addr) {
        return (float x0) -> {
            try {
                constants$442.PFNGLMINSAMPLESHADINGARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

