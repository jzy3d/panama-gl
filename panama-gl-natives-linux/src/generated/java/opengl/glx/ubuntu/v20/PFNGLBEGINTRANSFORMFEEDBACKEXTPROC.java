// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBEGINTRANSFORMFEEDBACKEXTPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLBEGINTRANSFORMFEEDBACKEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBEGINTRANSFORMFEEDBACKEXTPROC.class, fi, constants$758.PFNGLBEGINTRANSFORMFEEDBACKEXTPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLBEGINTRANSFORMFEEDBACKEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBEGINTRANSFORMFEEDBACKEXTPROC.class, fi, constants$758.PFNGLBEGINTRANSFORMFEEDBACKEXTPROC$FUNC, "(I)V", scope);
    }
    static PFNGLBEGINTRANSFORMFEEDBACKEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$758.PFNGLBEGINTRANSFORMFEEDBACKEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


