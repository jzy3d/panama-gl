// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVALIDATEPROGRAMPIPELINEPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLVALIDATEPROGRAMPIPELINEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVALIDATEPROGRAMPIPELINEPROC.class, fi, constants$326.PFNGLVALIDATEPROGRAMPIPELINEPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLVALIDATEPROGRAMPIPELINEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVALIDATEPROGRAMPIPELINEPROC.class, fi, constants$326.PFNGLVALIDATEPROGRAMPIPELINEPROC$FUNC, "(I)V", scope);
    }
    static PFNGLVALIDATEPROGRAMPIPELINEPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$326.PFNGLVALIDATEPROGRAMPIPELINEPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


