// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCOLORFRAGMENTOP1ATIPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6);
    static MemoryAddress allocate(PFNGLCOLORFRAGMENTOP1ATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOLORFRAGMENTOP1ATIPROC.class, fi, constants$491.PFNGLCOLORFRAGMENTOP1ATIPROC$FUNC, "(IIIIIII)V");
    }
    static MemoryAddress allocate(PFNGLCOLORFRAGMENTOP1ATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOLORFRAGMENTOP1ATIPROC.class, fi, constants$491.PFNGLCOLORFRAGMENTOP1ATIPROC$FUNC, "(IIIIIII)V", scope);
    }
    static PFNGLCOLORFRAGMENTOP1ATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6) -> {
            try {
                constants$491.PFNGLCOLORFRAGMENTOP1ATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


