// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCREATETRANSFORMFEEDBACKSPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLCREATETRANSFORMFEEDBACKSPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCREATETRANSFORMFEEDBACKSPROC.class, fi, constants$356.PFNGLCREATETRANSFORMFEEDBACKSPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCREATETRANSFORMFEEDBACKSPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCREATETRANSFORMFEEDBACKSPROC.class, fi, constants$356.PFNGLCREATETRANSFORMFEEDBACKSPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCREATETRANSFORMFEEDBACKSPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$356.PFNGLCREATETRANSFORMFEEDBACKSPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


