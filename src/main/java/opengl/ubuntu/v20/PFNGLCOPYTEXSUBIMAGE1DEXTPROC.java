// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCOPYTEXSUBIMAGE1DEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5);
    static MemoryAddress allocate(PFNGLCOPYTEXSUBIMAGE1DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOPYTEXSUBIMAGE1DEXTPROC.class, fi, constants$532.PFNGLCOPYTEXSUBIMAGE1DEXTPROC$FUNC, "(IIIIII)V");
    }
    static MemoryAddress allocate(PFNGLCOPYTEXSUBIMAGE1DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOPYTEXSUBIMAGE1DEXTPROC.class, fi, constants$532.PFNGLCOPYTEXSUBIMAGE1DEXTPROC$FUNC, "(IIIIII)V", scope);
    }
    static PFNGLCOPYTEXSUBIMAGE1DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5) -> {
            try {
                constants$532.PFNGLCOPYTEXSUBIMAGE1DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


