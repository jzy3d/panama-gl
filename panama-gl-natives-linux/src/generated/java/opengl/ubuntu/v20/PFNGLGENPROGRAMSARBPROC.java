// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGENPROGRAMSARBPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGENPROGRAMSARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENPROGRAMSARBPROC.class, fi, constants$324.PFNGLGENPROGRAMSARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGENPROGRAMSARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENPROGRAMSARBPROC.class, fi, constants$324.PFNGLGENPROGRAMSARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGENPROGRAMSARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$324.PFNGLGENPROGRAMSARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


