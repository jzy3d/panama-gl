// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETQUERYOBJECTI64VPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETQUERYOBJECTI64VPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETQUERYOBJECTI64VPROC.class, fi, constants$275.PFNGLGETQUERYOBJECTI64VPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETQUERYOBJECTI64VPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETQUERYOBJECTI64VPROC.class, fi, constants$275.PFNGLGETQUERYOBJECTI64VPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETQUERYOBJECTI64VPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$275.PFNGLGETQUERYOBJECTI64VPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


