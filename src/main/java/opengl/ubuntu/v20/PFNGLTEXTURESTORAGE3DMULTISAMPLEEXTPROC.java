// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, byte x7);
    static MemoryAddress allocate(PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC.class, fi, constants$617.PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC$FUNC, "(IIIIIIIB)V");
    }
    static MemoryAddress allocate(PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC.class, fi, constants$617.PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC$FUNC, "(IIIIIIIB)V", scope);
    }
    static PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, byte x7) -> {
            try {
                constants$617.PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


