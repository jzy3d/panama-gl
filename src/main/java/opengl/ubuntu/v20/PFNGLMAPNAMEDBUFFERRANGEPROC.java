// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMAPNAMEDBUFFERRANGEPROC {

    jdk.incubator.foreign.MemoryAddress apply(int x0, long x1, long x2, int x3);
    static MemoryAddress allocate(PFNGLMAPNAMEDBUFFERRANGEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMAPNAMEDBUFFERRANGEPROC.class, fi, constants$275.PFNGLMAPNAMEDBUFFERRANGEPROC$FUNC, "(IJJI)Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(PFNGLMAPNAMEDBUFFERRANGEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMAPNAMEDBUFFERRANGEPROC.class, fi, constants$275.PFNGLMAPNAMEDBUFFERRANGEPROC$FUNC, "(IJJI)Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static PFNGLMAPNAMEDBUFFERRANGEPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, long x2, int x3) -> {
            try {
                return (jdk.incubator.foreign.MemoryAddress)constants$275.PFNGLMAPNAMEDBUFFERRANGEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

