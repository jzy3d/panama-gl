// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSPRITEPARAMETERFSGIXPROC {

    void apply(int x0, float x1);
    static MemoryAddress allocate(PFNGLSPRITEPARAMETERFSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSPRITEPARAMETERFSGIXPROC.class, fi, constants$905.PFNGLSPRITEPARAMETERFSGIXPROC$FUNC, "(IF)V");
    }
    static MemoryAddress allocate(PFNGLSPRITEPARAMETERFSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSPRITEPARAMETERFSGIXPROC.class, fi, constants$905.PFNGLSPRITEPARAMETERFSGIXPROC$FUNC, "(IF)V", scope);
    }
    static PFNGLSPRITEPARAMETERFSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1) -> {
            try {
                constants$905.PFNGLSPRITEPARAMETERFSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

