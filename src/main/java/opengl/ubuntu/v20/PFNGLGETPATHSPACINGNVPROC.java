// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETPATHSPACINGNVPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, int x4, float x5, float x6, int x7, jdk.incubator.foreign.MemoryAddress x8);
    static MemoryAddress allocate(PFNGLGETPATHSPACINGNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHSPACINGNVPROC.class, fi, constants$798.PFNGLGETPATHSPACINGNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;IFFILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETPATHSPACINGNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHSPACINGNVPROC.class, fi, constants$798.PFNGLGETPATHSPACINGNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;IFFILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETPATHSPACINGNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, int x4, float x5, float x6, int x7, jdk.incubator.foreign.MemoryAddress x8) -> {
            try {
                constants$798.PFNGLGETPATHSPACINGNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


