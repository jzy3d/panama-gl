// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDELETESEMAPHORESEXTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLDELETESEMAPHORESEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETESEMAPHORESEXTPROC.class, fi, constants$660.PFNGLDELETESEMAPHORESEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDELETESEMAPHORESEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETESEMAPHORESEXTPROC.class, fi, constants$660.PFNGLDELETESEMAPHORESEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDELETESEMAPHORESEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$660.PFNGLDELETESEMAPHORESEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


