// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETFRAGMENTLIGHTFVSGIXPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETFRAGMENTLIGHTFVSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETFRAGMENTLIGHTFVSGIXPROC.class, fi, constants$897.PFNGLGETFRAGMENTLIGHTFVSGIXPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETFRAGMENTLIGHTFVSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETFRAGMENTLIGHTFVSGIXPROC.class, fi, constants$897.PFNGLGETFRAGMENTLIGHTFVSGIXPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETFRAGMENTLIGHTFVSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$897.PFNGLGETFRAGMENTLIGHTFVSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


