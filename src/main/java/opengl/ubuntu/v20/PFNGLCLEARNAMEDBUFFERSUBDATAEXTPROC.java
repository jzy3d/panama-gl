// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCLEARNAMEDBUFFERSUBDATAEXTPROC {

    void apply(int x0, int x1, long x2, long x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6);
    static MemoryAddress allocate(PFNGLCLEARNAMEDBUFFERSUBDATAEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCLEARNAMEDBUFFERSUBDATAEXTPROC.class, fi, constants$609.PFNGLCLEARNAMEDBUFFERSUBDATAEXTPROC$FUNC, "(IIJJIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCLEARNAMEDBUFFERSUBDATAEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCLEARNAMEDBUFFERSUBDATAEXTPROC.class, fi, constants$609.PFNGLCLEARNAMEDBUFFERSUBDATAEXTPROC$FUNC, "(IIJJIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCLEARNAMEDBUFFERSUBDATAEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, long x2, long x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6) -> {
            try {
                constants$609.PFNGLCLEARNAMEDBUFFERSUBDATAEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


