// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSPRITEPARAMETERFVSGIXPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLSPRITEPARAMETERFVSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSPRITEPARAMETERFVSGIXPROC.class, fi, constants$991.PFNGLSPRITEPARAMETERFVSGIXPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLSPRITEPARAMETERFVSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSPRITEPARAMETERFVSGIXPROC.class, fi, constants$991.PFNGLSPRITEPARAMETERFVSGIXPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLSPRITEPARAMETERFVSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$991.PFNGLSPRITEPARAMETERFVSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


