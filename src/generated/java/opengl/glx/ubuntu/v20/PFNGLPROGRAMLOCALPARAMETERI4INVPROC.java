// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPROGRAMLOCALPARAMETERI4INVPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5);
    static MemoryAddress allocate(PFNGLPROGRAMLOCALPARAMETERI4INVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMLOCALPARAMETERI4INVPROC.class, fi, constants$843.PFNGLPROGRAMLOCALPARAMETERI4INVPROC$FUNC, "(IIIIII)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMLOCALPARAMETERI4INVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMLOCALPARAMETERI4INVPROC.class, fi, constants$843.PFNGLPROGRAMLOCALPARAMETERI4INVPROC$FUNC, "(IIIIII)V", scope);
    }
    static PFNGLPROGRAMLOCALPARAMETERI4INVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5) -> {
            try {
                constants$843.PFNGLPROGRAMLOCALPARAMETERI4INVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


