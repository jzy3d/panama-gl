// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETATTRIBLOCATIONPROC {

    int apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGETATTRIBLOCATIONPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETATTRIBLOCATIONPROC.class, fi, constants$119.PFNGLGETATTRIBLOCATIONPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLGETATTRIBLOCATIONPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETATTRIBLOCATIONPROC.class, fi, constants$119.PFNGLGETATTRIBLOCATIONPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLGETATTRIBLOCATIONPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (int)constants$119.PFNGLGETATTRIBLOCATIONPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


