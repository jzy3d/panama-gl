// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSIGNALSEMAPHOREUI64NVXPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLSIGNALSEMAPHOREUI64NVXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSIGNALSEMAPHOREUI64NVXPROC.class, fi, constants$809.PFNGLSIGNALSEMAPHOREUI64NVXPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLSIGNALSEMAPHOREUI64NVXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSIGNALSEMAPHOREUI64NVXPROC.class, fi, constants$809.PFNGLSIGNALSEMAPHOREUI64NVXPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLSIGNALSEMAPHOREUI64NVXPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$809.PFNGLSIGNALSEMAPHOREUI64NVXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


