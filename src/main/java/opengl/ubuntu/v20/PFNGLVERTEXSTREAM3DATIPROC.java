// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXSTREAM3DATIPROC {

    void apply(int x0, double x1, double x2, double x3);
    static MemoryAddress allocate(PFNGLVERTEXSTREAM3DATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM3DATIPROC.class, fi, constants$508.PFNGLVERTEXSTREAM3DATIPROC$FUNC, "(IDDD)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXSTREAM3DATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM3DATIPROC.class, fi, constants$508.PFNGLVERTEXSTREAM3DATIPROC$FUNC, "(IDDD)V", scope);
    }
    static PFNGLVERTEXSTREAM3DATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, double x1, double x2, double x3) -> {
            try {
                constants$508.PFNGLVERTEXSTREAM3DATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


