// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLENDPERFMONITORAMDPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLENDPERFMONITORAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLENDPERFMONITORAMDPROC.class, fi, constants$472.PFNGLENDPERFMONITORAMDPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLENDPERFMONITORAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLENDPERFMONITORAMDPROC.class, fi, constants$472.PFNGLENDPERFMONITORAMDPROC$FUNC, "(I)V", scope);
    }
    static PFNGLENDPERFMONITORAMDPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$472.PFNGLENDPERFMONITORAMDPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

