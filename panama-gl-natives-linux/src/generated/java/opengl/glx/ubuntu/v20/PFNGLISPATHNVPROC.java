// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLISPATHNVPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLISPATHNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISPATHNVPROC.class, fi, constants$872.PFNGLISPATHNVPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLISPATHNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISPATHNVPROC.class, fi, constants$872.PFNGLISPATHNVPROC$FUNC, "(I)B", scope);
    }
    static PFNGLISPATHNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$872.PFNGLISPATHNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


