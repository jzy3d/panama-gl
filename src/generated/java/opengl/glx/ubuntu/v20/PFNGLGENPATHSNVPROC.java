// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGENPATHSNVPROC {

    int apply(int x0);
    static MemoryAddress allocate(PFNGLGENPATHSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENPATHSNVPROC.class, fi, constants$871.PFNGLGENPATHSNVPROC$FUNC, "(I)I");
    }
    static MemoryAddress allocate(PFNGLGENPATHSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENPATHSNVPROC.class, fi, constants$871.PFNGLGENPATHSNVPROC$FUNC, "(I)I", scope);
    }
    static PFNGLGENPATHSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (int)constants$871.PFNGLGENPATHSNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


