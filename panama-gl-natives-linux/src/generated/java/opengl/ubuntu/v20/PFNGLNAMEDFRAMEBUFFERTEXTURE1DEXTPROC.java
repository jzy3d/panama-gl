// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDFRAMEBUFFERTEXTURE1DEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERTEXTURE1DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERTEXTURE1DEXTPROC.class, fi, constants$596.PFNGLNAMEDFRAMEBUFFERTEXTURE1DEXTPROC$FUNC, "(IIIII)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERTEXTURE1DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERTEXTURE1DEXTPROC.class, fi, constants$596.PFNGLNAMEDFRAMEBUFFERTEXTURE1DEXTPROC$FUNC, "(IIIII)V", scope);
    }
    static PFNGLNAMEDFRAMEBUFFERTEXTURE1DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4) -> {
            try {
                constants$596.PFNGLNAMEDFRAMEBUFFERTEXTURE1DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


