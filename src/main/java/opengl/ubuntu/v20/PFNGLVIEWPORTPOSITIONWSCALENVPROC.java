// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVIEWPORTPOSITIONWSCALENVPROC {

    void apply(int x0, float x1, float x2);
    static MemoryAddress allocate(PFNGLVIEWPORTPOSITIONWSCALENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVIEWPORTPOSITIONWSCALENVPROC.class, fi, constants$731.PFNGLVIEWPORTPOSITIONWSCALENVPROC$FUNC, "(IFF)V");
    }
    static MemoryAddress allocate(PFNGLVIEWPORTPOSITIONWSCALENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVIEWPORTPOSITIONWSCALENVPROC.class, fi, constants$731.PFNGLVIEWPORTPOSITIONWSCALENVPROC$FUNC, "(IFF)V", scope);
    }
    static PFNGLVIEWPORTPOSITIONWSCALENVPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2) -> {
            try {
                constants$731.PFNGLVIEWPORTPOSITIONWSCALENVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

