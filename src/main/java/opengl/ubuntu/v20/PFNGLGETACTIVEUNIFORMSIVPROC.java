// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETACTIVEUNIFORMSIVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLGETACTIVEUNIFORMSIVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETACTIVEUNIFORMSIVPROC.class, fi, constants$176.PFNGLGETACTIVEUNIFORMSIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETACTIVEUNIFORMSIVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETACTIVEUNIFORMSIVPROC.class, fi, constants$176.PFNGLGETACTIVEUNIFORMSIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETACTIVEUNIFORMSIVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$176.PFNGLGETACTIVEUNIFORMSIVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


