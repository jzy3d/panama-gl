// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBUFFERSUBDATAARBPROC {

    void apply(int x0, long x1, long x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLBUFFERSUBDATAARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBUFFERSUBDATAARBPROC.class, fi, constants$468.PFNGLBUFFERSUBDATAARBPROC$FUNC, "(IJJLjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLBUFFERSUBDATAARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBUFFERSUBDATAARBPROC.class, fi, constants$468.PFNGLBUFFERSUBDATAARBPROC$FUNC, "(IJJLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLBUFFERSUBDATAARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, long x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$468.PFNGLBUFFERSUBDATAARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


