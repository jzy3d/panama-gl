// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPAUSETRANSFORMFEEDBACKNVPROC {

    void apply();
    static MemoryAddress allocate(PFNGLPAUSETRANSFORMFEEDBACKNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPAUSETRANSFORMFEEDBACKNVPROC.class, fi, constants$834.PFNGLPAUSETRANSFORMFEEDBACKNVPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLPAUSETRANSFORMFEEDBACKNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPAUSETRANSFORMFEEDBACKNVPROC.class, fi, constants$834.PFNGLPAUSETRANSFORMFEEDBACKNVPROC$FUNC, "()V", scope);
    }
    static PFNGLPAUSETRANSFORMFEEDBACKNVPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$834.PFNGLPAUSETRANSFORMFEEDBACKNVPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


