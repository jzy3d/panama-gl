// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDRAWBUFFERSATIPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLDRAWBUFFERSATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDRAWBUFFERSATIPROC.class, fi, constants$486.PFNGLDRAWBUFFERSATIPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDRAWBUFFERSATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDRAWBUFFERSATIPROC.class, fi, constants$486.PFNGLDRAWBUFFERSATIPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDRAWBUFFERSATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$486.PFNGLDRAWBUFFERSATIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


