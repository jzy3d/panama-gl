// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLWEIGHTBVARBPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLWEIGHTBVARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWEIGHTBVARBPROC.class, fi, constants$378.PFNGLWEIGHTBVARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLWEIGHTBVARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWEIGHTBVARBPROC.class, fi, constants$378.PFNGLWEIGHTBVARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLWEIGHTBVARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$378.PFNGLWEIGHTBVARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


