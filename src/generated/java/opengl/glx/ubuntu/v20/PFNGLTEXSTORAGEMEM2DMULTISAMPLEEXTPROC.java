// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTEXSTORAGEMEM2DMULTISAMPLEEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, byte x5, int x6, long x7);
    static MemoryAddress allocate(PFNGLTEXSTORAGEMEM2DMULTISAMPLEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXSTORAGEMEM2DMULTISAMPLEEXTPROC.class, fi, constants$728.PFNGLTEXSTORAGEMEM2DMULTISAMPLEEXTPROC$FUNC, "(IIIIIBIJ)V");
    }
    static MemoryAddress allocate(PFNGLTEXSTORAGEMEM2DMULTISAMPLEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXSTORAGEMEM2DMULTISAMPLEEXTPROC.class, fi, constants$728.PFNGLTEXSTORAGEMEM2DMULTISAMPLEEXTPROC$FUNC, "(IIIIIBIJ)V", scope);
    }
    static PFNGLTEXSTORAGEMEM2DMULTISAMPLEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, byte x5, int x6, long x7) -> {
            try {
                constants$728.PFNGLTEXSTORAGEMEM2DMULTISAMPLEEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


