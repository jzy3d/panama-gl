// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETVERTEXARRAYIVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETVERTEXARRAYIVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETVERTEXARRAYIVPROC.class, fi, constants$385.PFNGLGETVERTEXARRAYIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETVERTEXARRAYIVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETVERTEXARRAYIVPROC.class, fi, constants$385.PFNGLGETVERTEXARRAYIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETVERTEXARRAYIVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$385.PFNGLGETVERTEXARRAYIVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

