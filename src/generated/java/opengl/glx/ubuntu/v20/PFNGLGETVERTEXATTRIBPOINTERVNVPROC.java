// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETVERTEXATTRIBPOINTERVNVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETVERTEXATTRIBPOINTERVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETVERTEXATTRIBPOINTERVNVPROC.class, fi, constants$939.PFNGLGETVERTEXATTRIBPOINTERVNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETVERTEXATTRIBPOINTERVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETVERTEXATTRIBPOINTERVNVPROC.class, fi, constants$939.PFNGLGETVERTEXATTRIBPOINTERVNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETVERTEXATTRIBPOINTERVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$939.PFNGLGETVERTEXATTRIBPOINTERVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


