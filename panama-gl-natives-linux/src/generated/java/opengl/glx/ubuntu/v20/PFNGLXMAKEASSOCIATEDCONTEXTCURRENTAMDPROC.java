// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXMAKEASSOCIATEDCONTEXTCURRENTAMDPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLXMAKEASSOCIATEDCONTEXTCURRENTAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXMAKEASSOCIATEDCONTEXTCURRENTAMDPROC.class, fi, constants$1030.PFNGLXMAKEASSOCIATEDCONTEXTCURRENTAMDPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLXMAKEASSOCIATEDCONTEXTCURRENTAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXMAKEASSOCIATEDCONTEXTCURRENTAMDPROC.class, fi, constants$1030.PFNGLXMAKEASSOCIATEDCONTEXTCURRENTAMDPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLXMAKEASSOCIATEDCONTEXTCURRENTAMDPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                return (int)constants$1031.PFNGLXMAKEASSOCIATEDCONTEXTCURRENTAMDPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


