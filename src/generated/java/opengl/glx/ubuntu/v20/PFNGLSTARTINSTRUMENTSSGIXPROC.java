// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSTARTINSTRUMENTSSGIXPROC {

    void apply();
    static MemoryAddress allocate(PFNGLSTARTINSTRUMENTSSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSTARTINSTRUMENTSSGIXPROC.class, fi, constants$986.PFNGLSTARTINSTRUMENTSSGIXPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLSTARTINSTRUMENTSSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSTARTINSTRUMENTSSGIXPROC.class, fi, constants$986.PFNGLSTARTINSTRUMENTSSGIXPROC$FUNC, "()V", scope);
    }
    static PFNGLSTARTINSTRUMENTSSGIXPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$986.PFNGLSTARTINSTRUMENTSSGIXPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


