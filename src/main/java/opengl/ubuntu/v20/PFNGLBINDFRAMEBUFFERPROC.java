// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBINDFRAMEBUFFERPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLBINDFRAMEBUFFERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDFRAMEBUFFERPROC.class, fi, constants$168.PFNGLBINDFRAMEBUFFERPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLBINDFRAMEBUFFERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDFRAMEBUFFERPROC.class, fi, constants$168.PFNGLBINDFRAMEBUFFERPROC$FUNC, "(II)V", scope);
    }
    static PFNGLBINDFRAMEBUFFERPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$168.PFNGLBINDFRAMEBUFFERPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

