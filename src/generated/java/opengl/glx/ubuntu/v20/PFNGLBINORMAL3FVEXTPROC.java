// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBINORMAL3FVEXTPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLBINORMAL3FVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINORMAL3FVEXTPROC.class, fi, constants$614.PFNGLBINORMAL3FVEXTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLBINORMAL3FVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINORMAL3FVEXTPROC.class, fi, constants$614.PFNGLBINORMAL3FVEXTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLBINORMAL3FVEXTPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$614.PFNGLBINORMAL3FVEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


