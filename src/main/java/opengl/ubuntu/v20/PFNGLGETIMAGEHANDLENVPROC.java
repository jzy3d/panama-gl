// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETIMAGEHANDLENVPROC {

    long apply(int x0, int x1, byte x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLGETIMAGEHANDLENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETIMAGEHANDLENVPROC.class, fi, constants$728.PFNGLGETIMAGEHANDLENVPROC$FUNC, "(IIBII)J");
    }
    static MemoryAddress allocate(PFNGLGETIMAGEHANDLENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETIMAGEHANDLENVPROC.class, fi, constants$728.PFNGLGETIMAGEHANDLENVPROC$FUNC, "(IIBII)J", scope);
    }
    static PFNGLGETIMAGEHANDLENVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, byte x2, int x3, int x4) -> {
            try {
                return (long)constants$728.PFNGLGETIMAGEHANDLENVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


