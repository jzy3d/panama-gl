// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBINDBUFFEROFFSETEXTPROC {

    void apply(int x0, int x1, int x2, long x3);
    static MemoryAddress allocate(PFNGLBINDBUFFEROFFSETEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDBUFFEROFFSETEXTPROC.class, fi, constants$674.PFNGLBINDBUFFEROFFSETEXTPROC$FUNC, "(IIIJ)V");
    }
    static MemoryAddress allocate(PFNGLBINDBUFFEROFFSETEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDBUFFEROFFSETEXTPROC.class, fi, constants$674.PFNGLBINDBUFFEROFFSETEXTPROC$FUNC, "(IIIJ)V", scope);
    }
    static PFNGLBINDBUFFEROFFSETEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, long x3) -> {
            try {
                constants$674.PFNGLBINDBUFFEROFFSETEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


