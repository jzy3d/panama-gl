// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSECONDARYCOLOR3FEXTPROC {

    void apply(float x0, float x1, float x2);
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3FEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3FEXTPROC.class, fi, constants$656.PFNGLSECONDARYCOLOR3FEXTPROC$FUNC, "(FFF)V");
    }
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3FEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3FEXTPROC.class, fi, constants$656.PFNGLSECONDARYCOLOR3FEXTPROC$FUNC, "(FFF)V", scope);
    }
    static PFNGLSECONDARYCOLOR3FEXTPROC ofAddress(MemoryAddress addr) {
        return (float x0, float x1, float x2) -> {
            try {
                constants$656.PFNGLSECONDARYCOLOR3FEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


