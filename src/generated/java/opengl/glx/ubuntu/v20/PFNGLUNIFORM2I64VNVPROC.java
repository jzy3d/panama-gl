// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLUNIFORM2I64VNVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLUNIFORM2I64VNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM2I64VNVPROC.class, fi, constants$542.PFNGLUNIFORM2I64VNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM2I64VNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM2I64VNVPROC.class, fi, constants$542.PFNGLUNIFORM2I64VNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLUNIFORM2I64VNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$542.PFNGLUNIFORM2I64VNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


