// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBLENDEQUATIONSEPARATEATIPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLBLENDEQUATIONSEPARATEATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBLENDEQUATIONSEPARATEATIPROC.class, fi, constants$1014.PFNGLBLENDEQUATIONSEPARATEATIPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLBLENDEQUATIONSEPARATEATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBLENDEQUATIONSEPARATEATIPROC.class, fi, constants$1014.PFNGLBLENDEQUATIONSEPARATEATIPROC$FUNC, "(II)V", scope);
    }
    static PFNGLBLENDEQUATIONSEPARATEATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$1014.PFNGLBLENDEQUATIONSEPARATEATIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


