// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBINDFRAMEBUFFEREXTPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLBINDFRAMEBUFFEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDFRAMEBUFFEREXTPROC.class, fi, constants$627.PFNGLBINDFRAMEBUFFEREXTPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLBINDFRAMEBUFFEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDFRAMEBUFFEREXTPROC.class, fi, constants$627.PFNGLBINDFRAMEBUFFEREXTPROC$FUNC, "(II)V", scope);
    }
    static PFNGLBINDFRAMEBUFFEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$627.PFNGLBINDFRAMEBUFFEREXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

