// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC.class, fi, constants$600.PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC.class, fi, constants$600.PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$600.PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


