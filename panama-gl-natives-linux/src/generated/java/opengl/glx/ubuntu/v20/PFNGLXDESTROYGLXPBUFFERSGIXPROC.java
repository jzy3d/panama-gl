// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXDESTROYGLXPBUFFERSGIXPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, long x1);
    static MemoryAddress allocate(PFNGLXDESTROYGLXPBUFFERSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXDESTROYGLXPBUFFERSGIXPROC.class, fi, constants$1053.PFNGLXDESTROYGLXPBUFFERSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)V");
    }
    static MemoryAddress allocate(PFNGLXDESTROYGLXPBUFFERSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXDESTROYGLXPBUFFERSGIXPROC.class, fi, constants$1053.PFNGLXDESTROYGLXPBUFFERSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)V", scope);
    }
    static PFNGLXDESTROYGLXPBUFFERSGIXPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1) -> {
            try {
                constants$1053.PFNGLXDESTROYGLXPBUFFERSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


