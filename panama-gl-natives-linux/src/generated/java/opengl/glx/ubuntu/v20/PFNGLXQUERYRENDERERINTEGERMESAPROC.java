// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXQUERYRENDERERINTEGERMESAPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLXQUERYRENDERERINTEGERMESAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXQUERYRENDERERINTEGERMESAPROC.class, fi, constants$1036.PFNGLXQUERYRENDERERINTEGERMESAPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLXQUERYRENDERERINTEGERMESAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXQUERYRENDERERINTEGERMESAPROC.class, fi, constants$1036.PFNGLXQUERYRENDERERINTEGERMESAPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLXQUERYRENDERERINTEGERMESAPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                return (int)constants$1036.PFNGLXQUERYRENDERERINTEGERMESAPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

