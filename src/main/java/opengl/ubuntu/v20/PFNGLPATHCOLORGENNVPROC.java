// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPATHCOLORGENNVPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLPATHCOLORGENNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPATHCOLORGENNVPROC.class, fi, constants$805.PFNGLPATHCOLORGENNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPATHCOLORGENNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPATHCOLORGENNVPROC.class, fi, constants$805.PFNGLPATHCOLORGENNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPATHCOLORGENNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$805.PFNGLPATHCOLORGENNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


