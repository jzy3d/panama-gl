// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLNEWOBJECTBUFFERATIPROC {

    int apply(int x0, jdk.incubator.foreign.MemoryAddress x1, int x2);
    static MemoryAddress allocate(PFNGLNEWOBJECTBUFFERATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNEWOBJECTBUFFERATIPROC.class, fi, constants$581.PFNGLNEWOBJECTBUFFERATIPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;I)I");
    }
    static MemoryAddress allocate(PFNGLNEWOBJECTBUFFERATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNEWOBJECTBUFFERATIPROC.class, fi, constants$581.PFNGLNEWOBJECTBUFFERATIPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;I)I", scope);
    }
    static PFNGLNEWOBJECTBUFFERATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1, int x2) -> {
            try {
                return (int)constants$581.PFNGLNEWOBJECTBUFFERATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


