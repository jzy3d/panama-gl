// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMULTICASTWAITSYNCNVPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLMULTICASTWAITSYNCNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTICASTWAITSYNCNVPROC.class, fi, constants$841.PFNGLMULTICASTWAITSYNCNVPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLMULTICASTWAITSYNCNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTICASTWAITSYNCNVPROC.class, fi, constants$841.PFNGLMULTICASTWAITSYNCNVPROC$FUNC, "(II)V", scope);
    }
    static PFNGLMULTICASTWAITSYNCNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$841.PFNGLMULTICASTWAITSYNCNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


