// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLISASYNCMARKERSGIXPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLISASYNCMARKERSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISASYNCMARKERSGIXPROC.class, fi, constants$892.PFNGLISASYNCMARKERSGIXPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLISASYNCMARKERSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISASYNCMARKERSGIXPROC.class, fi, constants$892.PFNGLISASYNCMARKERSGIXPROC$FUNC, "(I)B", scope);
    }
    static PFNGLISASYNCMARKERSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$892.PFNGLISASYNCMARKERSGIXPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

