// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXCOPYBUFFERSUBDATANVPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4, long x5, long x6, long x7);
    static MemoryAddress allocate(PFNGLXCOPYBUFFERSUBDATANVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXCOPYBUFFERSUBDATANVPROC.class, fi, constants$1038.PFNGLXCOPYBUFFERSUBDATANVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IIJJJ)V");
    }
    static MemoryAddress allocate(PFNGLXCOPYBUFFERSUBDATANVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXCOPYBUFFERSUBDATANVPROC.class, fi, constants$1038.PFNGLXCOPYBUFFERSUBDATANVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IIJJJ)V", scope);
    }
    static PFNGLXCOPYBUFFERSUBDATANVPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4, long x5, long x6, long x7) -> {
            try {
                constants$1038.PFNGLXCOPYBUFFERSUBDATANVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


