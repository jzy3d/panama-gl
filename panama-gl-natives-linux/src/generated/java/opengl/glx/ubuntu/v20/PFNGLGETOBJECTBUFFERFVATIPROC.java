// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETOBJECTBUFFERFVATIPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETOBJECTBUFFERFVATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETOBJECTBUFFERFVATIPROC.class, fi, constants$582.PFNGLGETOBJECTBUFFERFVATIPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETOBJECTBUFFERFVATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETOBJECTBUFFERFVATIPROC.class, fi, constants$582.PFNGLGETOBJECTBUFFERFVATIPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETOBJECTBUFFERFVATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$582.PFNGLGETOBJECTBUFFERFVATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


