// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETVARYINGLOCATIONNVPROC {

    int apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGETVARYINGLOCATIONNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETVARYINGLOCATIONNVPROC.class, fi, constants$916.PFNGLGETVARYINGLOCATIONNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLGETVARYINGLOCATIONNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETVARYINGLOCATIONNVPROC.class, fi, constants$916.PFNGLGETVARYINGLOCATIONNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLGETVARYINGLOCATIONNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (int)constants$916.PFNGLGETVARYINGLOCATIONNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


