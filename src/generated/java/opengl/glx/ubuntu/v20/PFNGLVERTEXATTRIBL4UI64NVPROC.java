// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXATTRIBL4UI64NVPROC {

    void apply(int x0, long x1, long x2, long x3, long x4);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBL4UI64NVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBL4UI64NVPROC.class, fi, constants$928.PFNGLVERTEXATTRIBL4UI64NVPROC$FUNC, "(IJJJJ)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBL4UI64NVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBL4UI64NVPROC.class, fi, constants$928.PFNGLVERTEXATTRIBL4UI64NVPROC$FUNC, "(IJJJJ)V", scope);
    }
    static PFNGLVERTEXATTRIBL4UI64NVPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, long x2, long x3, long x4) -> {
            try {
                constants$928.PFNGLVERTEXATTRIBL4UI64NVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


