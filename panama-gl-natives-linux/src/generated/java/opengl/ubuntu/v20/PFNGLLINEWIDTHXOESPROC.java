// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLLINEWIDTHXOESPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLLINEWIDTHXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLLINEWIDTHXOESPROC.class, fi, constants$419.PFNGLLINEWIDTHXOESPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLLINEWIDTHXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLLINEWIDTHXOESPROC.class, fi, constants$419.PFNGLLINEWIDTHXOESPROC$FUNC, "(I)V", scope);
    }
    static PFNGLLINEWIDTHXOESPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$419.PFNGLLINEWIDTHXOESPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


