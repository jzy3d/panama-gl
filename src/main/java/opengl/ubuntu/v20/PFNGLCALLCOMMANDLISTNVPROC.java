// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCALLCOMMANDLISTNVPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLCALLCOMMANDLISTNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCALLCOMMANDLISTNVPROC.class, fi, constants$737.PFNGLCALLCOMMANDLISTNVPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLCALLCOMMANDLISTNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCALLCOMMANDLISTNVPROC.class, fi, constants$737.PFNGLCALLCOMMANDLISTNVPROC$FUNC, "(I)V", scope);
    }
    static PFNGLCALLCOMMANDLISTNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$737.PFNGLCALLCOMMANDLISTNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


