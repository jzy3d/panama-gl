// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCLIENTACTIVEVERTEXSTREAMATIPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLCLIENTACTIVEVERTEXSTREAMATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCLIENTACTIVEVERTEXSTREAMATIPROC.class, fi, constants$600.PFNGLCLIENTACTIVEVERTEXSTREAMATIPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLCLIENTACTIVEVERTEXSTREAMATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCLIENTACTIVEVERTEXSTREAMATIPROC.class, fi, constants$600.PFNGLCLIENTACTIVEVERTEXSTREAMATIPROC$FUNC, "(I)V", scope);
    }
    static PFNGLCLIENTACTIVEVERTEXSTREAMATIPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$600.PFNGLCLIENTACTIVEVERTEXSTREAMATIPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


