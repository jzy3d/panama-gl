// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMULTITEXCOORD3SARBPROC {

    void apply(int x0, short x1, short x2, short x3);
    static MemoryAddress allocate(PFNGLMULTITEXCOORD3SARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD3SARBPROC.class, fi, constants$173.PFNGLMULTITEXCOORD3SARBPROC$FUNC, "(ISSS)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXCOORD3SARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD3SARBPROC.class, fi, constants$173.PFNGLMULTITEXCOORD3SARBPROC$FUNC, "(ISSS)V", scope);
    }
    static PFNGLMULTITEXCOORD3SARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, short x1, short x2, short x3) -> {
            try {
                constants$173.PFNGLMULTITEXCOORD3SARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


