// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCREATESHADEROBJECTARBPROC {

    int apply(int x0);
    static MemoryAddress allocate(PFNGLCREATESHADEROBJECTARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCREATESHADEROBJECTARBPROC.class, fi, constants$444.PFNGLCREATESHADEROBJECTARBPROC$FUNC, "(I)I");
    }
    static MemoryAddress allocate(PFNGLCREATESHADEROBJECTARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCREATESHADEROBJECTARBPROC.class, fi, constants$444.PFNGLCREATESHADEROBJECTARBPROC$FUNC, "(I)I", scope);
    }
    static PFNGLCREATESHADEROBJECTARBPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (int)constants$444.PFNGLCREATESHADEROBJECTARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


