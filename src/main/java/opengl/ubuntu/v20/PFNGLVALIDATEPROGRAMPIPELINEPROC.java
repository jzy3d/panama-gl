// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVALIDATEPROGRAMPIPELINEPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLVALIDATEPROGRAMPIPELINEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVALIDATEPROGRAMPIPELINEPROC.class, fi, constants$241.PFNGLVALIDATEPROGRAMPIPELINEPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLVALIDATEPROGRAMPIPELINEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVALIDATEPROGRAMPIPELINEPROC.class, fi, constants$241.PFNGLVALIDATEPROGRAMPIPELINEPROC$FUNC, "(I)V", scope);
    }
    static PFNGLVALIDATEPROGRAMPIPELINEPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$241.PFNGLVALIDATEPROGRAMPIPELINEPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


