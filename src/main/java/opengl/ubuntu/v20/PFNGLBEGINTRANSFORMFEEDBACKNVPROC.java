// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBEGINTRANSFORMFEEDBACKNVPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLBEGINTRANSFORMFEEDBACKNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBEGINTRANSFORMFEEDBACKNVPROC.class, fi, constants$828.PFNGLBEGINTRANSFORMFEEDBACKNVPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLBEGINTRANSFORMFEEDBACKNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBEGINTRANSFORMFEEDBACKNVPROC.class, fi, constants$828.PFNGLBEGINTRANSFORMFEEDBACKNVPROC$FUNC, "(I)V", scope);
    }
    static PFNGLBEGINTRANSFORMFEEDBACKNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$828.PFNGLBEGINTRANSFORMFEEDBACKNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


