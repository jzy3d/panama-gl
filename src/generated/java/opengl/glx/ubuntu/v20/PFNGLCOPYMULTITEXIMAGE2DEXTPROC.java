// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCOPYMULTITEXIMAGE2DEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8);
    static MemoryAddress allocate(PFNGLCOPYMULTITEXIMAGE2DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOPYMULTITEXIMAGE2DEXTPROC.class, fi, constants$642.PFNGLCOPYMULTITEXIMAGE2DEXTPROC$FUNC, "(IIIIIIIII)V");
    }
    static MemoryAddress allocate(PFNGLCOPYMULTITEXIMAGE2DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOPYMULTITEXIMAGE2DEXTPROC.class, fi, constants$642.PFNGLCOPYMULTITEXIMAGE2DEXTPROC$FUNC, "(IIIIIIIII)V", scope);
    }
    static PFNGLCOPYMULTITEXIMAGE2DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8) -> {
            try {
                constants$642.PFNGLCOPYMULTITEXIMAGE2DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


