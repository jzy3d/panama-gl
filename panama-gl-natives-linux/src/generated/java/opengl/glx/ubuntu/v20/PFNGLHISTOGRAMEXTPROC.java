// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLHISTOGRAMEXTPROC {

    void apply(int x0, int x1, int x2, byte x3);
    static MemoryAddress allocate(PFNGLHISTOGRAMEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLHISTOGRAMEXTPROC.class, fi, constants$723.PFNGLHISTOGRAMEXTPROC$FUNC, "(IIIB)V");
    }
    static MemoryAddress allocate(PFNGLHISTOGRAMEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLHISTOGRAMEXTPROC.class, fi, constants$723.PFNGLHISTOGRAMEXTPROC$FUNC, "(IIIB)V", scope);
    }
    static PFNGLHISTOGRAMEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, byte x3) -> {
            try {
                constants$723.PFNGLHISTOGRAMEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


