// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGLOBALALPHAFACTORUISUNPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLGLOBALALPHAFACTORUISUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGLOBALALPHAFACTORUISUNPROC.class, fi, constants$997.PFNGLGLOBALALPHAFACTORUISUNPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLGLOBALALPHAFACTORUISUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGLOBALALPHAFACTORUISUNPROC.class, fi, constants$997.PFNGLGLOBALALPHAFACTORUISUNPROC$FUNC, "(I)V", scope);
    }
    static PFNGLGLOBALALPHAFACTORUISUNPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$997.PFNGLGLOBALALPHAFACTORUISUNPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


