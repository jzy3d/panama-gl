// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLNAMEDFRAMEBUFFERTEXTURE3DEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5);
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERTEXTURE3DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERTEXTURE3DEXTPROC.class, fi, constants$682.PFNGLNAMEDFRAMEBUFFERTEXTURE3DEXTPROC$FUNC, "(IIIIII)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERTEXTURE3DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERTEXTURE3DEXTPROC.class, fi, constants$682.PFNGLNAMEDFRAMEBUFFERTEXTURE3DEXTPROC$FUNC, "(IIIIII)V", scope);
    }
    static PFNGLNAMEDFRAMEBUFFERTEXTURE3DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5) -> {
            try {
                constants$682.PFNGLNAMEDFRAMEBUFFERTEXTURE3DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


