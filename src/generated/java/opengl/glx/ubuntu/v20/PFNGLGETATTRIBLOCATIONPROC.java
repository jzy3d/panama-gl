// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETATTRIBLOCATIONPROC {

    int apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGETATTRIBLOCATIONPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETATTRIBLOCATIONPROC.class, fi, constants$204.PFNGLGETATTRIBLOCATIONPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLGETATTRIBLOCATIONPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETATTRIBLOCATIONPROC.class, fi, constants$204.PFNGLGETATTRIBLOCATIONPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLGETATTRIBLOCATIONPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (int)constants$204.PFNGLGETATTRIBLOCATIONPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


