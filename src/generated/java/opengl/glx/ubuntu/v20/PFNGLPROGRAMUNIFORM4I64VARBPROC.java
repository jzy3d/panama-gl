// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPROGRAMUNIFORM4I64VARBPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM4I64VARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM4I64VARBPROC.class, fi, constants$425.PFNGLPROGRAMUNIFORM4I64VARBPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM4I64VARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM4I64VARBPROC.class, fi, constants$425.PFNGLPROGRAMUNIFORM4I64VARBPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPROGRAMUNIFORM4I64VARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$425.PFNGLPROGRAMUNIFORM4I64VARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


