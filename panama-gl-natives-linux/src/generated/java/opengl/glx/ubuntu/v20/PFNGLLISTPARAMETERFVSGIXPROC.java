// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLLISTPARAMETERFVSGIXPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLLISTPARAMETERFVSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLLISTPARAMETERFVSGIXPROC.class, fi, constants$988.PFNGLLISTPARAMETERFVSGIXPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLLISTPARAMETERFVSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLLISTPARAMETERFVSGIXPROC.class, fi, constants$988.PFNGLLISTPARAMETERFVSGIXPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLLISTPARAMETERFVSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$988.PFNGLLISTPARAMETERFVSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


