// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCOPYTEXTURESUBIMAGE2DPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7);
    static MemoryAddress allocate(PFNGLCOPYTEXTURESUBIMAGE2DPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOPYTEXTURESUBIMAGE2DPROC.class, fi, constants$375.PFNGLCOPYTEXTURESUBIMAGE2DPROC$FUNC, "(IIIIIIII)V");
    }
    static MemoryAddress allocate(PFNGLCOPYTEXTURESUBIMAGE2DPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOPYTEXTURESUBIMAGE2DPROC.class, fi, constants$375.PFNGLCOPYTEXTURESUBIMAGE2DPROC$FUNC, "(IIIIIIII)V", scope);
    }
    static PFNGLCOPYTEXTURESUBIMAGE2DPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7) -> {
            try {
                constants$375.PFNGLCOPYTEXTURESUBIMAGE2DPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


