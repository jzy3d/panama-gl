// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDPROGRAMSTRINGEXTPROC {

    void apply(int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLNAMEDPROGRAMSTRINGEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDPROGRAMSTRINGEXTPROC.class, fi, constants$591.PFNGLNAMEDPROGRAMSTRINGEXTPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDPROGRAMSTRINGEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDPROGRAMSTRINGEXTPROC.class, fi, constants$591.PFNGLNAMEDPROGRAMSTRINGEXTPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLNAMEDPROGRAMSTRINGEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$591.PFNGLNAMEDPROGRAMSTRINGEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

