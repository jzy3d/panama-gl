// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLUNIFORM3UI64NVPROC {

    void apply(int x0, long x1, long x2, long x3);
    static MemoryAddress allocate(PFNGLUNIFORM3UI64NVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM3UI64NVPROC.class, fi, constants$459.PFNGLUNIFORM3UI64NVPROC$FUNC, "(IJJJ)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM3UI64NVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM3UI64NVPROC.class, fi, constants$459.PFNGLUNIFORM3UI64NVPROC$FUNC, "(IJJJ)V", scope);
    }
    static PFNGLUNIFORM3UI64NVPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, long x2, long x3) -> {
            try {
                constants$459.PFNGLUNIFORM3UI64NVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


