// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLISPROGRAMNVPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLISPROGRAMNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISPROGRAMNVPROC.class, fi, constants$854.PFNGLISPROGRAMNVPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLISPROGRAMNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISPROGRAMNVPROC.class, fi, constants$854.PFNGLISPROGRAMNVPROC$FUNC, "(I)B", scope);
    }
    static PFNGLISPROGRAMNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$854.PFNGLISPROGRAMNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


