// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLISBUFFERRESIDENTNVPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLISBUFFERRESIDENTNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISBUFFERRESIDENTNVPROC.class, fi, constants$905.PFNGLISBUFFERRESIDENTNVPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLISBUFFERRESIDENTNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISBUFFERRESIDENTNVPROC.class, fi, constants$905.PFNGLISBUFFERRESIDENTNVPROC$FUNC, "(I)B", scope);
    }
    static PFNGLISBUFFERRESIDENTNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$905.PFNGLISBUFFERRESIDENTNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


