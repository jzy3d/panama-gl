// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBINDBUFFERBASENVPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLBINDBUFFERBASENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDBUFFERBASENVPROC.class, fi, constants$830.PFNGLBINDBUFFERBASENVPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLBINDBUFFERBASENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDBUFFERBASENVPROC.class, fi, constants$830.PFNGLBINDBUFFERBASENVPROC$FUNC, "(III)V", scope);
    }
    static PFNGLBINDBUFFERBASENVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$830.PFNGLBINDBUFFERBASENVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


