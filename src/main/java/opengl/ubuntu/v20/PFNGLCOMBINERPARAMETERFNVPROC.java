// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCOMBINERPARAMETERFNVPROC {

    void apply(int x0, float x1);
    static MemoryAddress allocate(PFNGLCOMBINERPARAMETERFNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOMBINERPARAMETERFNVPROC.class, fi, constants$813.PFNGLCOMBINERPARAMETERFNVPROC$FUNC, "(IF)V");
    }
    static MemoryAddress allocate(PFNGLCOMBINERPARAMETERFNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOMBINERPARAMETERFNVPROC.class, fi, constants$813.PFNGLCOMBINERPARAMETERFNVPROC$FUNC, "(IF)V", scope);
    }
    static PFNGLCOMBINERPARAMETERFNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1) -> {
            try {
                constants$813.PFNGLCOMBINERPARAMETERFNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


