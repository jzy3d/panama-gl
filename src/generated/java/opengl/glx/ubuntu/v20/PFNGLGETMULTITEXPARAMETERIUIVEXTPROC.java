// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETMULTITEXPARAMETERIUIVEXTPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLGETMULTITEXPARAMETERIUIVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETMULTITEXPARAMETERIUIVEXTPROC.class, fi, constants$669.PFNGLGETMULTITEXPARAMETERIUIVEXTPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETMULTITEXPARAMETERIUIVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETMULTITEXPARAMETERIUIVEXTPROC.class, fi, constants$669.PFNGLGETMULTITEXPARAMETERIUIVEXTPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETMULTITEXPARAMETERIUIVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$669.PFNGLGETMULTITEXPARAMETERIUIVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


