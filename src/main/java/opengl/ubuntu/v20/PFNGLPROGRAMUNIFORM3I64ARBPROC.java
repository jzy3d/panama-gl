// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPROGRAMUNIFORM3I64ARBPROC {

    void apply(int x0, int x1, long x2, long x3, long x4);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM3I64ARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3I64ARBPROC.class, fi, constants$338.PFNGLPROGRAMUNIFORM3I64ARBPROC$FUNC, "(IIJJJ)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM3I64ARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3I64ARBPROC.class, fi, constants$338.PFNGLPROGRAMUNIFORM3I64ARBPROC$FUNC, "(IIJJJ)V", scope);
    }
    static PFNGLPROGRAMUNIFORM3I64ARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, long x2, long x3, long x4) -> {
            try {
                constants$338.PFNGLPROGRAMUNIFORM3I64ARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


