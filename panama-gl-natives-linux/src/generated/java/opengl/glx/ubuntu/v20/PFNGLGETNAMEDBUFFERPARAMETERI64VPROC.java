// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETNAMEDBUFFERPARAMETERI64VPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETNAMEDBUFFERPARAMETERI64VPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDBUFFERPARAMETERI64VPROC.class, fi, constants$362.PFNGLGETNAMEDBUFFERPARAMETERI64VPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETNAMEDBUFFERPARAMETERI64VPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDBUFFERPARAMETERI64VPROC.class, fi, constants$362.PFNGLGETNAMEDBUFFERPARAMETERI64VPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETNAMEDBUFFERPARAMETERI64VPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$362.PFNGLGETNAMEDBUFFERPARAMETERI64VPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


