// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETGRAPHICSRESETSTATUSPROC {

    int apply();
    static MemoryAddress allocate(PFNGLGETGRAPHICSRESETSTATUSPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETGRAPHICSRESETSTATUSPROC.class, fi, constants$304.PFNGLGETGRAPHICSRESETSTATUSPROC$FUNC, "()I");
    }
    static MemoryAddress allocate(PFNGLGETGRAPHICSRESETSTATUSPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETGRAPHICSRESETSTATUSPROC.class, fi, constants$304.PFNGLGETGRAPHICSRESETSTATUSPROC$FUNC, "()I", scope);
    }
    static PFNGLGETGRAPHICSRESETSTATUSPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                return (int)constants$304.PFNGLGETGRAPHICSRESETSTATUSPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


