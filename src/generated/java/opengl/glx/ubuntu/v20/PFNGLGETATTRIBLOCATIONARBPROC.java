// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETATTRIBLOCATIONARBPROC {

    int apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGETATTRIBLOCATIONARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETATTRIBLOCATIONARBPROC.class, fi, constants$485.PFNGLGETATTRIBLOCATIONARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLGETATTRIBLOCATIONARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETATTRIBLOCATIONARBPROC.class, fi, constants$485.PFNGLGETATTRIBLOCATIONARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLGETATTRIBLOCATIONARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (int)constants$485.PFNGLGETATTRIBLOCATIONARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


