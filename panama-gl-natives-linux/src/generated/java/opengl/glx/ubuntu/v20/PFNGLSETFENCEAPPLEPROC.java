// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSETFENCEAPPLEPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLSETFENCEAPPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSETFENCEAPPLEPROC.class, fi, constants$562.PFNGLSETFENCEAPPLEPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLSETFENCEAPPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSETFENCEAPPLEPROC.class, fi, constants$562.PFNGLSETFENCEAPPLEPROC$FUNC, "(I)V", scope);
    }
    static PFNGLSETFENCEAPPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$562.PFNGLSETFENCEAPPLEPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


