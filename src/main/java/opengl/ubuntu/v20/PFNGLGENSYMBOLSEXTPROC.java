// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGENSYMBOLSEXTPROC {

    int apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLGENSYMBOLSEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENSYMBOLSEXTPROC.class, fi, constants$686.PFNGLGENSYMBOLSEXTPROC$FUNC, "(IIII)I");
    }
    static MemoryAddress allocate(PFNGLGENSYMBOLSEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENSYMBOLSEXTPROC.class, fi, constants$686.PFNGLGENSYMBOLSEXTPROC$FUNC, "(IIII)I", scope);
    }
    static PFNGLGENSYMBOLSEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                return (int)constants$686.PFNGLGENSYMBOLSEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

