// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLUNIFORM2IVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLUNIFORM2IVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM2IVPROC.class, fi, constants$215.PFNGLUNIFORM2IVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM2IVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM2IVPROC.class, fi, constants$215.PFNGLUNIFORM2IVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLUNIFORM2IVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$215.PFNGLUNIFORM2IVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


