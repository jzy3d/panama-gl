// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPIXELTEXGENPARAMETERFVSGISPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLPIXELTEXGENPARAMETERFVSGISPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPIXELTEXGENPARAMETERFVSGISPROC.class, fi, constants$972.PFNGLPIXELTEXGENPARAMETERFVSGISPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPIXELTEXGENPARAMETERFVSGISPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPIXELTEXGENPARAMETERFVSGISPROC.class, fi, constants$972.PFNGLPIXELTEXGENPARAMETERFVSGISPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPIXELTEXGENPARAMETERFVSGISPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$972.PFNGLPIXELTEXGENPARAMETERFVSGISPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


