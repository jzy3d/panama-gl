// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLLISTPARAMETERFVSGIXPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLLISTPARAMETERFVSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLLISTPARAMETERFVSGIXPROC.class, fi, constants$902.PFNGLLISTPARAMETERFVSGIXPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLLISTPARAMETERFVSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLLISTPARAMETERFVSGIXPROC.class, fi, constants$902.PFNGLLISTPARAMETERFVSGIXPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLLISTPARAMETERFVSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$902.PFNGLLISTPARAMETERFVSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


