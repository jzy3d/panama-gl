// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBLENDFUNCIARBPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLBLENDFUNCIARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBLENDFUNCIARBPROC.class, fi, constants$407.PFNGLBLENDFUNCIARBPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLBLENDFUNCIARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBLENDFUNCIARBPROC.class, fi, constants$407.PFNGLBLENDFUNCIARBPROC$FUNC, "(III)V", scope);
    }
    static PFNGLBLENDFUNCIARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$407.PFNGLBLENDFUNCIARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


