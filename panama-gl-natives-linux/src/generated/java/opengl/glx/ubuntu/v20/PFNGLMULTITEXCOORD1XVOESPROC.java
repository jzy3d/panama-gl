// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTITEXCOORD1XVOESPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLMULTITEXCOORD1XVOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD1XVOESPROC.class, fi, constants$521.PFNGLMULTITEXCOORD1XVOESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXCOORD1XVOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD1XVOESPROC.class, fi, constants$521.PFNGLMULTITEXCOORD1XVOESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLMULTITEXCOORD1XVOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$521.PFNGLMULTITEXCOORD1XVOESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


