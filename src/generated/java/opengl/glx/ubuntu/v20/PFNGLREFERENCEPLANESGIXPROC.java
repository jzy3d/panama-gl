// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLREFERENCEPLANESGIXPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLREFERENCEPLANESGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLREFERENCEPLANESGIXPROC.class, fi, constants$990.PFNGLREFERENCEPLANESGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLREFERENCEPLANESGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLREFERENCEPLANESGIXPROC.class, fi, constants$990.PFNGLREFERENCEPLANESGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLREFERENCEPLANESGIXPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$990.PFNGLREFERENCEPLANESGIXPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


