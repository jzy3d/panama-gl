// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTESSELLATIONFACTORAMDPROC {

    void apply(float x0);
    static MemoryAddress allocate(PFNGLTESSELLATIONFACTORAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTESSELLATIONFACTORAMDPROC.class, fi, constants$559.PFNGLTESSELLATIONFACTORAMDPROC$FUNC, "(F)V");
    }
    static MemoryAddress allocate(PFNGLTESSELLATIONFACTORAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTESSELLATIONFACTORAMDPROC.class, fi, constants$559.PFNGLTESSELLATIONFACTORAMDPROC$FUNC, "(F)V", scope);
    }
    static PFNGLTESSELLATIONFACTORAMDPROC ofAddress(MemoryAddress addr) {
        return (float x0) -> {
            try {
                constants$559.PFNGLTESSELLATIONFACTORAMDPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


