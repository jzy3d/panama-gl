// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMINMAXEXTPROC {

    void apply(int x0, int x1, byte x2);
    static MemoryAddress allocate(PFNGLMINMAXEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMINMAXEXTPROC.class, fi, constants$638.PFNGLMINMAXEXTPROC$FUNC, "(IIB)V");
    }
    static MemoryAddress allocate(PFNGLMINMAXEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMINMAXEXTPROC.class, fi, constants$638.PFNGLMINMAXEXTPROC$FUNC, "(IIB)V", scope);
    }
    static PFNGLMINMAXEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, byte x2) -> {
            try {
                constants$638.PFNGLMINMAXEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


