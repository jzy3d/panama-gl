// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGENTRANSFORMFEEDBACKSNVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGENTRANSFORMFEEDBACKSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENTRANSFORMFEEDBACKSNVPROC.class, fi, constants$918.PFNGLGENTRANSFORMFEEDBACKSNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGENTRANSFORMFEEDBACKSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENTRANSFORMFEEDBACKSNVPROC.class, fi, constants$918.PFNGLGENTRANSFORMFEEDBACKSNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGENTRANSFORMFEEDBACKSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$918.PFNGLGENTRANSFORMFEEDBACKSNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


