// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETPATHCOLORGENIVNVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETPATHCOLORGENIVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHCOLORGENIVNVPROC.class, fi, constants$891.PFNGLGETPATHCOLORGENIVNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETPATHCOLORGENIVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHCOLORGENIVNVPROC.class, fi, constants$891.PFNGLGETPATHCOLORGENIVNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETPATHCOLORGENIVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$891.PFNGLGETPATHCOLORGENIVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


