// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLWINDOWPOS2IMESAPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLWINDOWPOS2IMESAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2IMESAPROC.class, fi, constants$713.PFNGLWINDOWPOS2IMESAPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWPOS2IMESAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2IMESAPROC.class, fi, constants$713.PFNGLWINDOWPOS2IMESAPROC$FUNC, "(II)V", scope);
    }
    static PFNGLWINDOWPOS2IMESAPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$713.PFNGLWINDOWPOS2IMESAPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

