// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, long x6);
    static MemoryAddress allocate(PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC.class, fi, constants$705.PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC$FUNC, "(IIIIIIJ)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC.class, fi, constants$705.PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC$FUNC, "(IIIIIIJ)V", scope);
    }
    static PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, long x6) -> {
            try {
                constants$705.PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


