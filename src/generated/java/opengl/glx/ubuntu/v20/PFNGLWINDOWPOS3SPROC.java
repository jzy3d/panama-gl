// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLWINDOWPOS3SPROC {

    void apply(short x0, short x1, short x2);
    static MemoryAddress allocate(PFNGLWINDOWPOS3SPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3SPROC.class, fi, constants$191.PFNGLWINDOWPOS3SPROC$FUNC, "(SSS)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWPOS3SPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3SPROC.class, fi, constants$191.PFNGLWINDOWPOS3SPROC$FUNC, "(SSS)V", scope);
    }
    static PFNGLWINDOWPOS3SPROC ofAddress(MemoryAddress addr) {
        return (short x0, short x1, short x2) -> {
            try {
                constants$191.PFNGLWINDOWPOS3SPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


