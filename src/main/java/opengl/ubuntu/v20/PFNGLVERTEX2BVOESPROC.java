// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEX2BVOESPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLVERTEX2BVOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEX2BVOESPROC.class, fi, constants$412.PFNGLVERTEX2BVOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLVERTEX2BVOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEX2BVOESPROC.class, fi, constants$412.PFNGLVERTEX2BVOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLVERTEX2BVOESPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$412.PFNGLVERTEX2BVOESPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


