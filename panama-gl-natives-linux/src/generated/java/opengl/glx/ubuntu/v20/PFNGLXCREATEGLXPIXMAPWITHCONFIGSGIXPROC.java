// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXCREATEGLXPIXMAPWITHCONFIGSGIXPROC {

    long apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, long x2);
    static MemoryAddress allocate(PFNGLXCREATEGLXPIXMAPWITHCONFIGSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXCREATEGLXPIXMAPWITHCONFIGSGIXPROC.class, fi, constants$1049.PFNGLXCREATEGLXPIXMAPWITHCONFIGSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)J");
    }
    static MemoryAddress allocate(PFNGLXCREATEGLXPIXMAPWITHCONFIGSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXCREATEGLXPIXMAPWITHCONFIGSGIXPROC.class, fi, constants$1049.PFNGLXCREATEGLXPIXMAPWITHCONFIGSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)J", scope);
    }
    static PFNGLXCREATEGLXPIXMAPWITHCONFIGSGIXPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, long x2) -> {
            try {
                return (long)constants$1049.PFNGLXCREATEGLXPIXMAPWITHCONFIGSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


