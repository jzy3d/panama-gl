// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMAPBUFFERPROC {

    jdk.incubator.foreign.MemoryAddress apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLMAPBUFFERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMAPBUFFERPROC.class, fi, constants$197.PFNGLMAPBUFFERPROC$FUNC, "(II)Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(PFNGLMAPBUFFERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMAPBUFFERPROC.class, fi, constants$197.PFNGLMAPBUFFERPROC$FUNC, "(II)Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static PFNGLMAPBUFFERPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                return (jdk.incubator.foreign.MemoryAddress)constants$197.PFNGLMAPBUFFERPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


