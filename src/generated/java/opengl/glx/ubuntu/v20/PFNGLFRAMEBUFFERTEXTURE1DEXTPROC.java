// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLFRAMEBUFFERTEXTURE1DEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLFRAMEBUFFERTEXTURE1DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERTEXTURE1DEXTPROC.class, fi, constants$714.PFNGLFRAMEBUFFERTEXTURE1DEXTPROC$FUNC, "(IIIII)V");
    }
    static MemoryAddress allocate(PFNGLFRAMEBUFFERTEXTURE1DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERTEXTURE1DEXTPROC.class, fi, constants$714.PFNGLFRAMEBUFFERTEXTURE1DEXTPROC$FUNC, "(IIIII)V", scope);
    }
    static PFNGLFRAMEBUFFERTEXTURE1DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4) -> {
            try {
                constants$714.PFNGLFRAMEBUFFERTEXTURE1DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


