// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCREATESAMPLERSPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLCREATESAMPLERSPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCREATESAMPLERSPROC.class, fi, constants$386.PFNGLCREATESAMPLERSPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCREATESAMPLERSPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCREATESAMPLERSPROC.class, fi, constants$386.PFNGLCREATESAMPLERSPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCREATESAMPLERSPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$386.PFNGLCREATESAMPLERSPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

