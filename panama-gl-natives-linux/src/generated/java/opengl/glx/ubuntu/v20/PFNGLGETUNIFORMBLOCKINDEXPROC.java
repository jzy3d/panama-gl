// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETUNIFORMBLOCKINDEXPROC {

    int apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGETUNIFORMBLOCKINDEXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMBLOCKINDEXPROC.class, fi, constants$262.PFNGLGETUNIFORMBLOCKINDEXPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLGETUNIFORMBLOCKINDEXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMBLOCKINDEXPROC.class, fi, constants$262.PFNGLGETUNIFORMBLOCKINDEXPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLGETUNIFORMBLOCKINDEXPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (int)constants$262.PFNGLGETUNIFORMBLOCKINDEXPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


