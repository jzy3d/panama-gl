// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGENVERTEXARRAYSAPPLEPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGENVERTEXARRAYSAPPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENVERTEXARRAYSAPPLEPROC.class, fi, constants$482.PFNGLGENVERTEXARRAYSAPPLEPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGENVERTEXARRAYSAPPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENVERTEXARRAYSAPPLEPROC.class, fi, constants$482.PFNGLGENVERTEXARRAYSAPPLEPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGENVERTEXARRAYSAPPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$482.PFNGLGENVERTEXARRAYSAPPLEPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


