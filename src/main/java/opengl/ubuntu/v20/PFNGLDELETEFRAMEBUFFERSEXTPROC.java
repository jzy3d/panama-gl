// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDELETEFRAMEBUFFERSEXTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLDELETEFRAMEBUFFERSEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETEFRAMEBUFFERSEXTPROC.class, fi, constants$628.PFNGLDELETEFRAMEBUFFERSEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDELETEFRAMEBUFFERSEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETEFRAMEBUFFERSEXTPROC.class, fi, constants$628.PFNGLDELETEFRAMEBUFFERSEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDELETEFRAMEBUFFERSEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$628.PFNGLDELETEFRAMEBUFFERSEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


