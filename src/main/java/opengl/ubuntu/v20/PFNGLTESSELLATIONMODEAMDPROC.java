// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTESSELLATIONMODEAMDPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLTESSELLATIONMODEAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTESSELLATIONMODEAMDPROC.class, fi, constants$474.PFNGLTESSELLATIONMODEAMDPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLTESSELLATIONMODEAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTESSELLATIONMODEAMDPROC.class, fi, constants$474.PFNGLTESSELLATIONMODEAMDPROC$FUNC, "(I)V", scope);
    }
    static PFNGLTESSELLATIONMODEAMDPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$474.PFNGLTESSELLATIONMODEAMDPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


