// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPAUSETRANSFORMFEEDBACKPROC {

    void apply();
    static MemoryAddress allocate(PFNGLPAUSETRANSFORMFEEDBACKPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPAUSETRANSFORMFEEDBACKPROC.class, fi, constants$217.PFNGLPAUSETRANSFORMFEEDBACKPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLPAUSETRANSFORMFEEDBACKPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPAUSETRANSFORMFEEDBACKPROC.class, fi, constants$217.PFNGLPAUSETRANSFORMFEEDBACKPROC$FUNC, "()V", scope);
    }
    static PFNGLPAUSETRANSFORMFEEDBACKPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$217.PFNGLPAUSETRANSFORMFEEDBACKPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


