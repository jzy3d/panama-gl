// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPRIMITIVERESTARTINDEXNVPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLPRIMITIVERESTARTINDEXNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPRIMITIVERESTARTINDEXNVPROC.class, fi, constants$896.PFNGLPRIMITIVERESTARTINDEXNVPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLPRIMITIVERESTARTINDEXNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPRIMITIVERESTARTINDEXNVPROC.class, fi, constants$896.PFNGLPRIMITIVERESTARTINDEXNVPROC$FUNC, "(I)V", scope);
    }
    static PFNGLPRIMITIVERESTARTINDEXNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$896.PFNGLPRIMITIVERESTARTINDEXNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


