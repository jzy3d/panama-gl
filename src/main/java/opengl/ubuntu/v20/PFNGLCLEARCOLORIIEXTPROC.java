// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCLEARCOLORIIEXTPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLCLEARCOLORIIEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCLEARCOLORIIEXTPROC.class, fi, constants$669.PFNGLCLEARCOLORIIEXTPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLCLEARCOLORIIEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCLEARCOLORIIEXTPROC.class, fi, constants$669.PFNGLCLEARCOLORIIEXTPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLCLEARCOLORIIEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$669.PFNGLCLEARCOLORIIEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


