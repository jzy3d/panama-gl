// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBLENDFUNCSEPARATEEXTPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLBLENDFUNCSEPARATEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBLENDFUNCSEPARATEEXTPROC.class, fi, constants$518.PFNGLBLENDFUNCSEPARATEEXTPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLBLENDFUNCSEPARATEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBLENDFUNCSEPARATEEXTPROC.class, fi, constants$518.PFNGLBLENDFUNCSEPARATEEXTPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLBLENDFUNCSEPARATEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$518.PFNGLBLENDFUNCSEPARATEEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


