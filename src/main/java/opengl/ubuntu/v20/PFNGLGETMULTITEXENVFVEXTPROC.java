// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETMULTITEXENVFVEXTPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLGETMULTITEXENVFVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETMULTITEXENVFVEXTPROC.class, fi, constants$552.PFNGLGETMULTITEXENVFVEXTPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETMULTITEXENVFVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETMULTITEXENVFVEXTPROC.class, fi, constants$552.PFNGLGETMULTITEXENVFVEXTPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETMULTITEXENVFVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$552.PFNGLGETMULTITEXENVFVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


