// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSECONDARYCOLORP3UIPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLSECONDARYCOLORP3UIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLORP3UIPROC.class, fi, constants$288.PFNGLSECONDARYCOLORP3UIPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLSECONDARYCOLORP3UIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLORP3UIPROC.class, fi, constants$288.PFNGLSECONDARYCOLORP3UIPROC$FUNC, "(II)V", scope);
    }
    static PFNGLSECONDARYCOLORP3UIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$288.PFNGLSECONDARYCOLORP3UIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

