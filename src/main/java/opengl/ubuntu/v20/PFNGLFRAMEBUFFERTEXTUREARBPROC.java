// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLFRAMEBUFFERTEXTUREARBPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLFRAMEBUFFERTEXTUREARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERTEXTUREARBPROC.class, fi, constants$329.PFNGLFRAMEBUFFERTEXTUREARBPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLFRAMEBUFFERTEXTUREARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERTEXTUREARBPROC.class, fi, constants$329.PFNGLFRAMEBUFFERTEXTUREARBPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLFRAMEBUFFERTEXTUREARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$329.PFNGLFRAMEBUFFERTEXTUREARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


