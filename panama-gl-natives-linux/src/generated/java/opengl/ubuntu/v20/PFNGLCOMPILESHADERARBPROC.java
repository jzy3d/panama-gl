// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOMPILESHADERARBPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLCOMPILESHADERARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOMPILESHADERARBPROC.class, fi, constants$359.PFNGLCOMPILESHADERARBPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLCOMPILESHADERARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOMPILESHADERARBPROC.class, fi, constants$359.PFNGLCOMPILESHADERARBPROC$FUNC, "(I)V", scope);
    }
    static PFNGLCOMPILESHADERARBPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$359.PFNGLCOMPILESHADERARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


