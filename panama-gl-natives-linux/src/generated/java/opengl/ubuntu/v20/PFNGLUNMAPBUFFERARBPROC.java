// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLUNMAPBUFFERARBPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLUNMAPBUFFERARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNMAPBUFFERARBPROC.class, fi, constants$384.PFNGLUNMAPBUFFERARBPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLUNMAPBUFFERARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNMAPBUFFERARBPROC.class, fi, constants$384.PFNGLUNMAPBUFFERARBPROC$FUNC, "(I)B", scope);
    }
    static PFNGLUNMAPBUFFERARBPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$384.PFNGLUNMAPBUFFERARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


