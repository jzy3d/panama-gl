// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCOPYBUFFERSUBDATAPROC {

    void apply(int x0, int x1, long x2, long x3, long x4);
    static MemoryAddress allocate(PFNGLCOPYBUFFERSUBDATAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOPYBUFFERSUBDATAPROC.class, fi, constants$261.PFNGLCOPYBUFFERSUBDATAPROC$FUNC, "(IIJJJ)V");
    }
    static MemoryAddress allocate(PFNGLCOPYBUFFERSUBDATAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOPYBUFFERSUBDATAPROC.class, fi, constants$261.PFNGLCOPYBUFFERSUBDATAPROC$FUNC, "(IIJJJ)V", scope);
    }
    static PFNGLCOPYBUFFERSUBDATAPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, long x2, long x3, long x4) -> {
            try {
                constants$261.PFNGLCOPYBUFFERSUBDATAPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


