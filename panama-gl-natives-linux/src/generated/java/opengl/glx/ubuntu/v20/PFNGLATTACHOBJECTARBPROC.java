// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLATTACHOBJECTARBPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLATTACHOBJECTARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLATTACHOBJECTARBPROC.class, fi, constants$445.PFNGLATTACHOBJECTARBPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLATTACHOBJECTARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLATTACHOBJECTARBPROC.class, fi, constants$445.PFNGLATTACHOBJECTARBPROC$FUNC, "(II)V", scope);
    }
    static PFNGLATTACHOBJECTARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$445.PFNGLATTACHOBJECTARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


