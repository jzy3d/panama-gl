// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETOBJECTLABELPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLGETOBJECTLABELPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETOBJECTLABELPROC.class, fi, constants$351.PFNGLGETOBJECTLABELPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETOBJECTLABELPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETOBJECTLABELPROC.class, fi, constants$351.PFNGLGETOBJECTLABELPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETOBJECTLABELPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$351.PFNGLGETOBJECTLABELPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


