// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBINDVERTEXSHADEREXTPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLBINDVERTEXSHADEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDVERTEXSHADEREXTPROC.class, fi, constants$768.PFNGLBINDVERTEXSHADEREXTPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLBINDVERTEXSHADEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDVERTEXSHADEREXTPROC.class, fi, constants$768.PFNGLBINDVERTEXSHADEREXTPROC$FUNC, "(I)V", scope);
    }
    static PFNGLBINDVERTEXSHADEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$768.PFNGLBINDVERTEXSHADEREXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


