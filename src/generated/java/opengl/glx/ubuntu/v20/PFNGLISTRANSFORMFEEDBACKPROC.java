// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLISTRANSFORMFEEDBACKPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLISTRANSFORMFEEDBACKPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISTRANSFORMFEEDBACKPROC.class, fi, constants$302.PFNGLISTRANSFORMFEEDBACKPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLISTRANSFORMFEEDBACKPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISTRANSFORMFEEDBACKPROC.class, fi, constants$302.PFNGLISTRANSFORMFEEDBACKPROC$FUNC, "(I)B", scope);
    }
    static PFNGLISTRANSFORMFEEDBACKPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$302.PFNGLISTRANSFORMFEEDBACKPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


