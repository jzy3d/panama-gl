// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLXGETSELECTEDEVENTPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, long x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLXGETSELECTEDEVENTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXGETSELECTEDEVENTPROC.class, fi, constants$1027.PFNGLXGETSELECTEDEVENTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLXGETSELECTEDEVENTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXGETSELECTEDEVENTPROC.class, fi, constants$1027.PFNGLXGETSELECTEDEVENTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLXGETSELECTEDEVENTPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$1027.PFNGLXGETSELECTEDEVENTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


