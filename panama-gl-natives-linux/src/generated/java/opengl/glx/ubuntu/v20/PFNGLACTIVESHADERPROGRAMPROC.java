// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLACTIVESHADERPROGRAMPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLACTIVESHADERPROGRAMPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLACTIVESHADERPROGRAMPROC.class, fi, constants$307.PFNGLACTIVESHADERPROGRAMPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLACTIVESHADERPROGRAMPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLACTIVESHADERPROGRAMPROC.class, fi, constants$307.PFNGLACTIVESHADERPROGRAMPROC$FUNC, "(II)V", scope);
    }
    static PFNGLACTIVESHADERPROGRAMPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$307.PFNGLACTIVESHADERPROGRAMPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


