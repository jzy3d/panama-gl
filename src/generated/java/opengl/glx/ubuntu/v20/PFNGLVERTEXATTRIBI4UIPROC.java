// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXATTRIBI4UIPROC {

    void apply(int x0, int x1, int x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBI4UIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI4UIPROC.class, fi, constants$240.PFNGLVERTEXATTRIBI4UIPROC$FUNC, "(IIIII)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBI4UIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI4UIPROC.class, fi, constants$240.PFNGLVERTEXATTRIBI4UIPROC$FUNC, "(IIIII)V", scope);
    }
    static PFNGLVERTEXATTRIBI4UIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4) -> {
            try {
                constants$240.PFNGLVERTEXATTRIBI4UIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


