// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIBL2I64NVPROC {

    void apply(int x0, long x1, long x2);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBL2I64NVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBL2I64NVPROC.class, fi, constants$839.PFNGLVERTEXATTRIBL2I64NVPROC$FUNC, "(IJJ)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBL2I64NVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBL2I64NVPROC.class, fi, constants$839.PFNGLVERTEXATTRIBL2I64NVPROC$FUNC, "(IJJ)V", scope);
    }
    static PFNGLVERTEXATTRIBL2I64NVPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, long x2) -> {
            try {
                constants$839.PFNGLVERTEXATTRIBL2I64NVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


