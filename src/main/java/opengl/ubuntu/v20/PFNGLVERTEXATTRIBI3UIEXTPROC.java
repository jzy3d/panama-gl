// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXATTRIBI3UIEXTPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBI3UIEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI3UIEXTPROC.class, fi, constants$873.PFNGLVERTEXATTRIBI3UIEXTPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBI3UIEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI3UIEXTPROC.class, fi, constants$873.PFNGLVERTEXATTRIBI3UIEXTPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLVERTEXATTRIBI3UIEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$873.PFNGLVERTEXATTRIBI3UIEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


