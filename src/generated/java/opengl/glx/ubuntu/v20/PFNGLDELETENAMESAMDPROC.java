// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDELETENAMESAMDPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLDELETENAMESAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETENAMESAMDPROC.class, fi, constants$553.PFNGLDELETENAMESAMDPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDELETENAMESAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETENAMESAMDPROC.class, fi, constants$553.PFNGLDELETENAMESAMDPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDELETENAMESAMDPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$553.PFNGLDELETENAMESAMDPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


