// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLREQUESTRESIDENTPROGRAMSNVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLREQUESTRESIDENTPROGRAMSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLREQUESTRESIDENTPROGRAMSNVPROC.class, fi, constants$857.PFNGLREQUESTRESIDENTPROGRAMSNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLREQUESTRESIDENTPROGRAMSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLREQUESTRESIDENTPROGRAMSNVPROC.class, fi, constants$857.PFNGLREQUESTRESIDENTPROGRAMSNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLREQUESTRESIDENTPROGRAMSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$857.PFNGLREQUESTRESIDENTPROGRAMSNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


