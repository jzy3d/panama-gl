// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIBL1I64NVPROC {

    void apply(int x0, long x1);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBL1I64NVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBL1I64NVPROC.class, fi, constants$924.PFNGLVERTEXATTRIBL1I64NVPROC$FUNC, "(IJ)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBL1I64NVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBL1I64NVPROC.class, fi, constants$924.PFNGLVERTEXATTRIBL1I64NVPROC$FUNC, "(IJ)V", scope);
    }
    static PFNGLVERTEXATTRIBL1I64NVPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1) -> {
            try {
                constants$924.PFNGLVERTEXATTRIBL1I64NVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


