// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLFRAMEBUFFERTEXTUREFACEARBPROC {

    void apply(int x0, int x1, int x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLFRAMEBUFFERTEXTUREFACEARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERTEXTUREFACEARBPROC.class, fi, constants$330.PFNGLFRAMEBUFFERTEXTUREFACEARBPROC$FUNC, "(IIIII)V");
    }
    static MemoryAddress allocate(PFNGLFRAMEBUFFERTEXTUREFACEARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERTEXTUREFACEARBPROC.class, fi, constants$330.PFNGLFRAMEBUFFERTEXTUREFACEARBPROC$FUNC, "(IIIII)V", scope);
    }
    static PFNGLFRAMEBUFFERTEXTUREFACEARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4) -> {
            try {
                constants$330.PFNGLFRAMEBUFFERTEXTUREFACEARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


