// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLALPHAFRAGMENTOP3ATIPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, int x10, int x11);
    static MemoryAddress allocate(PFNGLALPHAFRAGMENTOP3ATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLALPHAFRAGMENTOP3ATIPROC.class, fi, constants$493.PFNGLALPHAFRAGMENTOP3ATIPROC$FUNC, "(IIIIIIIIIIII)V");
    }
    static MemoryAddress allocate(PFNGLALPHAFRAGMENTOP3ATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLALPHAFRAGMENTOP3ATIPROC.class, fi, constants$493.PFNGLALPHAFRAGMENTOP3ATIPROC$FUNC, "(IIIIIIIIIIII)V", scope);
    }
    static PFNGLALPHAFRAGMENTOP3ATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, int x10, int x11) -> {
            try {
                constants$493.PFNGLALPHAFRAGMENTOP3ATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


