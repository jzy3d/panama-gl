// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXATTRIBP2UIVPROC {

    void apply(int x0, int x1, byte x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBP2UIVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBP2UIVPROC.class, fi, constants$192.PFNGLVERTEXATTRIBP2UIVPROC$FUNC, "(IIBLjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBP2UIVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBP2UIVPROC.class, fi, constants$192.PFNGLVERTEXATTRIBP2UIVPROC$FUNC, "(IIBLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLVERTEXATTRIBP2UIVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, byte x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$192.PFNGLVERTEXATTRIBP2UIVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


