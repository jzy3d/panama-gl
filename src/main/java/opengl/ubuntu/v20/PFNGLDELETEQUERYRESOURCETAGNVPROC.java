// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDELETEQUERYRESOURCETAGNVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLDELETEQUERYRESOURCETAGNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETEQUERYRESOURCETAGNVPROC.class, fi, constants$812.PFNGLDELETEQUERYRESOURCETAGNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDELETEQUERYRESOURCETAGNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETEQUERYRESOURCETAGNVPROC.class, fi, constants$812.PFNGLDELETEQUERYRESOURCETAGNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDELETEQUERYRESOURCETAGNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$812.PFNGLDELETEQUERYRESOURCETAGNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


