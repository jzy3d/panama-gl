// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLXGETSWAPINTERVALMESAPROC {

    int apply();
    static MemoryAddress allocate(PFNGLXGETSWAPINTERVALMESAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXGETSWAPINTERVALMESAPROC.class, fi, constants$1037.PFNGLXGETSWAPINTERVALMESAPROC$FUNC, "()I");
    }
    static MemoryAddress allocate(PFNGLXGETSWAPINTERVALMESAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXGETSWAPINTERVALMESAPROC.class, fi, constants$1037.PFNGLXGETSWAPINTERVALMESAPROC$FUNC, "()I", scope);
    }
    static PFNGLXGETSWAPINTERVALMESAPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                return (int)constants$1037.PFNGLXGETSWAPINTERVALMESAPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


