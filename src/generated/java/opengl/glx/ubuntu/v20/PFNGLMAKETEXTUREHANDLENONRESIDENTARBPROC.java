// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC {

    void apply(long x0);
    static MemoryAddress allocate(PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC.class, fi, constants$399.PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC$FUNC, "(J)V");
    }
    static MemoryAddress allocate(PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC.class, fi, constants$399.PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC$FUNC, "(J)V", scope);
    }
    static PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC ofAddress(MemoryAddress addr) {
        return (long x0) -> {
            try {
                constants$399.PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


