// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBLENDCOLORXOESPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLBLENDCOLORXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBLENDCOLORXOESPROC.class, fi, constants$426.PFNGLBLENDCOLORXOESPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLBLENDCOLORXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBLENDCOLORXOESPROC.class, fi, constants$426.PFNGLBLENDCOLORXOESPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLBLENDCOLORXOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$426.PFNGLBLENDCOLORXOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

