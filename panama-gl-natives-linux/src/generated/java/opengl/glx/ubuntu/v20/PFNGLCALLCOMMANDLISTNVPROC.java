// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCALLCOMMANDLISTNVPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLCALLCOMMANDLISTNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCALLCOMMANDLISTNVPROC.class, fi, constants$822.PFNGLCALLCOMMANDLISTNVPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLCALLCOMMANDLISTNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCALLCOMMANDLISTNVPROC.class, fi, constants$822.PFNGLCALLCOMMANDLISTNVPROC$FUNC, "(I)V", scope);
    }
    static PFNGLCALLCOMMANDLISTNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$822.PFNGLCALLCOMMANDLISTNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


