// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLXGETVISUALFROMFBCONFIGSGIXPROC {

    jdk.incubator.foreign.MemoryAddress apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLXGETVISUALFROMFBCONFIGSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXGETVISUALFROMFBCONFIGSGIXPROC.class, fi, constants$1049.PFNGLXGETVISUALFROMFBCONFIGSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(PFNGLXGETVISUALFROMFBCONFIGSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXGETVISUALFROMFBCONFIGSGIXPROC.class, fi, constants$1049.PFNGLXGETVISUALFROMFBCONFIGSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static PFNGLXGETVISUALFROMFBCONFIGSGIXPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (jdk.incubator.foreign.MemoryAddress)constants$1050.PFNGLXGETVISUALFROMFBCONFIGSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


