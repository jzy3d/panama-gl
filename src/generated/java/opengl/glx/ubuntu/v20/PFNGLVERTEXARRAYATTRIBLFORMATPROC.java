// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXARRAYATTRIBLFORMATPROC {

    void apply(int x0, int x1, int x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLVERTEXARRAYATTRIBLFORMATPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYATTRIBLFORMATPROC.class, fi, constants$384.PFNGLVERTEXARRAYATTRIBLFORMATPROC$FUNC, "(IIIII)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXARRAYATTRIBLFORMATPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYATTRIBLFORMATPROC.class, fi, constants$384.PFNGLVERTEXARRAYATTRIBLFORMATPROC$FUNC, "(IIIII)V", scope);
    }
    static PFNGLVERTEXARRAYATTRIBLFORMATPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4) -> {
            try {
                constants$384.PFNGLVERTEXARRAYATTRIBLFORMATPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


