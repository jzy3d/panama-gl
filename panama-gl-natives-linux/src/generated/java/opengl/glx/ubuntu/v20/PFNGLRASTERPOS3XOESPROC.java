// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLRASTERPOS3XOESPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLRASTERPOS3XOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLRASTERPOS3XOESPROC.class, fi, constants$526.PFNGLRASTERPOS3XOESPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLRASTERPOS3XOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLRASTERPOS3XOESPROC.class, fi, constants$526.PFNGLRASTERPOS3XOESPROC$FUNC, "(III)V", scope);
    }
    static PFNGLRASTERPOS3XOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$526.PFNGLRASTERPOS3XOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


