// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCREATESHADEROBJECTARBPROC {

    int apply(int x0);
    static MemoryAddress allocate(PFNGLCREATESHADEROBJECTARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCREATESHADEROBJECTARBPROC.class, fi, constants$444.PFNGLCREATESHADEROBJECTARBPROC$FUNC, "(I)I");
    }
    static MemoryAddress allocate(PFNGLCREATESHADEROBJECTARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCREATESHADEROBJECTARBPROC.class, fi, constants$444.PFNGLCREATESHADEROBJECTARBPROC$FUNC, "(I)I", scope);
    }
    static PFNGLCREATESHADEROBJECTARBPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (int)constants$444.PFNGLCREATESHADEROBJECTARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


