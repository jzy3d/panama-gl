// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLREADNPIXELSARBPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, jdk.incubator.foreign.MemoryAddress x7);
    static MemoryAddress allocate(PFNGLREADNPIXELSARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLREADNPIXELSARBPROC.class, fi, constants$350.PFNGLREADNPIXELSARBPROC$FUNC, "(IIIIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLREADNPIXELSARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLREADNPIXELSARBPROC.class, fi, constants$350.PFNGLREADNPIXELSARBPROC$FUNC, "(IIIIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLREADNPIXELSARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, jdk.incubator.foreign.MemoryAddress x7) -> {
            try {
                constants$350.PFNGLREADNPIXELSARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


