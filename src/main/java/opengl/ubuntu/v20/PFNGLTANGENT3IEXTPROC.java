// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTANGENT3IEXTPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLTANGENT3IEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTANGENT3IEXTPROC.class, fi, constants$526.PFNGLTANGENT3IEXTPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLTANGENT3IEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTANGENT3IEXTPROC.class, fi, constants$526.PFNGLTANGENT3IEXTPROC$FUNC, "(III)V", scope);
    }
    static PFNGLTANGENT3IEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$526.PFNGLTANGENT3IEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


