// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCREATETEXTURESPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLCREATETEXTURESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCREATETEXTURESPROC.class, fi, constants$370.PFNGLCREATETEXTURESPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCREATETEXTURESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCREATETEXTURESPROC.class, fi, constants$370.PFNGLCREATETEXTURESPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCREATETEXTURESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$370.PFNGLCREATETEXTURESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

