// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVIEWPORTINDEXEDFVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLVIEWPORTINDEXEDFVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVIEWPORTINDEXEDFVPROC.class, fi, constants$331.PFNGLVIEWPORTINDEXEDFVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLVIEWPORTINDEXEDFVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVIEWPORTINDEXEDFVPROC.class, fi, constants$331.PFNGLVIEWPORTINDEXEDFVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLVIEWPORTINDEXEDFVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$331.PFNGLVIEWPORTINDEXEDFVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


