// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCLIPPLANEXOESPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLCLIPPLANEXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCLIPPLANEXOESPROC.class, fi, constants$414.PFNGLCLIPPLANEXOESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCLIPPLANEXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCLIPPLANEXOESPROC.class, fi, constants$414.PFNGLCLIPPLANEXOESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCLIPPLANEXOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$414.PFNGLCLIPPLANEXOESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


