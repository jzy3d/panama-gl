// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLRESETMINMAXEXTPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLRESETMINMAXEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLRESETMINMAXEXTPROC.class, fi, constants$638.PFNGLRESETMINMAXEXTPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLRESETMINMAXEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLRESETMINMAXEXTPROC.class, fi, constants$638.PFNGLRESETMINMAXEXTPROC$FUNC, "(I)V", scope);
    }
    static PFNGLRESETMINMAXEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$638.PFNGLRESETMINMAXEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


