// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETNUNIFORMDVARBPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLGETNUNIFORMDVARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETNUNIFORMDVARBPROC.class, fi, constants$437.PFNGLGETNUNIFORMDVARBPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETNUNIFORMDVARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETNUNIFORMDVARBPROC.class, fi, constants$437.PFNGLGETNUNIFORMDVARBPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETNUNIFORMDVARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$437.PFNGLGETNUNIFORMDVARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


