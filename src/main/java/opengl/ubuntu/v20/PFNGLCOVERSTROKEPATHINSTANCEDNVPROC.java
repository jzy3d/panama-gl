// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCOVERSTROKEPATHINSTANCEDNVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6);
    static MemoryAddress allocate(PFNGLCOVERSTROKEPATHINSTANCEDNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOVERSTROKEPATHINSTANCEDNVPROC.class, fi, constants$796.PFNGLCOVERSTROKEPATHINSTANCEDNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCOVERSTROKEPATHINSTANCEDNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOVERSTROKEPATHINSTANCEDNVPROC.class, fi, constants$796.PFNGLCOVERSTROKEPATHINSTANCEDNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCOVERSTROKEPATHINSTANCEDNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6) -> {
            try {
                constants$796.PFNGLCOVERSTROKEPATHINSTANCEDNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


