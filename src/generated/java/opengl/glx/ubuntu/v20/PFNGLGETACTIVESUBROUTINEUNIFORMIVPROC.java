// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC {

    void apply(int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC.class, fi, constants$298.PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC.class, fi, constants$298.PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$298.PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


