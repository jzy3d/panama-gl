// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGENPROGRAMSARBPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGENPROGRAMSARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENPROGRAMSARBPROC.class, fi, constants$324.PFNGLGENPROGRAMSARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGENPROGRAMSARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENPROGRAMSARBPROC.class, fi, constants$324.PFNGLGENPROGRAMSARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGENPROGRAMSARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$324.PFNGLGENPROGRAMSARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

