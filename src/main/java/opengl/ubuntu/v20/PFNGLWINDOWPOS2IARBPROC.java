// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLWINDOWPOS2IARBPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLWINDOWPOS2IARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2IARBPROC.class, fi, constants$401.PFNGLWINDOWPOS2IARBPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWPOS2IARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2IARBPROC.class, fi, constants$401.PFNGLWINDOWPOS2IARBPROC$FUNC, "(II)V", scope);
    }
    static PFNGLWINDOWPOS2IARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$401.PFNGLWINDOWPOS2IARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


