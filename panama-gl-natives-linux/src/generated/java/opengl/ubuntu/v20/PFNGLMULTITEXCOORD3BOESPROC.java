// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTITEXCOORD3BOESPROC {

    void apply(int x0, byte x1, byte x2, byte x3);
    static MemoryAddress allocate(PFNGLMULTITEXCOORD3BOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD3BOESPROC.class, fi, constants$407.PFNGLMULTITEXCOORD3BOESPROC$FUNC, "(IBBB)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXCOORD3BOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD3BOESPROC.class, fi, constants$407.PFNGLMULTITEXCOORD3BOESPROC$FUNC, "(IBBB)V", scope);
    }
    static PFNGLMULTITEXCOORD3BOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, byte x1, byte x2, byte x3) -> {
            try {
                constants$407.PFNGLMULTITEXCOORD3BOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

