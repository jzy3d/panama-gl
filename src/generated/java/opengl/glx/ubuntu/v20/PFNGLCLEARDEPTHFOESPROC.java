// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCLEARDEPTHFOESPROC {

    void apply(float x0);
    static MemoryAddress allocate(PFNGLCLEARDEPTHFOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCLEARDEPTHFOESPROC.class, fi, constants$533.PFNGLCLEARDEPTHFOESPROC$FUNC, "(F)V");
    }
    static MemoryAddress allocate(PFNGLCLEARDEPTHFOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCLEARDEPTHFOESPROC.class, fi, constants$533.PFNGLCLEARDEPTHFOESPROC$FUNC, "(F)V", scope);
    }
    static PFNGLCLEARDEPTHFOESPROC ofAddress(MemoryAddress addr) {
        return (float x0) -> {
            try {
                constants$533.PFNGLCLEARDEPTHFOESPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


