// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3);
    static MemoryAddress allocate(PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC.class, fi, constants$830.PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC.class, fi, constants$830.PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3) -> {
            try {
                constants$830.PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


