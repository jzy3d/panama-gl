// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSAMPLEMASKINDEXEDNVPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLSAMPLEMASKINDEXEDNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSAMPLEMASKINDEXEDNVPROC.class, fi, constants$746.PFNGLSAMPLEMASKINDEXEDNVPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLSAMPLEMASKINDEXEDNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSAMPLEMASKINDEXEDNVPROC.class, fi, constants$746.PFNGLSAMPLEMASKINDEXEDNVPROC$FUNC, "(II)V", scope);
    }
    static PFNGLSAMPLEMASKINDEXEDNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$746.PFNGLSAMPLEMASKINDEXEDNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


