// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPOINTSIZEXOESPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLPOINTSIZEXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPOINTSIZEXOESPROC.class, fi, constants$422.PFNGLPOINTSIZEXOESPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLPOINTSIZEXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPOINTSIZEXOESPROC.class, fi, constants$422.PFNGLPOINTSIZEXOESPROC$FUNC, "(I)V", scope);
    }
    static PFNGLPOINTSIZEXOESPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$422.PFNGLPOINTSIZEXOESPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

