// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTEXTUREIMAGE3DEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, jdk.incubator.foreign.MemoryAddress x10);
    static MemoryAddress allocate(PFNGLTEXTUREIMAGE3DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREIMAGE3DEXTPROC.class, fi, constants$632.PFNGLTEXTUREIMAGE3DEXTPROC$FUNC, "(IIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLTEXTUREIMAGE3DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREIMAGE3DEXTPROC.class, fi, constants$632.PFNGLTEXTUREIMAGE3DEXTPROC$FUNC, "(IIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLTEXTUREIMAGE3DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, jdk.incubator.foreign.MemoryAddress x10) -> {
            try {
                constants$632.PFNGLTEXTUREIMAGE3DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


