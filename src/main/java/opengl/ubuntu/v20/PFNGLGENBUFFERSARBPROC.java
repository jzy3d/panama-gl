// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGENBUFFERSARBPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGENBUFFERSARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENBUFFERSARBPROC.class, fi, constants$382.PFNGLGENBUFFERSARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGENBUFFERSARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENBUFFERSARBPROC.class, fi, constants$382.PFNGLGENBUFFERSARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGENBUFFERSARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$382.PFNGLGENBUFFERSARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


