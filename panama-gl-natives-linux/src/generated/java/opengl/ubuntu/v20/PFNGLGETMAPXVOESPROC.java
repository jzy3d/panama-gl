// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETMAPXVOESPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETMAPXVOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETMAPXVOESPROC.class, fi, constants$431.PFNGLGETMAPXVOESPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETMAPXVOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETMAPXVOESPROC.class, fi, constants$431.PFNGLGETMAPXVOESPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETMAPXVOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$431.PFNGLGETMAPXVOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


