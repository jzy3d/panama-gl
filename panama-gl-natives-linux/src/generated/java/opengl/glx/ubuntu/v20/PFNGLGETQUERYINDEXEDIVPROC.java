// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETQUERYINDEXEDIVPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLGETQUERYINDEXEDIVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETQUERYINDEXEDIVPROC.class, fi, constants$304.PFNGLGETQUERYINDEXEDIVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETQUERYINDEXEDIVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETQUERYINDEXEDIVPROC.class, fi, constants$304.PFNGLGETQUERYINDEXEDIVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETQUERYINDEXEDIVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$304.PFNGLGETQUERYINDEXEDIVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


