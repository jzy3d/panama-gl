// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXATTRIB4DNVPROC {

    void apply(int x0, double x1, double x2, double x3, double x4);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB4DNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4DNVPROC.class, fi, constants$949.PFNGLVERTEXATTRIB4DNVPROC$FUNC, "(IDDDD)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB4DNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4DNVPROC.class, fi, constants$949.PFNGLVERTEXATTRIB4DNVPROC$FUNC, "(IDDDD)V", scope);
    }
    static PFNGLVERTEXATTRIB4DNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, double x1, double x2, double x3, double x4) -> {
            try {
                constants$949.PFNGLVERTEXATTRIB4DNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


