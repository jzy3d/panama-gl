// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC.class, fi, constants$364.PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC.class, fi, constants$364.PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC$FUNC, "(II)V", scope);
    }
    static PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$364.PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


