// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLXQUERYCONTEXTINFOEXTPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLXQUERYCONTEXTINFOEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXQUERYCONTEXTINFOEXTPROC.class, fi, constants$1032.PFNGLXQUERYCONTEXTINFOEXTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLXQUERYCONTEXTINFOEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXQUERYCONTEXTINFOEXTPROC.class, fi, constants$1032.PFNGLXQUERYCONTEXTINFOEXTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLXQUERYCONTEXTINFOEXTPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                return (int)constants$1032.PFNGLXQUERYCONTEXTINFOEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


