// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDELETECOMMANDLISTSNVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLDELETECOMMANDLISTSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETECOMMANDLISTSNVPROC.class, fi, constants$735.PFNGLDELETECOMMANDLISTSNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDELETECOMMANDLISTSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETECOMMANDLISTSNVPROC.class, fi, constants$735.PFNGLDELETECOMMANDLISTSNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDELETECOMMANDLISTSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$735.PFNGLDELETECOMMANDLISTSNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


