// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLACTIVETEXTUREARBPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLACTIVETEXTUREARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLACTIVETEXTUREARBPROC.class, fi, constants$80.PFNGLACTIVETEXTUREARBPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLACTIVETEXTUREARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLACTIVETEXTUREARBPROC.class, fi, constants$80.PFNGLACTIVETEXTUREARBPROC$FUNC, "(I)V", scope);
    }
    static PFNGLACTIVETEXTUREARBPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$80.PFNGLACTIVETEXTUREARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

