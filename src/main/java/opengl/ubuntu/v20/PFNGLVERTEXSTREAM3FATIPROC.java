// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXSTREAM3FATIPROC {

    void apply(int x0, float x1, float x2, float x3);
    static MemoryAddress allocate(PFNGLVERTEXSTREAM3FATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM3FATIPROC.class, fi, constants$507.PFNGLVERTEXSTREAM3FATIPROC$FUNC, "(IFFF)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXSTREAM3FATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM3FATIPROC.class, fi, constants$507.PFNGLVERTEXSTREAM3FATIPROC$FUNC, "(IFFF)V", scope);
    }
    static PFNGLVERTEXSTREAM3FATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2, float x3) -> {
            try {
                constants$507.PFNGLVERTEXSTREAM3FATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


