// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLRESUMETRANSFORMFEEDBACKNVPROC {

    void apply();
    static MemoryAddress allocate(PFNGLRESUMETRANSFORMFEEDBACKNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLRESUMETRANSFORMFEEDBACKNVPROC.class, fi, constants$834.PFNGLRESUMETRANSFORMFEEDBACKNVPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLRESUMETRANSFORMFEEDBACKNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLRESUMETRANSFORMFEEDBACKNVPROC.class, fi, constants$834.PFNGLRESUMETRANSFORMFEEDBACKNVPROC$FUNC, "()V", scope);
    }
    static PFNGLRESUMETRANSFORMFEEDBACKNVPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$834.PFNGLRESUMETRANSFORMFEEDBACKNVPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


