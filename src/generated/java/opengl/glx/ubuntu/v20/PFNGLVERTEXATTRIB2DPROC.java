// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXATTRIB2DPROC {

    void apply(int x0, double x1, double x2);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB2DPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB2DPROC.class, fi, constants$219.PFNGLVERTEXATTRIB2DPROC$FUNC, "(IDD)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB2DPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB2DPROC.class, fi, constants$219.PFNGLVERTEXATTRIB2DPROC$FUNC, "(IDD)V", scope);
    }
    static PFNGLVERTEXATTRIB2DPROC ofAddress(MemoryAddress addr) {
        return (int x0, double x1, double x2) -> {
            try {
                constants$219.PFNGLVERTEXATTRIB2DPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


