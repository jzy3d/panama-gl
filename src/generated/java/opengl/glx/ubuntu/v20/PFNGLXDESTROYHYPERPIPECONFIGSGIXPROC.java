// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLXDESTROYHYPERPIPECONFIGSGIXPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
    static MemoryAddress allocate(PFNGLXDESTROYHYPERPIPECONFIGSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXDESTROYHYPERPIPECONFIGSGIXPROC.class, fi, constants$1051.PFNGLXDESTROYHYPERPIPECONFIGSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
    }
    static MemoryAddress allocate(PFNGLXDESTROYHYPERPIPECONFIGSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXDESTROYHYPERPIPECONFIGSGIXPROC.class, fi, constants$1051.PFNGLXDESTROYHYPERPIPECONFIGSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
    }
    static PFNGLXDESTROYHYPERPIPECONFIGSGIXPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
            try {
                return (int)constants$1051.PFNGLXDESTROYHYPERPIPECONFIGSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


