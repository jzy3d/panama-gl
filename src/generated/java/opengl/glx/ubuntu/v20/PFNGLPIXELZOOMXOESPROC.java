// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPIXELZOOMXOESPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLPIXELZOOMXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPIXELZOOMXOESPROC.class, fi, constants$524.PFNGLPIXELZOOMXOESPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLPIXELZOOMXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPIXELZOOMXOESPROC.class, fi, constants$524.PFNGLPIXELZOOMXOESPROC$FUNC, "(II)V", scope);
    }
    static PFNGLPIXELZOOMXOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$524.PFNGLPIXELZOOMXOESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


