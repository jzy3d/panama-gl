// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLWINDOWRECTANGLESEXTPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLWINDOWRECTANGLESEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWRECTANGLESEXTPROC.class, fi, constants$697.PFNGLWINDOWRECTANGLESEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWRECTANGLESEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWRECTANGLESEXTPROC.class, fi, constants$697.PFNGLWINDOWRECTANGLESEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLWINDOWRECTANGLESEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$697.PFNGLWINDOWRECTANGLESEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


