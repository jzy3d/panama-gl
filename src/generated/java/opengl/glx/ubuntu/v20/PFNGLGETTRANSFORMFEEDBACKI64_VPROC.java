// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETTRANSFORMFEEDBACKI64_VPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLGETTRANSFORMFEEDBACKI64_VPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETTRANSFORMFEEDBACKI64_VPROC.class, fi, constants$357.PFNGLGETTRANSFORMFEEDBACKI64_VPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETTRANSFORMFEEDBACKI64_VPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETTRANSFORMFEEDBACKI64_VPROC.class, fi, constants$357.PFNGLGETTRANSFORMFEEDBACKI64_VPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETTRANSFORMFEEDBACKI64_VPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$357.PFNGLGETTRANSFORMFEEDBACKI64_VPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


