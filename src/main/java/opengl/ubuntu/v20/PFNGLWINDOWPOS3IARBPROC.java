// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLWINDOWPOS3IARBPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLWINDOWPOS3IARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3IARBPROC.class, fi, constants$404.PFNGLWINDOWPOS3IARBPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWPOS3IARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3IARBPROC.class, fi, constants$404.PFNGLWINDOWPOS3IARBPROC$FUNC, "(III)V", scope);
    }
    static PFNGLWINDOWPOS3IARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$404.PFNGLWINDOWPOS3IARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


