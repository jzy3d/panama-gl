// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLREPLACEMENTCODEUIVERTEX3FVSUNPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLREPLACEMENTCODEUIVERTEX3FVSUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUIVERTEX3FVSUNPROC.class, fi, constants$923.PFNGLREPLACEMENTCODEUIVERTEX3FVSUNPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLREPLACEMENTCODEUIVERTEX3FVSUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUIVERTEX3FVSUNPROC.class, fi, constants$923.PFNGLREPLACEMENTCODEUIVERTEX3FVSUNPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLREPLACEMENTCODEUIVERTEX3FVSUNPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$923.PFNGLREPLACEMENTCODEUIVERTEX3FVSUNPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


