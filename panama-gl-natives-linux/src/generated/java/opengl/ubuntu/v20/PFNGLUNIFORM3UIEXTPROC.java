// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLUNIFORM3UIEXTPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLUNIFORM3UIEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM3UIEXTPROC.class, fi, constants$633.PFNGLUNIFORM3UIEXTPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM3UIEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM3UIEXTPROC.class, fi, constants$633.PFNGLUNIFORM3UIEXTPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLUNIFORM3UIEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$633.PFNGLUNIFORM3UIEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

