// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLENDTRANSFORMFEEDBACKNVPROC {

    void apply();
    static MemoryAddress allocate(PFNGLENDTRANSFORMFEEDBACKNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLENDTRANSFORMFEEDBACKNVPROC.class, fi, constants$914.PFNGLENDTRANSFORMFEEDBACKNVPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLENDTRANSFORMFEEDBACKNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLENDTRANSFORMFEEDBACKNVPROC.class, fi, constants$914.PFNGLENDTRANSFORMFEEDBACKNVPROC$FUNC, "()V", scope);
    }
    static PFNGLENDTRANSFORMFEEDBACKNVPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$914.PFNGLENDTRANSFORMFEEDBACKNVPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


