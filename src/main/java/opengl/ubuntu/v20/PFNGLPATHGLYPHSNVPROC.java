// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPATHGLYPHSNVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6, int x7, int x8, float x9);
    static MemoryAddress allocate(PFNGLPATHGLYPHSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPATHGLYPHSNVPROC.class, fi, constants$789.PFNGLPATHGLYPHSNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;IIF)V");
    }
    static MemoryAddress allocate(PFNGLPATHGLYPHSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPATHGLYPHSNVPROC.class, fi, constants$789.PFNGLPATHGLYPHSNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;IIF)V", scope);
    }
    static PFNGLPATHGLYPHSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6, int x7, int x8, float x9) -> {
            try {
                constants$789.PFNGLPATHGLYPHSNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


