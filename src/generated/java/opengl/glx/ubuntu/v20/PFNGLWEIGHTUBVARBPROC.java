// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLWEIGHTUBVARBPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLWEIGHTUBVARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWEIGHTUBVARBPROC.class, fi, constants$465.PFNGLWEIGHTUBVARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLWEIGHTUBVARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWEIGHTUBVARBPROC.class, fi, constants$465.PFNGLWEIGHTUBVARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLWEIGHTUBVARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$465.PFNGLWEIGHTUBVARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


