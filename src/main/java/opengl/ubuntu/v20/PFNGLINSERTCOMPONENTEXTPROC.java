// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLINSERTCOMPONENTEXTPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLINSERTCOMPONENTEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLINSERTCOMPONENTEXTPROC.class, fi, constants$685.PFNGLINSERTCOMPONENTEXTPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLINSERTCOMPONENTEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLINSERTCOMPONENTEXTPROC.class, fi, constants$685.PFNGLINSERTCOMPONENTEXTPROC$FUNC, "(III)V", scope);
    }
    static PFNGLINSERTCOMPONENTEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$685.PFNGLINSERTCOMPONENTEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


