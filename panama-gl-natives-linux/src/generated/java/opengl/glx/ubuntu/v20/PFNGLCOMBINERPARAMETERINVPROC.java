// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOMBINERPARAMETERINVPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLCOMBINERPARAMETERINVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOMBINERPARAMETERINVPROC.class, fi, constants$899.PFNGLCOMBINERPARAMETERINVPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLCOMBINERPARAMETERINVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOMBINERPARAMETERINVPROC.class, fi, constants$899.PFNGLCOMBINERPARAMETERINVPROC$FUNC, "(II)V", scope);
    }
    static PFNGLCOMBINERPARAMETERINVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$899.PFNGLCOMBINERPARAMETERINVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


