// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETNAMEDPROGRAMLOCALPARAMETERDVEXTPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLGETNAMEDPROGRAMLOCALPARAMETERDVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDPROGRAMLOCALPARAMETERDVEXTPROC.class, fi, constants$593.PFNGLGETNAMEDPROGRAMLOCALPARAMETERDVEXTPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETNAMEDPROGRAMLOCALPARAMETERDVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDPROGRAMLOCALPARAMETERDVEXTPROC.class, fi, constants$593.PFNGLGETNAMEDPROGRAMLOCALPARAMETERDVEXTPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETNAMEDPROGRAMLOCALPARAMETERDVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$593.PFNGLGETNAMEDPROGRAMLOCALPARAMETERDVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


