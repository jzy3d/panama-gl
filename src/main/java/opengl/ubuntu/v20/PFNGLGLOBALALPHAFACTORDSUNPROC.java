// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGLOBALALPHAFACTORDSUNPROC {

    void apply(double x0);
    static MemoryAddress allocate(PFNGLGLOBALALPHAFACTORDSUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGLOBALALPHAFACTORDSUNPROC.class, fi, constants$911.PFNGLGLOBALALPHAFACTORDSUNPROC$FUNC, "(D)V");
    }
    static MemoryAddress allocate(PFNGLGLOBALALPHAFACTORDSUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGLOBALALPHAFACTORDSUNPROC.class, fi, constants$911.PFNGLGLOBALALPHAFACTORDSUNPROC$FUNC, "(D)V", scope);
    }
    static PFNGLGLOBALALPHAFACTORDSUNPROC ofAddress(MemoryAddress addr) {
        return (double x0) -> {
            try {
                constants$911.PFNGLGLOBALALPHAFACTORDSUNPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


