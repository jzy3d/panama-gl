// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLFRAMEZOOMSGIXPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLFRAMEZOOMSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEZOOMSGIXPROC.class, fi, constants$984.PFNGLFRAMEZOOMSGIXPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLFRAMEZOOMSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEZOOMSGIXPROC.class, fi, constants$984.PFNGLFRAMEZOOMSGIXPROC$FUNC, "(I)V", scope);
    }
    static PFNGLFRAMEZOOMSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$984.PFNGLFRAMEZOOMSGIXPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


