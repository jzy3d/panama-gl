// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLWEIGHTUIVARBPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLWEIGHTUIVARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWEIGHTUIVARBPROC.class, fi, constants$380.PFNGLWEIGHTUIVARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLWEIGHTUIVARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWEIGHTUIVARBPROC.class, fi, constants$380.PFNGLWEIGHTUIVARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLWEIGHTUIVARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$380.PFNGLWEIGHTUIVARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


