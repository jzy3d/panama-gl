// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBINDRENDERBUFFEREXTPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLBINDRENDERBUFFEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDRENDERBUFFEREXTPROC.class, fi, constants$625.PFNGLBINDRENDERBUFFEREXTPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLBINDRENDERBUFFEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDRENDERBUFFEREXTPROC.class, fi, constants$625.PFNGLBINDRENDERBUFFEREXTPROC$FUNC, "(II)V", scope);
    }
    static PFNGLBINDRENDERBUFFEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$625.PFNGLBINDRENDERBUFFEREXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


