// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXATTRIBFORMATNVPROC {

    void apply(int x0, int x1, int x2, byte x3, int x4);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBFORMATNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBFORMATNVPROC.class, fi, constants$848.PFNGLVERTEXATTRIBFORMATNVPROC$FUNC, "(IIIBI)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBFORMATNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBFORMATNVPROC.class, fi, constants$848.PFNGLVERTEXATTRIBFORMATNVPROC$FUNC, "(IIIBI)V", scope);
    }
    static PFNGLVERTEXATTRIBFORMATNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, byte x3, int x4) -> {
            try {
                constants$848.PFNGLVERTEXATTRIBFORMATNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


