// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIVEXTPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIVEXTPROC.class, fi, constants$673.PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIVEXTPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIVEXTPROC.class, fi, constants$673.PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIVEXTPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$673.PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


