// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBINDBUFFERBASEEXTPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLBINDBUFFERBASEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDBUFFERBASEEXTPROC.class, fi, constants$674.PFNGLBINDBUFFERBASEEXTPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLBINDBUFFERBASEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDBUFFERBASEEXTPROC.class, fi, constants$674.PFNGLBINDBUFFERBASEEXTPROC$FUNC, "(III)V", scope);
    }
    static PFNGLBINDBUFFERBASEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$674.PFNGLBINDBUFFERBASEEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


