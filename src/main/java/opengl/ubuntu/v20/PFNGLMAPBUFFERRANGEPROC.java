// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMAPBUFFERRANGEPROC {

    jdk.incubator.foreign.MemoryAddress apply(int x0, long x1, long x2, int x3);
    static MemoryAddress allocate(PFNGLMAPBUFFERRANGEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMAPBUFFERRANGEPROC.class, fi, constants$172.PFNGLMAPBUFFERRANGEPROC$FUNC, "(IJJI)Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(PFNGLMAPBUFFERRANGEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMAPBUFFERRANGEPROC.class, fi, constants$172.PFNGLMAPBUFFERRANGEPROC$FUNC, "(IJJI)Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static PFNGLMAPBUFFERRANGEPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, long x2, int x3) -> {
            try {
                return (jdk.incubator.foreign.MemoryAddress)constants$172.PFNGLMAPBUFFERRANGEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


