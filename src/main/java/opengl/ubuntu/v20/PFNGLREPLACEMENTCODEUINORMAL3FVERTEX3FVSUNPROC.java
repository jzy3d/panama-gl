// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FVSUNPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FVSUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FVSUNPROC.class, fi, constants$925.PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FVSUNPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FVSUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FVSUNPROC.class, fi, constants$925.PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FVSUNPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FVSUNPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$925.PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FVSUNPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

