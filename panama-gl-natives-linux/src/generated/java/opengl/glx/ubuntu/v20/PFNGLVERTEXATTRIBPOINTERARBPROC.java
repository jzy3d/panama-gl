// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIBPOINTERARBPROC {

    void apply(int x0, int x1, int x2, byte x3, int x4, jdk.incubator.foreign.MemoryAddress x5);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBPOINTERARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBPOINTERARBPROC.class, fi, constants$482.PFNGLVERTEXATTRIBPOINTERARBPROC$FUNC, "(IIIBILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBPOINTERARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBPOINTERARBPROC.class, fi, constants$482.PFNGLVERTEXATTRIBPOINTERARBPROC$FUNC, "(IIIBILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLVERTEXATTRIBPOINTERARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, byte x3, int x4, jdk.incubator.foreign.MemoryAddress x5) -> {
            try {
                constants$482.PFNGLVERTEXATTRIBPOINTERARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


