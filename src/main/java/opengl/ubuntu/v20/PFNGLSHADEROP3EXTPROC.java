// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSHADEROP3EXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLSHADEROP3EXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSHADEROP3EXTPROC.class, fi, constants$684.PFNGLSHADEROP3EXTPROC$FUNC, "(IIIII)V");
    }
    static MemoryAddress allocate(PFNGLSHADEROP3EXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSHADEROP3EXTPROC.class, fi, constants$684.PFNGLSHADEROP3EXTPROC$FUNC, "(IIIII)V", scope);
    }
    static PFNGLSHADEROP3EXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4) -> {
            try {
                constants$684.PFNGLSHADEROP3EXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

