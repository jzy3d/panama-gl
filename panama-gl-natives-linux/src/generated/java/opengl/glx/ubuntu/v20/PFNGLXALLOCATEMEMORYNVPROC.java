// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXALLOCATEMEMORYNVPROC {

    jdk.incubator.foreign.MemoryAddress apply(int x0, float x1, float x2, float x3);
    static MemoryAddress allocate(PFNGLXALLOCATEMEMORYNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXALLOCATEMEMORYNVPROC.class, fi, constants$1060.PFNGLXALLOCATEMEMORYNVPROC$FUNC, "(IFFF)Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(PFNGLXALLOCATEMEMORYNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXALLOCATEMEMORYNVPROC.class, fi, constants$1060.PFNGLXALLOCATEMEMORYNVPROC$FUNC, "(IFFF)Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static PFNGLXALLOCATEMEMORYNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2, float x3) -> {
            try {
                return (jdk.incubator.foreign.MemoryAddress)constants$1060.PFNGLXALLOCATEMEMORYNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


