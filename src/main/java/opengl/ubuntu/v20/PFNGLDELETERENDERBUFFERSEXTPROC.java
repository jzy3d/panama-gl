// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDELETERENDERBUFFERSEXTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLDELETERENDERBUFFERSEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETERENDERBUFFERSEXTPROC.class, fi, constants$626.PFNGLDELETERENDERBUFFERSEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDELETERENDERBUFFERSEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETERENDERBUFFERSEXTPROC.class, fi, constants$626.PFNGLDELETERENDERBUFFERSEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDELETERENDERBUFFERSEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$626.PFNGLDELETERENDERBUFFERSEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


