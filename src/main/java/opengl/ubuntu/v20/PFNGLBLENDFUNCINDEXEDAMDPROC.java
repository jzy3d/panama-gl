// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBLENDFUNCINDEXEDAMDPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLBLENDFUNCINDEXEDAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBLENDFUNCINDEXEDAMDPROC.class, fi, constants$452.PFNGLBLENDFUNCINDEXEDAMDPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLBLENDFUNCINDEXEDAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBLENDFUNCINDEXEDAMDPROC.class, fi, constants$452.PFNGLBLENDFUNCINDEXEDAMDPROC$FUNC, "(III)V", scope);
    }
    static PFNGLBLENDFUNCINDEXEDAMDPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$452.PFNGLBLENDFUNCINDEXEDAMDPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


