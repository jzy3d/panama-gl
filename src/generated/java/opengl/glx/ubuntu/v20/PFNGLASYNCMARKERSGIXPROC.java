// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLASYNCMARKERSGIXPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLASYNCMARKERSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLASYNCMARKERSGIXPROC.class, fi, constants$976.PFNGLASYNCMARKERSGIXPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLASYNCMARKERSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLASYNCMARKERSGIXPROC.class, fi, constants$976.PFNGLASYNCMARKERSGIXPROC$FUNC, "(I)V", scope);
    }
    static PFNGLASYNCMARKERSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$976.PFNGLASYNCMARKERSGIXPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


