// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXARRAYVERTEXBUFFERPROC {

    void apply(int x0, int x1, int x2, long x3, int x4);
    static MemoryAddress allocate(PFNGLVERTEXARRAYVERTEXBUFFERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYVERTEXBUFFERPROC.class, fi, constants$297.PFNGLVERTEXARRAYVERTEXBUFFERPROC$FUNC, "(IIIJI)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXARRAYVERTEXBUFFERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYVERTEXBUFFERPROC.class, fi, constants$297.PFNGLVERTEXARRAYVERTEXBUFFERPROC$FUNC, "(IIIJI)V", scope);
    }
    static PFNGLVERTEXARRAYVERTEXBUFFERPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, long x3, int x4) -> {
            try {
                constants$297.PFNGLVERTEXARRAYVERTEXBUFFERPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


