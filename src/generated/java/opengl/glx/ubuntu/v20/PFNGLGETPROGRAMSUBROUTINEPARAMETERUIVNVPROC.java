// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETPROGRAMSUBROUTINEPARAMETERUIVNVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETPROGRAMSUBROUTINEPARAMETERUIVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETPROGRAMSUBROUTINEPARAMETERUIVNVPROC.class, fi, constants$849.PFNGLGETPROGRAMSUBROUTINEPARAMETERUIVNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETPROGRAMSUBROUTINEPARAMETERUIVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETPROGRAMSUBROUTINEPARAMETERUIVNVPROC.class, fi, constants$849.PFNGLGETPROGRAMSUBROUTINEPARAMETERUIVNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETPROGRAMSUBROUTINEPARAMETERUIVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$849.PFNGLGETPROGRAMSUBROUTINEPARAMETERUIVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


