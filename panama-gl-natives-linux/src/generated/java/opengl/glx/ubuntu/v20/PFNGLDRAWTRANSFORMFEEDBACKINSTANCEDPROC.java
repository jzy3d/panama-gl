// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC.class, fi, constants$337.PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC.class, fi, constants$337.PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC$FUNC, "(III)V", scope);
    }
    static PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$337.PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


