// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC.class, fi, constants$467.PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;II)V");
    }
    static MemoryAddress allocate(PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC.class, fi, constants$467.PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;II)V", scope);
    }
    static PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1, int x2, int x3) -> {
            try {
                constants$467.PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

