// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCREATESAMPLERSPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLCREATESAMPLERSPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCREATESAMPLERSPROC.class, fi, constants$300.PFNGLCREATESAMPLERSPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCREATESAMPLERSPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCREATESAMPLERSPROC.class, fi, constants$300.PFNGLCREATESAMPLERSPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCREATESAMPLERSPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$300.PFNGLCREATESAMPLERSPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


