// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLFRAMEBUFFERREADBUFFEREXTPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLFRAMEBUFFERREADBUFFEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERREADBUFFEREXTPROC.class, fi, constants$599.PFNGLFRAMEBUFFERREADBUFFEREXTPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLFRAMEBUFFERREADBUFFEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERREADBUFFEREXTPROC.class, fi, constants$599.PFNGLFRAMEBUFFERREADBUFFEREXTPROC$FUNC, "(II)V", scope);
    }
    static PFNGLFRAMEBUFFERREADBUFFEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$599.PFNGLFRAMEBUFFERREADBUFFEREXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


