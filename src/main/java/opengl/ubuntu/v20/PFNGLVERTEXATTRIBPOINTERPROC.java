// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXATTRIBPOINTERPROC {

    void apply(int x0, int x1, int x2, byte x3, int x4, jdk.incubator.foreign.MemoryAddress x5);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBPOINTERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBPOINTERPROC.class, fi, constants$144.PFNGLVERTEXATTRIBPOINTERPROC$FUNC, "(IIIBILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBPOINTERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBPOINTERPROC.class, fi, constants$144.PFNGLVERTEXATTRIBPOINTERPROC$FUNC, "(IIIBILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLVERTEXATTRIBPOINTERPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, byte x3, int x4, jdk.incubator.foreign.MemoryAddress x5) -> {
            try {
                constants$144.PFNGLVERTEXATTRIBPOINTERPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


