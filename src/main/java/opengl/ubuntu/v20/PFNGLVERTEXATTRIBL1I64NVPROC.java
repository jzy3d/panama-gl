// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXATTRIBL1I64NVPROC {

    void apply(int x0, long x1);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBL1I64NVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBL1I64NVPROC.class, fi, constants$839.PFNGLVERTEXATTRIBL1I64NVPROC$FUNC, "(IJ)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBL1I64NVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBL1I64NVPROC.class, fi, constants$839.PFNGLVERTEXATTRIBL1I64NVPROC$FUNC, "(IJ)V", scope);
    }
    static PFNGLVERTEXATTRIBL1I64NVPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1) -> {
            try {
                constants$839.PFNGLVERTEXATTRIBL1I64NVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


