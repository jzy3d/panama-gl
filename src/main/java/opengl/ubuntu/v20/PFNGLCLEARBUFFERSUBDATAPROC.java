// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCLEARBUFFERSUBDATAPROC {

    void apply(int x0, int x1, long x2, long x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6);
    static MemoryAddress allocate(PFNGLCLEARBUFFERSUBDATAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCLEARBUFFERSUBDATAPROC.class, fi, constants$253.PFNGLCLEARBUFFERSUBDATAPROC$FUNC, "(IIJJIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCLEARBUFFERSUBDATAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCLEARBUFFERSUBDATAPROC.class, fi, constants$253.PFNGLCLEARBUFFERSUBDATAPROC$FUNC, "(IIJJIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCLEARBUFFERSUBDATAPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, long x2, long x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6) -> {
            try {
                constants$253.PFNGLCLEARBUFFERSUBDATAPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

