// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLIMPORTSEMAPHOREFDEXTPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLIMPORTSEMAPHOREFDEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLIMPORTSEMAPHOREFDEXTPROC.class, fi, constants$662.PFNGLIMPORTSEMAPHOREFDEXTPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLIMPORTSEMAPHOREFDEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLIMPORTSEMAPHOREFDEXTPROC.class, fi, constants$662.PFNGLIMPORTSEMAPHOREFDEXTPROC$FUNC, "(III)V", scope);
    }
    static PFNGLIMPORTSEMAPHOREFDEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$662.PFNGLIMPORTSEMAPHOREFDEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


