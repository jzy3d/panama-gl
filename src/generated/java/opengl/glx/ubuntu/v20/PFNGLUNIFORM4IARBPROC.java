// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLUNIFORM4IARBPROC {

    void apply(int x0, int x1, int x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLUNIFORM4IARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM4IARBPROC.class, fi, constants$449.PFNGLUNIFORM4IARBPROC$FUNC, "(IIIII)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM4IARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM4IARBPROC.class, fi, constants$449.PFNGLUNIFORM4IARBPROC$FUNC, "(IIIII)V", scope);
    }
    static PFNGLUNIFORM4IARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4) -> {
            try {
                constants$449.PFNGLUNIFORM4IARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


