// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLUNIFORMBUFFEREXTPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLUNIFORMBUFFEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORMBUFFEREXTPROC.class, fi, constants$516.PFNGLUNIFORMBUFFEREXTPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORMBUFFEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORMBUFFEREXTPROC.class, fi, constants$516.PFNGLUNIFORMBUFFEREXTPROC$FUNC, "(III)V", scope);
    }
    static PFNGLUNIFORMBUFFEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$516.PFNGLUNIFORMBUFFEREXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


