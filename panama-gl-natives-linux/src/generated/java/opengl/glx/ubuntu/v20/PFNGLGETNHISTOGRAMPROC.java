// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETNHISTOGRAMPROC {

    void apply(int x0, byte x1, int x2, int x3, int x4, jdk.incubator.foreign.MemoryAddress x5);
    static MemoryAddress allocate(PFNGLGETNHISTOGRAMPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETNHISTOGRAMPROC.class, fi, constants$395.PFNGLGETNHISTOGRAMPROC$FUNC, "(IBIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETNHISTOGRAMPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETNHISTOGRAMPROC.class, fi, constants$395.PFNGLGETNHISTOGRAMPROC$FUNC, "(IBIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETNHISTOGRAMPROC ofAddress(MemoryAddress addr) {
        return (int x0, byte x1, int x2, int x3, int x4, jdk.incubator.foreign.MemoryAddress x5) -> {
            try {
                constants$395.PFNGLGETNHISTOGRAMPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


