// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMULTITEXCOORD4SARBPROC {

    void apply(int x0, short x1, short x2, short x3, short x4);
    static MemoryAddress allocate(PFNGLMULTITEXCOORD4SARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD4SARBPROC.class, fi, constants$90.PFNGLMULTITEXCOORD4SARBPROC$FUNC, "(ISSSS)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXCOORD4SARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD4SARBPROC.class, fi, constants$90.PFNGLMULTITEXCOORD4SARBPROC$FUNC, "(ISSSS)V", scope);
    }
    static PFNGLMULTITEXCOORD4SARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, short x1, short x2, short x3, short x4) -> {
            try {
                constants$90.PFNGLMULTITEXCOORD4SARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

