// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETUNIFORMLOCATIONARBPROC {

    int apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGETUNIFORMLOCATIONARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMLOCATIONARBPROC.class, fi, constants$454.PFNGLGETUNIFORMLOCATIONARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLGETUNIFORMLOCATIONARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMLOCATIONARBPROC.class, fi, constants$454.PFNGLGETUNIFORMLOCATIONARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLGETUNIFORMLOCATIONARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (int)constants$454.PFNGLGETUNIFORMLOCATIONARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


