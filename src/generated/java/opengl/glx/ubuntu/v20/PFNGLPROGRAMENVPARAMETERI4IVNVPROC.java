// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPROGRAMENVPARAMETERI4IVNVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLPROGRAMENVPARAMETERI4IVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMENVPARAMETERI4IVNVPROC.class, fi, constants$845.PFNGLPROGRAMENVPARAMETERI4IVNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMENVPARAMETERI4IVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMENVPARAMETERI4IVNVPROC.class, fi, constants$845.PFNGLPROGRAMENVPARAMETERI4IVNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPROGRAMENVPARAMETERI4IVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$845.PFNGLPROGRAMENVPARAMETERI4IVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


