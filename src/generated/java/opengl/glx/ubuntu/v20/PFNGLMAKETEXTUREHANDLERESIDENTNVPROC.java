// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMAKETEXTUREHANDLERESIDENTNVPROC {

    void apply(long x0);
    static MemoryAddress allocate(PFNGLMAKETEXTUREHANDLERESIDENTNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMAKETEXTUREHANDLERESIDENTNVPROC.class, fi, constants$812.PFNGLMAKETEXTUREHANDLERESIDENTNVPROC$FUNC, "(J)V");
    }
    static MemoryAddress allocate(PFNGLMAKETEXTUREHANDLERESIDENTNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMAKETEXTUREHANDLERESIDENTNVPROC.class, fi, constants$812.PFNGLMAKETEXTUREHANDLERESIDENTNVPROC$FUNC, "(J)V", scope);
    }
    static PFNGLMAKETEXTUREHANDLERESIDENTNVPROC ofAddress(MemoryAddress addr) {
        return (long x0) -> {
            try {
                constants$812.PFNGLMAKETEXTUREHANDLERESIDENTNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


