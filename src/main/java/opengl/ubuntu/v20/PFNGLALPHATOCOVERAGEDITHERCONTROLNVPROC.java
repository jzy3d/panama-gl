// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC.class, fi, constants$725.PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC.class, fi, constants$725.PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC$FUNC, "(I)V", scope);
    }
    static PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$725.PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


