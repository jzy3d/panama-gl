// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLUNIFORM3IVARBPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLUNIFORM3IVARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM3IVARBPROC.class, fi, constants$366.PFNGLUNIFORM3IVARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM3IVARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM3IVARBPROC.class, fi, constants$366.PFNGLUNIFORM3IVARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLUNIFORM3IVARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$366.PFNGLUNIFORM3IVARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

