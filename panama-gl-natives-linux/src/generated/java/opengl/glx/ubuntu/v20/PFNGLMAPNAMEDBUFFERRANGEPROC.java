// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMAPNAMEDBUFFERRANGEPROC {

    jdk.incubator.foreign.MemoryAddress apply(int x0, long x1, long x2, int x3);
    static MemoryAddress allocate(PFNGLMAPNAMEDBUFFERRANGEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMAPNAMEDBUFFERRANGEPROC.class, fi, constants$360.PFNGLMAPNAMEDBUFFERRANGEPROC$FUNC, "(IJJI)Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(PFNGLMAPNAMEDBUFFERRANGEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMAPNAMEDBUFFERRANGEPROC.class, fi, constants$360.PFNGLMAPNAMEDBUFFERRANGEPROC$FUNC, "(IJJI)Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static PFNGLMAPNAMEDBUFFERRANGEPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, long x2, int x3) -> {
            try {
                return (jdk.incubator.foreign.MemoryAddress)constants$360.PFNGLMAPNAMEDBUFFERRANGEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


