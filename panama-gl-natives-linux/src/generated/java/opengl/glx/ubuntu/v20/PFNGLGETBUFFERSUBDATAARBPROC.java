// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETBUFFERSUBDATAARBPROC {

    void apply(int x0, long x1, long x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLGETBUFFERSUBDATAARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETBUFFERSUBDATAARBPROC.class, fi, constants$468.PFNGLGETBUFFERSUBDATAARBPROC$FUNC, "(IJJLjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETBUFFERSUBDATAARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETBUFFERSUBDATAARBPROC.class, fi, constants$468.PFNGLGETBUFFERSUBDATAARBPROC$FUNC, "(IJJLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETBUFFERSUBDATAARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, long x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$468.PFNGLGETBUFFERSUBDATAARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


