// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGENASYNCMARKERSSGIXPROC {

    int apply(int x0);
    static MemoryAddress allocate(PFNGLGENASYNCMARKERSSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENASYNCMARKERSSGIXPROC.class, fi, constants$891.PFNGLGENASYNCMARKERSSGIXPROC$FUNC, "(I)I");
    }
    static MemoryAddress allocate(PFNGLGENASYNCMARKERSSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENASYNCMARKERSSGIXPROC.class, fi, constants$891.PFNGLGENASYNCMARKERSSGIXPROC$FUNC, "(I)I", scope);
    }
    static PFNGLGENASYNCMARKERSSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (int)constants$891.PFNGLGENASYNCMARKERSSGIXPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

