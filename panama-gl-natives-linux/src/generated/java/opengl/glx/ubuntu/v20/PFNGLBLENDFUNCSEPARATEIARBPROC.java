// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBLENDFUNCSEPARATEIARBPROC {

    void apply(int x0, int x1, int x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLBLENDFUNCSEPARATEIARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBLENDFUNCSEPARATEIARBPROC.class, fi, constants$407.PFNGLBLENDFUNCSEPARATEIARBPROC$FUNC, "(IIIII)V");
    }
    static MemoryAddress allocate(PFNGLBLENDFUNCSEPARATEIARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBLENDFUNCSEPARATEIARBPROC.class, fi, constants$407.PFNGLBLENDFUNCSEPARATEIARBPROC$FUNC, "(IIIII)V", scope);
    }
    static PFNGLBLENDFUNCSEPARATEIARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4) -> {
            try {
                constants$407.PFNGLBLENDFUNCSEPARATEIARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


