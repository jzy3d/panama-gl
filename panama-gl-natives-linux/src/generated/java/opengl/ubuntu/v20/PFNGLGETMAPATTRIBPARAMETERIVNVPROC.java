// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETMAPATTRIBPARAMETERIVNVPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLGETMAPATTRIBPARAMETERIVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETMAPATTRIBPARAMETERIVNVPROC.class, fi, constants$745.PFNGLGETMAPATTRIBPARAMETERIVNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETMAPATTRIBPARAMETERIVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETMAPATTRIBPARAMETERIVNVPROC.class, fi, constants$745.PFNGLGETMAPATTRIBPARAMETERIVNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETMAPATTRIBPARAMETERIVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$745.PFNGLGETMAPATTRIBPARAMETERIVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

