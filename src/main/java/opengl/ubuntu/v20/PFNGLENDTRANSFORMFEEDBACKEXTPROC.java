// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLENDTRANSFORMFEEDBACKEXTPROC {

    void apply();
    static MemoryAddress allocate(PFNGLENDTRANSFORMFEEDBACKEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLENDTRANSFORMFEEDBACKEXTPROC.class, fi, constants$673.PFNGLENDTRANSFORMFEEDBACKEXTPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLENDTRANSFORMFEEDBACKEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLENDTRANSFORMFEEDBACKEXTPROC.class, fi, constants$673.PFNGLENDTRANSFORMFEEDBACKEXTPROC$FUNC, "()V", scope);
    }
    static PFNGLENDTRANSFORMFEEDBACKEXTPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$673.PFNGLENDTRANSFORMFEEDBACKEXTPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

