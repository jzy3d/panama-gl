// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSTENCILFUNCSEPARATEATIPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLSTENCILFUNCSEPARATEATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILFUNCSEPARATEATIPROC.class, fi, constants$495.PFNGLSTENCILFUNCSEPARATEATIPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLSTENCILFUNCSEPARATEATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILFUNCSEPARATEATIPROC.class, fi, constants$495.PFNGLSTENCILFUNCSEPARATEATIPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLSTENCILFUNCSEPARATEATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$495.PFNGLSTENCILFUNCSEPARATEATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


