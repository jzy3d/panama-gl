// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCOVERAGEMODULATIONTABLENVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLCOVERAGEMODULATIONTABLENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOVERAGEMODULATIONTABLENVPROC.class, fi, constants$837.PFNGLCOVERAGEMODULATIONTABLENVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCOVERAGEMODULATIONTABLENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOVERAGEMODULATIONTABLENVPROC.class, fi, constants$837.PFNGLCOVERAGEMODULATIONTABLENVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCOVERAGEMODULATIONTABLENVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$837.PFNGLCOVERAGEMODULATIONTABLENVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


