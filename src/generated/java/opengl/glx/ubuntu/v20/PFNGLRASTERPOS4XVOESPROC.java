// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLRASTERPOS4XVOESPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLRASTERPOS4XVOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLRASTERPOS4XVOESPROC.class, fi, constants$527.PFNGLRASTERPOS4XVOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLRASTERPOS4XVOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLRASTERPOS4XVOESPROC.class, fi, constants$527.PFNGLRASTERPOS4XVOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLRASTERPOS4XVOESPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$527.PFNGLRASTERPOS4XVOESPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


