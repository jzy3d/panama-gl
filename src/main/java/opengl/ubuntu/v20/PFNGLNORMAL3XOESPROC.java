// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLNORMAL3XOESPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLNORMAL3XOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNORMAL3XOESPROC.class, fi, constants$421.PFNGLNORMAL3XOESPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLNORMAL3XOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNORMAL3XOESPROC.class, fi, constants$421.PFNGLNORMAL3XOESPROC$FUNC, "(III)V", scope);
    }
    static PFNGLNORMAL3XOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$421.PFNGLNORMAL3XOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


