// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLENDOCCLUSIONQUERYNVPROC {

    void apply();
    static MemoryAddress allocate(PFNGLENDOCCLUSIONQUERYNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLENDOCCLUSIONQUERYNVPROC.class, fi, constants$784.PFNGLENDOCCLUSIONQUERYNVPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLENDOCCLUSIONQUERYNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLENDOCCLUSIONQUERYNVPROC.class, fi, constants$784.PFNGLENDOCCLUSIONQUERYNVPROC$FUNC, "()V", scope);
    }
    static PFNGLENDOCCLUSIONQUERYNVPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$784.PFNGLENDOCCLUSIONQUERYNVPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


