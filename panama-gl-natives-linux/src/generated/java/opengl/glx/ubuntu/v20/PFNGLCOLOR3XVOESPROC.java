// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOLOR3XVOESPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLCOLOR3XVOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOLOR3XVOESPROC.class, fi, constants$512.PFNGLCOLOR3XVOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCOLOR3XVOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOLOR3XVOESPROC.class, fi, constants$512.PFNGLCOLOR3XVOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCOLOR3XVOESPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$512.PFNGLCOLOR3XVOESPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

