// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6);
    static MemoryAddress allocate(PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIEXTPROC.class, fi, constants$673.PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIEXTPROC$FUNC, "(IIIIIII)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIEXTPROC.class, fi, constants$673.PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIEXTPROC$FUNC, "(IIIIIII)V", scope);
    }
    static PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6) -> {
            try {
                constants$673.PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


