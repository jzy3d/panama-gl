// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSTENCILFILLPATHNVPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLSTENCILFILLPATHNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILFILLPATHNVPROC.class, fi, constants$793.PFNGLSTENCILFILLPATHNVPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLSTENCILFILLPATHNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILFILLPATHNVPROC.class, fi, constants$793.PFNGLSTENCILFILLPATHNVPROC$FUNC, "(III)V", scope);
    }
    static PFNGLSTENCILFILLPATHNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$793.PFNGLSTENCILFILLPATHNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


