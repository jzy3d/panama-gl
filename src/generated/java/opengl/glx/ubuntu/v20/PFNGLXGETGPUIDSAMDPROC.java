// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLXGETGPUIDSAMDPROC {

    int apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLXGETGPUIDSAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXGETGPUIDSAMDPROC.class, fi, constants$1028.PFNGLXGETGPUIDSAMDPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLXGETGPUIDSAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXGETGPUIDSAMDPROC.class, fi, constants$1028.PFNGLXGETGPUIDSAMDPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLXGETGPUIDSAMDPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (int)constants$1029.PFNGLXGETGPUIDSAMDPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


