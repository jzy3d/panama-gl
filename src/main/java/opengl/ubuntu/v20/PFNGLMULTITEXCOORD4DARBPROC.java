// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMULTITEXCOORD4DARBPROC {

    void apply(int x0, double x1, double x2, double x3, double x4);
    static MemoryAddress allocate(PFNGLMULTITEXCOORD4DARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD4DARBPROC.class, fi, constants$88.PFNGLMULTITEXCOORD4DARBPROC$FUNC, "(IDDDD)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXCOORD4DARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD4DARBPROC.class, fi, constants$88.PFNGLMULTITEXCOORD4DARBPROC$FUNC, "(IDDDD)V", scope);
    }
    static PFNGLMULTITEXCOORD4DARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, double x1, double x2, double x3, double x4) -> {
            try {
                constants$88.PFNGLMULTITEXCOORD4DARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


