// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDSTRINGARBPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLNAMEDSTRINGARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDSTRINGARBPROC.class, fi, constants$370.PFNGLNAMEDSTRINGARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDSTRINGARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDSTRINGARBPROC.class, fi, constants$370.PFNGLNAMEDSTRINGARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLNAMEDSTRINGARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$370.PFNGLNAMEDSTRINGARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


