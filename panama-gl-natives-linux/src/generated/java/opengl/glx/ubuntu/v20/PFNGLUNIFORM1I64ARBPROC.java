// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLUNIFORM1I64ARBPROC {

    void apply(int x0, long x1);
    static MemoryAddress allocate(PFNGLUNIFORM1I64ARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1I64ARBPROC.class, fi, constants$416.PFNGLUNIFORM1I64ARBPROC$FUNC, "(IJ)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM1I64ARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1I64ARBPROC.class, fi, constants$416.PFNGLUNIFORM1I64ARBPROC$FUNC, "(IJ)V", scope);
    }
    static PFNGLUNIFORM1I64ARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1) -> {
            try {
                constants$416.PFNGLUNIFORM1I64ARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

