// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLFRAGMENTLIGHTMODELIVSGIXPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLFRAGMENTLIGHTMODELIVSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTLIGHTMODELIVSGIXPROC.class, fi, constants$895.PFNGLFRAGMENTLIGHTMODELIVSGIXPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLFRAGMENTLIGHTMODELIVSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTLIGHTMODELIVSGIXPROC.class, fi, constants$895.PFNGLFRAGMENTLIGHTMODELIVSGIXPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLFRAGMENTLIGHTMODELIVSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$895.PFNGLFRAGMENTLIGHTMODELIVSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


