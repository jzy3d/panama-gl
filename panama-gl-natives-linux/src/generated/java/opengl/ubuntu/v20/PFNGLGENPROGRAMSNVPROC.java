// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGENPROGRAMSNVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGENPROGRAMSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENPROGRAMSNVPROC.class, fi, constants$851.PFNGLGENPROGRAMSNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGENPROGRAMSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENPROGRAMSNVPROC.class, fi, constants$851.PFNGLGENPROGRAMSNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGENPROGRAMSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$851.PFNGLGENPROGRAMSNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


