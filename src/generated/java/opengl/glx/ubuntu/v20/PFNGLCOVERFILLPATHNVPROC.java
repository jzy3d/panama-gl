// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCOVERFILLPATHNVPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLCOVERFILLPATHNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOVERFILLPATHNVPROC.class, fi, constants$880.PFNGLCOVERFILLPATHNVPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLCOVERFILLPATHNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOVERFILLPATHNVPROC.class, fi, constants$880.PFNGLCOVERFILLPATHNVPROC$FUNC, "(II)V", scope);
    }
    static PFNGLCOVERFILLPATHNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$880.PFNGLCOVERFILLPATHNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


