// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDELETETEXTURESEXTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLDELETETEXTURESEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETETEXTURESEXTPROC.class, fi, constants$671.PFNGLDELETETEXTURESEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDELETETEXTURESEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETETEXTURESEXTPROC.class, fi, constants$671.PFNGLDELETETEXTURESEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDELETETEXTURESEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$671.PFNGLDELETETEXTURESEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


