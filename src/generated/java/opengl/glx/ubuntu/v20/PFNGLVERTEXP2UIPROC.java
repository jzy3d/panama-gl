// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXP2UIPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLVERTEXP2UIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXP2UIPROC.class, fi, constants$279.PFNGLVERTEXP2UIPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXP2UIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXP2UIPROC.class, fi, constants$279.PFNGLVERTEXP2UIPROC$FUNC, "(II)V", scope);
    }
    static PFNGLVERTEXP2UIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$279.PFNGLVERTEXP2UIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


