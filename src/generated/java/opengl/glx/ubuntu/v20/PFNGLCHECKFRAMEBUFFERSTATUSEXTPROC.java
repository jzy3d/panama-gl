// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC {

    int apply(int x0);
    static MemoryAddress allocate(PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC.class, fi, constants$714.PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC$FUNC, "(I)I");
    }
    static MemoryAddress allocate(PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC.class, fi, constants$714.PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC$FUNC, "(I)I", scope);
    }
    static PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (int)constants$714.PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


