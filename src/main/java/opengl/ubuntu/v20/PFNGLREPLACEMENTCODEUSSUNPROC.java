// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLREPLACEMENTCODEUSSUNPROC {

    void apply(short x0);
    static MemoryAddress allocate(PFNGLREPLACEMENTCODEUSSUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUSSUNPROC.class, fi, constants$913.PFNGLREPLACEMENTCODEUSSUNPROC$FUNC, "(S)V");
    }
    static MemoryAddress allocate(PFNGLREPLACEMENTCODEUSSUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUSSUNPROC.class, fi, constants$913.PFNGLREPLACEMENTCODEUSSUNPROC$FUNC, "(S)V", scope);
    }
    static PFNGLREPLACEMENTCODEUSSUNPROC ofAddress(MemoryAddress addr) {
        return (short x0) -> {
            try {
                constants$913.PFNGLREPLACEMENTCODEUSSUNPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


