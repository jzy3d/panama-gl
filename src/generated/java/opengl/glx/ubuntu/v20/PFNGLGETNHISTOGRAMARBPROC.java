// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETNHISTOGRAMARBPROC {

    void apply(int x0, byte x1, int x2, int x3, int x4, jdk.incubator.foreign.MemoryAddress x5);
    static MemoryAddress allocate(PFNGLGETNHISTOGRAMARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETNHISTOGRAMARBPROC.class, fi, constants$441.PFNGLGETNHISTOGRAMARBPROC$FUNC, "(IBIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETNHISTOGRAMARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETNHISTOGRAMARBPROC.class, fi, constants$441.PFNGLGETNHISTOGRAMARBPROC$FUNC, "(IBIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETNHISTOGRAMARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, byte x1, int x2, int x3, int x4, jdk.incubator.foreign.MemoryAddress x5) -> {
            try {
                constants$441.PFNGLGETNHISTOGRAMARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


