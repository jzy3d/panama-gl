// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface GLVULKANPROCNV {

    void apply();
    static MemoryAddress allocate(GLVULKANPROCNV fi) {
        return RuntimeHelper.upcallStub(GLVULKANPROCNV.class, fi, constants$741.GLVULKANPROCNV$FUNC, "()V");
    }
    static MemoryAddress allocate(GLVULKANPROCNV fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GLVULKANPROCNV.class, fi, constants$741.GLVULKANPROCNV$FUNC, "()V", scope);
    }
    static GLVULKANPROCNV ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$741.GLVULKANPROCNV$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


