// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETCOLORTABLEPARAMETERFVEXTPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETCOLORTABLEPARAMETERFVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETCOLORTABLEPARAMETERFVEXTPROC.class, fi, constants$735.PFNGLGETCOLORTABLEPARAMETERFVEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETCOLORTABLEPARAMETERFVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETCOLORTABLEPARAMETERFVEXTPROC.class, fi, constants$735.PFNGLGETCOLORTABLEPARAMETERFVEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETCOLORTABLEPARAMETERFVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$735.PFNGLGETCOLORTABLEPARAMETERFVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


