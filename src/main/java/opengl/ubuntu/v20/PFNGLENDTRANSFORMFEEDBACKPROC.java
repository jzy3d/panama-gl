// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLENDTRANSFORMFEEDBACKPROC {

    void apply();
    static MemoryAddress allocate(PFNGLENDTRANSFORMFEEDBACKPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLENDTRANSFORMFEEDBACKPROC.class, fi, constants$148.PFNGLENDTRANSFORMFEEDBACKPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLENDTRANSFORMFEEDBACKPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLENDTRANSFORMFEEDBACKPROC.class, fi, constants$148.PFNGLENDTRANSFORMFEEDBACKPROC$FUNC, "()V", scope);
    }
    static PFNGLENDTRANSFORMFEEDBACKPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$148.PFNGLENDTRANSFORMFEEDBACKPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


