// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPATHSTENCILDEPTHOFFSETNVPROC {

    void apply(float x0, float x1);
    static MemoryAddress allocate(PFNGLPATHSTENCILDEPTHOFFSETNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPATHSTENCILDEPTHOFFSETNVPROC.class, fi, constants$878.PFNGLPATHSTENCILDEPTHOFFSETNVPROC$FUNC, "(FF)V");
    }
    static MemoryAddress allocate(PFNGLPATHSTENCILDEPTHOFFSETNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPATHSTENCILDEPTHOFFSETNVPROC.class, fi, constants$878.PFNGLPATHSTENCILDEPTHOFFSETNVPROC$FUNC, "(FF)V", scope);
    }
    static PFNGLPATHSTENCILDEPTHOFFSETNVPROC ofAddress(MemoryAddress addr) {
        return (float x0, float x1) -> {
            try {
                constants$878.PFNGLPATHSTENCILDEPTHOFFSETNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


