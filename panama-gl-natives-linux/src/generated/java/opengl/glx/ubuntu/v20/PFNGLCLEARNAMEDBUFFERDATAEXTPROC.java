// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCLEARNAMEDBUFFERDATAEXTPROC {

    void apply(int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLCLEARNAMEDBUFFERDATAEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCLEARNAMEDBUFFERDATAEXTPROC.class, fi, constants$694.PFNGLCLEARNAMEDBUFFERDATAEXTPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCLEARNAMEDBUFFERDATAEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCLEARNAMEDBUFFERDATAEXTPROC.class, fi, constants$694.PFNGLCLEARNAMEDBUFFERDATAEXTPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCLEARNAMEDBUFFERDATAEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$694.PFNGLCLEARNAMEDBUFFERDATAEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


