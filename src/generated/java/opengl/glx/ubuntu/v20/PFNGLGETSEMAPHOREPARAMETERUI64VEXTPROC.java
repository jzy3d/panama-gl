// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC.class, fi, constants$747.PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC.class, fi, constants$747.PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$747.PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


