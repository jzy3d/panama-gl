// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMULTITEXBUFFEREXTPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLMULTITEXBUFFEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXBUFFEREXTPROC.class, fi, constants$581.PFNGLMULTITEXBUFFEREXTPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXBUFFEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXBUFFEREXTPROC.class, fi, constants$581.PFNGLMULTITEXBUFFEREXTPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLMULTITEXBUFFEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$581.PFNGLMULTITEXBUFFEREXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


