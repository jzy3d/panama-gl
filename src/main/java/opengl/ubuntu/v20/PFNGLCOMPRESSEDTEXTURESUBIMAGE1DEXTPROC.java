// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCOMPRESSEDTEXTURESUBIMAGE1DEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, jdk.incubator.foreign.MemoryAddress x7);
    static MemoryAddress allocate(PFNGLCOMPRESSEDTEXTURESUBIMAGE1DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXTURESUBIMAGE1DEXTPROC.class, fi, constants$565.PFNGLCOMPRESSEDTEXTURESUBIMAGE1DEXTPROC$FUNC, "(IIIIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCOMPRESSEDTEXTURESUBIMAGE1DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXTURESUBIMAGE1DEXTPROC.class, fi, constants$565.PFNGLCOMPRESSEDTEXTURESUBIMAGE1DEXTPROC$FUNC, "(IIIIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCOMPRESSEDTEXTURESUBIMAGE1DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, jdk.incubator.foreign.MemoryAddress x7) -> {
            try {
                constants$565.PFNGLCOMPRESSEDTEXTURESUBIMAGE1DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


