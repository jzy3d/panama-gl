// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLALPHAFRAGMENTOP1ATIPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5);
    static MemoryAddress allocate(PFNGLALPHAFRAGMENTOP1ATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLALPHAFRAGMENTOP1ATIPROC.class, fi, constants$577.PFNGLALPHAFRAGMENTOP1ATIPROC$FUNC, "(IIIIII)V");
    }
    static MemoryAddress allocate(PFNGLALPHAFRAGMENTOP1ATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLALPHAFRAGMENTOP1ATIPROC.class, fi, constants$577.PFNGLALPHAFRAGMENTOP1ATIPROC$FUNC, "(IIIIII)V", scope);
    }
    static PFNGLALPHAFRAGMENTOP1ATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5) -> {
            try {
                constants$577.PFNGLALPHAFRAGMENTOP1ATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


