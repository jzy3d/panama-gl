// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLRENDERGPUMASKNVPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLRENDERGPUMASKNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLRENDERGPUMASKNVPROC.class, fi, constants$754.PFNGLRENDERGPUMASKNVPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLRENDERGPUMASKNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLRENDERGPUMASKNVPROC.class, fi, constants$754.PFNGLRENDERGPUMASKNVPROC$FUNC, "(I)V", scope);
    }
    static PFNGLRENDERGPUMASKNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$754.PFNGLRENDERGPUMASKNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


