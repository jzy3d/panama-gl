// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVDPAUREGISTERVIDEOSURFACENVPROC {

    long apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLVDPAUREGISTERVIDEOSURFACENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVDPAUREGISTERVIDEOSURFACENVPROC.class, fi, constants$835.PFNGLVDPAUREGISTERVIDEOSURFACENVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)J");
    }
    static MemoryAddress allocate(PFNGLVDPAUREGISTERVIDEOSURFACENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVDPAUREGISTERVIDEOSURFACENVPROC.class, fi, constants$835.PFNGLVDPAUREGISTERVIDEOSURFACENVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)J", scope);
    }
    static PFNGLVDPAUREGISTERVIDEOSURFACENVPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                return (long)constants$835.PFNGLVDPAUREGISTERVIDEOSURFACENVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


