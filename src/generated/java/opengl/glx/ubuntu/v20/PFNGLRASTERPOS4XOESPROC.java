// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLRASTERPOS4XOESPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLRASTERPOS4XOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLRASTERPOS4XOESPROC.class, fi, constants$526.PFNGLRASTERPOS4XOESPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLRASTERPOS4XOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLRASTERPOS4XOESPROC.class, fi, constants$526.PFNGLRASTERPOS4XOESPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLRASTERPOS4XOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$526.PFNGLRASTERPOS4XOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


