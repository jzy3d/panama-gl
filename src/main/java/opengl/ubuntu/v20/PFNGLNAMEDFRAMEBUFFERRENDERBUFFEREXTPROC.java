// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC.class, fi, constants$597.PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC.class, fi, constants$597.PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$597.PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


