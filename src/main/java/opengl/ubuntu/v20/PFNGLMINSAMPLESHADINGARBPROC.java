// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMINSAMPLESHADINGARBPROC {

    void apply(float x0);
    static MemoryAddress allocate(PFNGLMINSAMPLESHADINGARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMINSAMPLESHADINGARBPROC.class, fi, constants$357.PFNGLMINSAMPLESHADINGARBPROC$FUNC, "(F)V");
    }
    static MemoryAddress allocate(PFNGLMINSAMPLESHADINGARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMINSAMPLESHADINGARBPROC.class, fi, constants$357.PFNGLMINSAMPLESHADINGARBPROC$FUNC, "(F)V", scope);
    }
    static PFNGLMINSAMPLESHADINGARBPROC ofAddress(MemoryAddress addr) {
        return (float x0) -> {
            try {
                constants$357.PFNGLMINSAMPLESHADINGARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

