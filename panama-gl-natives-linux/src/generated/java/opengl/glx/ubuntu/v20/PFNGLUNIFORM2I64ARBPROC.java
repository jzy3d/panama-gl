// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLUNIFORM2I64ARBPROC {

    void apply(int x0, long x1, long x2);
    static MemoryAddress allocate(PFNGLUNIFORM2I64ARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM2I64ARBPROC.class, fi, constants$416.PFNGLUNIFORM2I64ARBPROC$FUNC, "(IJJ)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM2I64ARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM2I64ARBPROC.class, fi, constants$416.PFNGLUNIFORM2I64ARBPROC$FUNC, "(IJJ)V", scope);
    }
    static PFNGLUNIFORM2I64ARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, long x2) -> {
            try {
                constants$416.PFNGLUNIFORM2I64ARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


