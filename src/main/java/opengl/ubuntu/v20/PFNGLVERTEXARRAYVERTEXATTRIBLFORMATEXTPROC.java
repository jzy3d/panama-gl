// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC.class, fi, constants$619.PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC$FUNC, "(IIIII)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC.class, fi, constants$619.PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC$FUNC, "(IIIII)V", scope);
    }
    static PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4) -> {
            try {
                constants$619.PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


