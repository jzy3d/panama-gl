// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPATHDASHARRAYNVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLPATHDASHARRAYNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPATHDASHARRAYNVPROC.class, fi, constants$877.PFNGLPATHDASHARRAYNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPATHDASHARRAYNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPATHDASHARRAYNVPROC.class, fi, constants$877.PFNGLPATHDASHARRAYNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPATHDASHARRAYNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$877.PFNGLPATHDASHARRAYNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


