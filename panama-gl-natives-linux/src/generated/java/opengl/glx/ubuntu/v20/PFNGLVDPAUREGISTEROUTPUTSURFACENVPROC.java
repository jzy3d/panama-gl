// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVDPAUREGISTEROUTPUTSURFACENVPROC {

    long apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLVDPAUREGISTEROUTPUTSURFACENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVDPAUREGISTEROUTPUTSURFACENVPROC.class, fi, constants$921.PFNGLVDPAUREGISTEROUTPUTSURFACENVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)J");
    }
    static MemoryAddress allocate(PFNGLVDPAUREGISTEROUTPUTSURFACENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVDPAUREGISTEROUTPUTSURFACENVPROC.class, fi, constants$921.PFNGLVDPAUREGISTEROUTPUTSURFACENVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)J", scope);
    }
    static PFNGLVDPAUREGISTEROUTPUTSURFACENVPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                return (long)constants$921.PFNGLVDPAUREGISTEROUTPUTSURFACENVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


