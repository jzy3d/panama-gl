// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXRELEASEVIDEOIMAGENVPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, long x1);
    static MemoryAddress allocate(PFNGLXRELEASEVIDEOIMAGENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXRELEASEVIDEOIMAGENVPROC.class, fi, constants$1044.PFNGLXRELEASEVIDEOIMAGENVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)I");
    }
    static MemoryAddress allocate(PFNGLXRELEASEVIDEOIMAGENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXRELEASEVIDEOIMAGENVPROC.class, fi, constants$1044.PFNGLXRELEASEVIDEOIMAGENVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)I", scope);
    }
    static PFNGLXRELEASEVIDEOIMAGENVPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1) -> {
            try {
                return (int)constants$1045.PFNGLXRELEASEVIDEOIMAGENVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

