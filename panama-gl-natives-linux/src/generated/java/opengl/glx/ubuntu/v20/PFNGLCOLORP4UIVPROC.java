// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOLORP4UIVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLCOLORP4UIVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOLORP4UIVPROC.class, fi, constants$288.PFNGLCOLORP4UIVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCOLORP4UIVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOLORP4UIVPROC.class, fi, constants$288.PFNGLCOLORP4UIVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCOLORP4UIVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$288.PFNGLCOLORP4UIVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

