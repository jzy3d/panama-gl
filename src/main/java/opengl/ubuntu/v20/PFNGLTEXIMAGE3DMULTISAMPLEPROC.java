// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTEXIMAGE3DMULTISAMPLEPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, byte x6);
    static MemoryAddress allocate(PFNGLTEXIMAGE3DMULTISAMPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXIMAGE3DMULTISAMPLEPROC.class, fi, constants$183.PFNGLTEXIMAGE3DMULTISAMPLEPROC$FUNC, "(IIIIIIB)V");
    }
    static MemoryAddress allocate(PFNGLTEXIMAGE3DMULTISAMPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXIMAGE3DMULTISAMPLEPROC.class, fi, constants$183.PFNGLTEXIMAGE3DMULTISAMPLEPROC$FUNC, "(IIIIIIB)V", scope);
    }
    static PFNGLTEXIMAGE3DMULTISAMPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, byte x6) -> {
            try {
                constants$183.PFNGLTEXIMAGE3DMULTISAMPLEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

