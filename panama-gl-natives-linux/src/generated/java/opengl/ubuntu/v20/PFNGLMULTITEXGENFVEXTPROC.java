// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTITEXGENFVEXTPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLMULTITEXGENFVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXGENFVEXTPROC.class, fi, constants$551.PFNGLMULTITEXGENFVEXTPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXGENFVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXGENFVEXTPROC.class, fi, constants$551.PFNGLMULTITEXGENFVEXTPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLMULTITEXGENFVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$551.PFNGLMULTITEXGENFVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

