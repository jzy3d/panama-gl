// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCLEARCOLORIIEXTPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLCLEARCOLORIIEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCLEARCOLORIIEXTPROC.class, fi, constants$755.PFNGLCLEARCOLORIIEXTPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLCLEARCOLORIIEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCLEARCOLORIIEXTPROC.class, fi, constants$755.PFNGLCLEARCOLORIIEXTPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLCLEARCOLORIIEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$755.PFNGLCLEARCOLORIIEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


