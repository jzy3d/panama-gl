// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDRAWTRANSFORMFEEDBACKNVPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLDRAWTRANSFORMFEEDBACKNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDRAWTRANSFORMFEEDBACKNVPROC.class, fi, constants$834.PFNGLDRAWTRANSFORMFEEDBACKNVPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLDRAWTRANSFORMFEEDBACKNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDRAWTRANSFORMFEEDBACKNVPROC.class, fi, constants$834.PFNGLDRAWTRANSFORMFEEDBACKNVPROC$FUNC, "(II)V", scope);
    }
    static PFNGLDRAWTRANSFORMFEEDBACKNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$834.PFNGLDRAWTRANSFORMFEEDBACKNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


