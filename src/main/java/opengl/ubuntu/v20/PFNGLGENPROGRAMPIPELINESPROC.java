// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGENPROGRAMPIPELINESPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGENPROGRAMPIPELINESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENPROGRAMPIPELINESPROC.class, fi, constants$223.PFNGLGENPROGRAMPIPELINESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGENPROGRAMPIPELINESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENPROGRAMPIPELINESPROC.class, fi, constants$223.PFNGLGENPROGRAMPIPELINESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGENPROGRAMPIPELINESPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$223.PFNGLGENPROGRAMPIPELINESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


