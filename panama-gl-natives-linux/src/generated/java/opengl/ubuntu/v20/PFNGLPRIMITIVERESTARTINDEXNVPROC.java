// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPRIMITIVERESTARTINDEXNVPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLPRIMITIVERESTARTINDEXNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPRIMITIVERESTARTINDEXNVPROC.class, fi, constants$811.PFNGLPRIMITIVERESTARTINDEXNVPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLPRIMITIVERESTARTINDEXNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPRIMITIVERESTARTINDEXNVPROC.class, fi, constants$811.PFNGLPRIMITIVERESTARTINDEXNVPROC$FUNC, "(I)V", scope);
    }
    static PFNGLPRIMITIVERESTARTINDEXNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$811.PFNGLPRIMITIVERESTARTINDEXNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


