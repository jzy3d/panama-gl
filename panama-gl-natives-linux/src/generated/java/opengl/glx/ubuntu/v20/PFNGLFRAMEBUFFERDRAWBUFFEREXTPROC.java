// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC.class, fi, constants$683.PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC.class, fi, constants$683.PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC$FUNC, "(II)V", scope);
    }
    static PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$683.PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


