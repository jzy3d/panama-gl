// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCURRENTPALETTEMATRIXARBPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLCURRENTPALETTEMATRIXARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCURRENTPALETTEMATRIXARBPROC.class, fi, constants$344.PFNGLCURRENTPALETTEMATRIXARBPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLCURRENTPALETTEMATRIXARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCURRENTPALETTEMATRIXARBPROC.class, fi, constants$344.PFNGLCURRENTPALETTEMATRIXARBPROC$FUNC, "(I)V", scope);
    }
    static PFNGLCURRENTPALETTEMATRIXARBPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$344.PFNGLCURRENTPALETTEMATRIXARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


