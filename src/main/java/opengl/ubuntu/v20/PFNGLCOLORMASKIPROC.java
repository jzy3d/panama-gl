// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCOLORMASKIPROC {

    void apply(int x0, byte x1, byte x2, byte x3, byte x4);
    static MemoryAddress allocate(PFNGLCOLORMASKIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOLORMASKIPROC.class, fi, constants$146.PFNGLCOLORMASKIPROC$FUNC, "(IBBBB)V");
    }
    static MemoryAddress allocate(PFNGLCOLORMASKIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOLORMASKIPROC.class, fi, constants$146.PFNGLCOLORMASKIPROC$FUNC, "(IBBBB)V", scope);
    }
    static PFNGLCOLORMASKIPROC ofAddress(MemoryAddress addr) {
        return (int x0, byte x1, byte x2, byte x3, byte x4) -> {
            try {
                constants$146.PFNGLCOLORMASKIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


