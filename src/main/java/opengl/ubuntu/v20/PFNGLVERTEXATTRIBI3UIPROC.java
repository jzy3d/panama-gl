// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXATTRIBI3UIPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBI3UIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI3UIPROC.class, fi, constants$154.PFNGLVERTEXATTRIBI3UIPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBI3UIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI3UIPROC.class, fi, constants$154.PFNGLVERTEXATTRIBI3UIPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLVERTEXATTRIBI3UIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$154.PFNGLVERTEXATTRIBI3UIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


