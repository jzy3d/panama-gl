// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSECONDARYCOLOR3DEXTPROC {

    void apply(double x0, double x1, double x2);
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3DEXTPROC.class, fi, constants$655.PFNGLSECONDARYCOLOR3DEXTPROC$FUNC, "(DDD)V");
    }
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3DEXTPROC.class, fi, constants$655.PFNGLSECONDARYCOLOR3DEXTPROC$FUNC, "(DDD)V", scope);
    }
    static PFNGLSECONDARYCOLOR3DEXTPROC ofAddress(MemoryAddress addr) {
        return (double x0, double x1, double x2) -> {
            try {
                constants$655.PFNGLSECONDARYCOLOR3DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


