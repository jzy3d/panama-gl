// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBINDFRAMEBUFFERPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLBINDFRAMEBUFFERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDFRAMEBUFFERPROC.class, fi, constants$253.PFNGLBINDFRAMEBUFFERPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLBINDFRAMEBUFFERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDFRAMEBUFFERPROC.class, fi, constants$253.PFNGLBINDFRAMEBUFFERPROC$FUNC, "(II)V", scope);
    }
    static PFNGLBINDFRAMEBUFFERPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$253.PFNGLBINDFRAMEBUFFERPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

