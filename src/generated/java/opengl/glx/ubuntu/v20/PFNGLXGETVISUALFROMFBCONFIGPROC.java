// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLXGETVISUALFROMFBCONFIGPROC {

    jdk.incubator.foreign.MemoryAddress apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLXGETVISUALFROMFBCONFIGPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXGETVISUALFROMFBCONFIGPROC.class, fi, constants$1022.PFNGLXGETVISUALFROMFBCONFIGPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(PFNGLXGETVISUALFROMFBCONFIGPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXGETVISUALFROMFBCONFIGPROC.class, fi, constants$1022.PFNGLXGETVISUALFROMFBCONFIGPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static PFNGLXGETVISUALFROMFBCONFIGPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (jdk.incubator.foreign.MemoryAddress)constants$1022.PFNGLXGETVISUALFROMFBCONFIGPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


