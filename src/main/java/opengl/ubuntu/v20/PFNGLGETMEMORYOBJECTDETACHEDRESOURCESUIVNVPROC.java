// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETMEMORYOBJECTDETACHEDRESOURCESUIVNVPROC {

    void apply(int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLGETMEMORYOBJECTDETACHEDRESOURCESUIVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETMEMORYOBJECTDETACHEDRESOURCESUIVNVPROC.class, fi, constants$779.PFNGLGETMEMORYOBJECTDETACHEDRESOURCESUIVNVPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETMEMORYOBJECTDETACHEDRESOURCESUIVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETMEMORYOBJECTDETACHEDRESOURCESUIVNVPROC.class, fi, constants$779.PFNGLGETMEMORYOBJECTDETACHEDRESOURCESUIVNVPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETMEMORYOBJECTDETACHEDRESOURCESUIVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$779.PFNGLGETMEMORYOBJECTDETACHEDRESOURCESUIVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


