// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDRAWTRANSFORMFEEDBACKPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLDRAWTRANSFORMFEEDBACKPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDRAWTRANSFORMFEEDBACKPROC.class, fi, constants$217.PFNGLDRAWTRANSFORMFEEDBACKPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLDRAWTRANSFORMFEEDBACKPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDRAWTRANSFORMFEEDBACKPROC.class, fi, constants$217.PFNGLDRAWTRANSFORMFEEDBACKPROC$FUNC, "(II)V", scope);
    }
    static PFNGLDRAWTRANSFORMFEEDBACKPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$217.PFNGLDRAWTRANSFORMFEEDBACKPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


