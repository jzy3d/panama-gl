// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETUNIFORMINDICESPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLGETUNIFORMINDICESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMINDICESPROC.class, fi, constants$176.PFNGLGETUNIFORMINDICESPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETUNIFORMINDICESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMINDICESPROC.class, fi, constants$176.PFNGLGETUNIFORMINDICESPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETUNIFORMINDICESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$176.PFNGLGETUNIFORMINDICESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

