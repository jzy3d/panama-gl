// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDELETEOCCLUSIONQUERIESNVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLDELETEOCCLUSIONQUERIESNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETEOCCLUSIONQUERIESNVPROC.class, fi, constants$783.PFNGLDELETEOCCLUSIONQUERIESNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDELETEOCCLUSIONQUERIESNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETEOCCLUSIONQUERIESNVPROC.class, fi, constants$783.PFNGLDELETEOCCLUSIONQUERIESNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDELETEOCCLUSIONQUERIESNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$783.PFNGLDELETEOCCLUSIONQUERIESNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

