// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBLENDFUNCSEPARATEPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLBLENDFUNCSEPARATEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBLENDFUNCSEPARATEPROC.class, fi, constants$91.PFNGLBLENDFUNCSEPARATEPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLBLENDFUNCSEPARATEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBLENDFUNCSEPARATEPROC.class, fi, constants$91.PFNGLBLENDFUNCSEPARATEPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLBLENDFUNCSEPARATEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$91.PFNGLBLENDFUNCSEPARATEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


