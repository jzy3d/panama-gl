// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCOLOR3FVERTEX3FVSUNPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLCOLOR3FVERTEX3FVSUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOLOR3FVERTEX3FVSUNPROC.class, fi, constants$1002.PFNGLCOLOR3FVERTEX3FVSUNPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCOLOR3FVERTEX3FVSUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOLOR3FVERTEX3FVSUNPROC.class, fi, constants$1002.PFNGLCOLOR3FVERTEX3FVSUNPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCOLOR3FVERTEX3FVSUNPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$1002.PFNGLCOLOR3FVERTEX3FVSUNPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


