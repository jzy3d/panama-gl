// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXGETFBCONFIGATTRIBSGIXPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLXGETFBCONFIGATTRIBSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXGETFBCONFIGATTRIBSGIXPROC.class, fi, constants$1048.PFNGLXGETFBCONFIGATTRIBSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLXGETFBCONFIGATTRIBSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXGETFBCONFIGATTRIBSGIXPROC.class, fi, constants$1048.PFNGLXGETFBCONFIGATTRIBSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLXGETFBCONFIGATTRIBSGIXPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                return (int)constants$1048.PFNGLXGETFBCONFIGATTRIBSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


