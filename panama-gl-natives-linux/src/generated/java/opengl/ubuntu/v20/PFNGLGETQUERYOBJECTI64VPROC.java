// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETQUERYOBJECTI64VPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETQUERYOBJECTI64VPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETQUERYOBJECTI64VPROC.class, fi, constants$190.PFNGLGETQUERYOBJECTI64VPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETQUERYOBJECTI64VPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETQUERYOBJECTI64VPROC.class, fi, constants$190.PFNGLGETQUERYOBJECTI64VPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETQUERYOBJECTI64VPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$190.PFNGLGETQUERYOBJECTI64VPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


