// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCOMPILECOMMANDLISTNVPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLCOMPILECOMMANDLISTNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOMPILECOMMANDLISTNVPROC.class, fi, constants$737.PFNGLCOMPILECOMMANDLISTNVPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLCOMPILECOMMANDLISTNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOMPILECOMMANDLISTNVPROC.class, fi, constants$737.PFNGLCOMPILECOMMANDLISTNVPROC$FUNC, "(I)V", scope);
    }
    static PFNGLCOMPILECOMMANDLISTNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$737.PFNGLCOMPILECOMMANDLISTNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


