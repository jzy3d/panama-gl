// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLRESOLVEDEPTHVALUESNVPROC {

    void apply();
    static MemoryAddress allocate(PFNGLRESOLVEDEPTHVALUESNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLRESOLVEDEPTHVALUESNVPROC.class, fi, constants$818.PFNGLRESOLVEDEPTHVALUESNVPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLRESOLVEDEPTHVALUESNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLRESOLVEDEPTHVALUESNVPROC.class, fi, constants$818.PFNGLRESOLVEDEPTHVALUESNVPROC$FUNC, "()V", scope);
    }
    static PFNGLRESOLVEDEPTHVALUESNVPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$818.PFNGLRESOLVEDEPTHVALUESNVPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


