// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLRESUMETRANSFORMFEEDBACKPROC {

    void apply();
    static MemoryAddress allocate(PFNGLRESUMETRANSFORMFEEDBACKPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLRESUMETRANSFORMFEEDBACKPROC.class, fi, constants$217.PFNGLRESUMETRANSFORMFEEDBACKPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLRESUMETRANSFORMFEEDBACKPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLRESUMETRANSFORMFEEDBACKPROC.class, fi, constants$217.PFNGLRESUMETRANSFORMFEEDBACKPROC$FUNC, "()V", scope);
    }
    static PFNGLRESUMETRANSFORMFEEDBACKPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$217.PFNGLRESUMETRANSFORMFEEDBACKPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


