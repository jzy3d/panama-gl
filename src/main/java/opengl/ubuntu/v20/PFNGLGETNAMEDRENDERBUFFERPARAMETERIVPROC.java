// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC.class, fi, constants$284.PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC.class, fi, constants$284.PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$284.PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


