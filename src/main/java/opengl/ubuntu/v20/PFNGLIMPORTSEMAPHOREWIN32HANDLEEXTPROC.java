// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLIMPORTSEMAPHOREWIN32HANDLEEXTPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLIMPORTSEMAPHOREWIN32HANDLEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLIMPORTSEMAPHOREWIN32HANDLEEXTPROC.class, fi, constants$663.PFNGLIMPORTSEMAPHOREWIN32HANDLEEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLIMPORTSEMAPHOREWIN32HANDLEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLIMPORTSEMAPHOREWIN32HANDLEEXTPROC.class, fi, constants$663.PFNGLIMPORTSEMAPHOREWIN32HANDLEEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLIMPORTSEMAPHOREWIN32HANDLEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$663.PFNGLIMPORTSEMAPHOREWIN32HANDLEEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


